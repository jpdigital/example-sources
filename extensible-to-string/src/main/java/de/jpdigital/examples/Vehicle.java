package de.jpdigital.examples;

/**
 *
 * @author <a href="mailto:jens.pelzetter@googlemail.com">Jens Pelzetter</a>
 */
public class Vehicle {

    private String name;
    private String brand;
    private int maxSpeed;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(final String brand) {
        this.brand = brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(final int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public final String toString() {
        return toString("");
    }

    public String toString(final String data) {
        return String.format("%s{ name = \"%s\", brand = \"%s\", "
                                 + "maxSpeed = %d%s",
                             super.toString(),
                             name,
                             brand,
                             maxSpeed,
                             data);
    }

}
