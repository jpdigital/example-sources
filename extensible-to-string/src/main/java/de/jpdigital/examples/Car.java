package de.jpdigital.examples;

/**
 *
 * @author <a href="mailto:jens.pelzetter@googlemail.com">Jens Pelzetter</a>
 */
public class Car extends Vehicle {

    private int seats;

    public int getSeats() {
        return seats;
    }

    public void setSeats(final int seats) {
        this.seats = seats;
    }

    @Override
    public String toString(final String data) {
        return super.toString(String.format(", seats = %d%s", seats, data));
    }

}
