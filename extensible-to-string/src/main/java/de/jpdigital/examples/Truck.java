package de.jpdigital.examples;

/**
 *
 * @author <a href="mailto:jens.pelzetter@googlemail.com">Jens Pelzetter</a>
 */
public class Truck extends Vehicle {

    private int maxLoad;

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(final int maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public String toString(final String data) {
        return super.toString(String.format(", maxLoad = %d%s", maxLoad, data));
    }

}
