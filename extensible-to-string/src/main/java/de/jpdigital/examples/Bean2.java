package de.jpdigital.examples;

/**
 *
 * @author <a href="mailto:jens.pelzetter@googlemail.com">Jens Pelzetter</a>
 */
public class Bean2 extends Bean1 {

    private String propertyC;
    private String propertyD;

    public String getPropertyC() {
        return propertyC;
    }

    public void setPropertyC(final String propertyC) {
        this.propertyC = propertyC;
    }

    public String getPropertyD() {
        return propertyD;
    }

    public void setPropertyD(final String propertyD) {
        this.propertyD = propertyD;
    }

    @Override
    public String toString(final String data) {
        return super.toString(String.format(" %s; "
                                                + "%s;"
                                                + "%s",
                                            propertyC,
                                            propertyD,
                                            data));
    }

}
