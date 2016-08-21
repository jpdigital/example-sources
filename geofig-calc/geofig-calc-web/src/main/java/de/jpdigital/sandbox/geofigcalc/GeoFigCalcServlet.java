package de.jpdigital.sandbox.geofigcalc;


import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.inject.Inject;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * A simple servlet using the {@link Calculator} class.
 * 
 * @author <a href="mailto:jens.pelzetter@googlemail.com">Jens Pelzetter</a>
 */
@WebServlet(urlPatterns = {"/index.html"})
public class GeoFigCalcServlet extends HttpServlet {

    private static final long serialVersionUID = -1989774801275540350L;

    @Inject
    private transient Calculator calculator;
    
    @Override
    public void doGet(final HttpServletRequest request,
                      final HttpServletResponse response) throws IOException {

        response.setContentType("text/plain");

        final Rectangle rectangle = new Rectangle();
        rectangle.setWidth(BigDecimal.valueOf(10));
        rectangle.setHeight(BigDecimal.valueOf(5));

        final Circle circle = new Circle();
        circle.setRadius(BigDecimal.valueOf(7));

        //Delegate to the Calculator class which does the real work.
        final Result<Rectangle> rectangleResult = calculator.calculate(
            rectangle, Rectangle.class);
        
        //Delegate to the Calculator class which does the real work.
        final Result<Circle> circleResult = calculator.calculate(circle,
                                                                 Circle.class);

        final PrintWriter out = response.getWriter();

        out.write(String.format("Results%n"));
        out.write(String.format("=======%n%n"));
        
        out.write(String.format("Rectangle width = %f; height = %f:%n",
                                rectangle.getWidth(),
                                rectangle.getHeight()));
        out.write(String.format("\tarea = %f; perimeter = %f%n%n",
                                rectangleResult.getArea(),
                                rectangleResult.getPerimeter()));
        
        
        out.write(String.format("Circle radius = %f:%n", circle.getRadius()));
        out.write(String.format("\tarea = %f; perimeter = %f%n%n",
                                circleResult.getArea(),
                                circleResult.getPerimeter()));
        
    }

}
