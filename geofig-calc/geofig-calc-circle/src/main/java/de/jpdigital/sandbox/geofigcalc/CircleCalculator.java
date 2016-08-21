package de.jpdigital.sandbox.geofigcalc;

import java.math.BigDecimal;

import javax.enterprise.context.RequestScoped;

/**
 * An implementation of the {@link FigureCalculator} for the a circle.
 * 
 * @author <a href="mailto:jens.pelzetter@googlemail.com">Jens Pelzetter</a>
 */
@RequestScoped
@Calculates(Circle.class)
public class CircleCalculator implements FigureCalculator<Circle> {

    @Override
    public Result<Circle> calculate(final Circle figure) {
        final BigDecimal area = figure.getRadius()
            .pow(2)
            .multiply(BigDecimal.valueOf(Math.PI));

        final BigDecimal perimeter = figure.getRadius()
            .multiply(BigDecimal.valueOf(Math.PI))
            .multiply(BigDecimal.valueOf(2));
        
        return new Result<>(figure, area, perimeter);
    }

}
