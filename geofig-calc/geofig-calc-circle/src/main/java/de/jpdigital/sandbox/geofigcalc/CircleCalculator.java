/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.jpdigital.sandbox.geofigcalc;

import java.math.BigDecimal;

import javax.enterprise.context.RequestScoped;

/**
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
