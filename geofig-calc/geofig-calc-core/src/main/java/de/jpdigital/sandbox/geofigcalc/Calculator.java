package de.jpdigital.sandbox.geofigcalc;

import java.util.Iterator;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.enterprise.util.AnnotationLiteral;
import javax.inject.Inject;

/**
 * Calculator for figures. Retrieves all available implementations of {@link FigureCalculator} 
 * using CDI. The implementations have to be CDI beans of course. Also they
 * must be annotated with the {@link Calculates} annotation.
 * 
 * @author <a href="mailto:jens.pelzetter@googlemail.com">Jens Pelzetter</a>
 */
@RequestScoped
public class Calculator {

    /**
     * Get all available implementations of {@link FigureCalculator}. 
     */
    @Inject
    @Any //The @Any annotation is imported here! Without no beans would be injected!
    private Instance<FigureCalculator<? extends Figure>> calculators;

    public <F extends Figure> Result<F> calculate(final F figure,
                                                  final Class<F> figureClass) {
        //Filter the available implementations to get the calculator for the
        //provided figure.
        final Instance<FigureCalculator<?>> calcs = calculators.select(
            new CalculatesLiteral(figureClass));

        if (calcs.isUnsatisfied()) {
            //If there are no calculators we have a problem...
            throw new IllegalArgumentException(String.format(
                "No calculator for \"%s\" found.", figureClass.getName()));
        } else if (calcs.isAmbiguous()) {
            //If there is more than one calculator for a figure something 
            //is wrong...
            throw new IllegalArgumentException(String.format(
                "More than one calculator for \"%s\" found.",
                figureClass.getName()));
        } else {
            //Get the calculator for the figure and call the calculate method.
            final Iterator<FigureCalculator<? extends Figure>> iterator = calcs
                .iterator();
            @SuppressWarnings("unchecked")
            final FigureCalculator<F> calculator
                                      = (FigureCalculator<F>) iterator.next();

            return calculator.calculate(figure);
        }
    }

    /**
     * {@link AnnotationLiteral} used for filtering the available calculators.
     */
    private static class CalculatesLiteral
        extends AnnotationLiteral<Calculates>
        implements Calculates {

        private static final long serialVersionUID = 7983739126588527349L;

        private final Class<? extends Figure> figureClass;

        public CalculatesLiteral(final Class<? extends Figure> figureClass) {
            this.figureClass = figureClass;
        }

        @Override
        public Class<? extends Figure> value() {
            return figureClass;
        }

    }

}
