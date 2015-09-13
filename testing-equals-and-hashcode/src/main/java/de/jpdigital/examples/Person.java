package de.jpdigital.examples;

import java.util.Objects;

/**
 *
 * @author <a href="mailto:jens.pelzetter@googlemail.com">Jens Pelzetter</a>
 */
public class Person {

    private String givenName;
    private String surname;

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(final String givenName) {
        this.givenName = givenName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(final String surname) {
        this.surname = surname;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(givenName);
        hash = 53 * hash + Objects.hashCode(surname);
        return hash;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        final Person other = (Person) obj;
        if (!other.canEqual(this)) {
            return false;
        }
        
        if (!Objects.equals(givenName, other.getGivenName())) {
            return false;
        }
        
        
        return Objects.equals(surname, other.getSurname());
    }

    public boolean canEqual(final Object obj) {
        return obj instanceof Person;
    }
}
