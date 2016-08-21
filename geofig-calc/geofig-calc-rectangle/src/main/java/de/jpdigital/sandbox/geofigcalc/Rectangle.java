package de.jpdigital.sandbox.geofigcalc;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * An implementation of the {@link Figure} interface representing a
 * {@link Rectangle}.
 *
 * @author <a href="mailto:jens.pelzetter@googlemail.com">Jens Pelzetter</a>
 */
public class Rectangle implements Figure {

    private BigDecimal width;
    private BigDecimal height;

    @Override
    public String getName() {
        return "Rectangle";
    }

    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(final BigDecimal width) {
        this.width = width;
    }

    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(final BigDecimal height) {
        this.height = height;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(width);
        hash = 71 * hash + Objects.hashCode(height);
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
        final Rectangle other = (Rectangle) obj;
        if (!Objects.equals(width, other.getWidth())) {
            return false;
        }
        return Objects.equals(height, other.getHeight());
    }

    @Override
    public String toString() {
        return String.format("%s{ "
                                     + "width = %s, "
                                     + "height = %s"
                                     + " }",
                             super.toString(),
                             width.toPlainString(),
                             height.toPlainString());
    }

}
