package de.jpdigital.sandbox.geofigcalc;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Bean contains the result from a {@link Calculator} implementation.
 * 
 * @param <F>
 *
 * @author <a href="mailto:jens.pelzetter@googlemail.com">Jens Pelzetter</a>
 */
public final class Result<F extends Figure> {

    private final F figure;
    private final BigDecimal area;
    private final BigDecimal perimeter;

    public Result(final F figure,
                  final BigDecimal area,
                  final BigDecimal perimeter) {
        this.figure = figure;
        this.area = area;
        this.perimeter = perimeter;
    }

    public F getFigure() {
        return figure;
    }

    public BigDecimal getArea() {
        return area;
    }

    public BigDecimal getPerimeter() {
        return perimeter;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(figure);
        hash = 11 * hash + Objects.hashCode(area);
        hash = 11 * hash + Objects.hashCode(perimeter);
        return hash;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Result<?> other = (Result<?>) obj;
        if (!Objects.equals(figure, other.getFigure())) {
            return false;
        }

        if (!Objects.equals(area, other.getArea())) {
            return false;
        }
        return Objects.equals(perimeter, other.getPerimeter());
    }

    @Override
    public String toString() {
        return String.format("%s{ figure = { %s }, "
                                 + "area = %s, "
                                 + "perimeter = %s"
                                 + " }",
                             super.toString(),
                             Objects.toString(figure),
                             area.toPlainString(),
                             area.toPlainString());
    }

}
