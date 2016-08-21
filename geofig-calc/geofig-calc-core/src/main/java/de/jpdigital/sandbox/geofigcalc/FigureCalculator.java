package de.jpdigital.sandbox.geofigcalc;

/**
 *
 * Interface for calculators.
 * 
 * @param <F> The implementation of the {@link Figure} interface for which
 * the implementation can calculate area and perimeter.
 *
 * @author <a href="mailto:jens.pelzetter@googlemail.com">Jens Pelzetter</a>
 *
 */
public interface FigureCalculator<F extends Figure> {

    /**
     * Calculates area and perimeter for the provided figure.
     * 
     * @param figure
     * @return 
     */
    Result<F> calculate(F figure);

}
