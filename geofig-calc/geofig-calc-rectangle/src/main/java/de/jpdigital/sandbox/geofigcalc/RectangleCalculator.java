package de.jpdigital.sandbox.geofigcalc;

import java.math.BigDecimal;

import javax.enterprise.context.RequestScoped;

/**
 *
 * @author <a href="mailto:jens.pelzetter@googlemail.com">Jens Pelzetter</a>
 */
@RequestScoped
@Calculates(Rectangle.class)
public class RectangleCalculator implements FigureCalculator<Rectangle>{

    @Override
    public Result<Rectangle> calculate(final Rectangle figure) {
        final BigDecimal area = figure.getWidth().multiply(figure.getHeight());
        
        final BigDecimal perimeter = figure.getWidth().add(figure.getHeight()).multiply(BigDecimal.valueOf(2));
        
        return new Result<>(figure, area, perimeter);
    }
    
    
    
}
