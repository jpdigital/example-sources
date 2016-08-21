package de.jpdigital.sandbox.geofigcalc;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * An implementation of the {@link Circle} interface representing a circle.
 * 
 * @author <a href="mailto:jens.pelzetter@googlemail.com">Jens Pelzetter</a>
 */
public class Circle implements Figure {

    private BigDecimal radius;

    @Override
    public String getName() {
        return "Circle";
    }

    public BigDecimal getRadius() {
        return radius;
    }

    public void setRadius(final BigDecimal radius) {
        this.radius = radius;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(radius);
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
        final Circle other = (Circle) obj;

        return Objects.equals(radius, other.getRadius());
    }

    @Override
    public String toString() {
        return String.format("%s{ "
                                 + "radius = %s"
                                 + " }",
                             super.toString(),
                             radius.toPlainString());
    }

}
