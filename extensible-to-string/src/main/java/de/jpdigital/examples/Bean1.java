package de.jpdigital.examples;

/**
 *
 * @author <a href="mailto:jens.pelzetter@googlemail.com">Jens Pelzetter</a>
 */
public class Bean1 {

    private String propertyA;
    private String propertyB;

    public String getPropertyA() {
        return propertyA;
    }

    public void setPropertyA(final String propertyA) {
        this.propertyA = propertyA;
    }

    public String getPropertyB() {
        return propertyB;
    }

    public void setPropertyB(final String propertyB) {
        this.propertyB = propertyB;
    }

    @Override
    public final String toString() {
        return toString("");
    }

    public String toString(final String data) {
        return String.format("%s{ "
                                 + "%s; "
                                 + "%s;"
                                 + "%s }",
                             super.toString(),
                             propertyA,
                             propertyB,
                             data);
    }

}
