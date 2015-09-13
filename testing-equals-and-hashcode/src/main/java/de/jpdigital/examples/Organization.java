package de.jpdigital.examples;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author <a href="mailto:jens.pelzetter@googlemail.com">Jens Pelzetter</a>
 */
public class Organization {
    
    private String name;
    private List<Person> members;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public List<Person> getMembers() {
        return Collections.unmodifiableList(members);
    }

    public void setMembers(final List<Person> members) {
        this.members = members;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Organization)) {
            return false;
        }
        final Organization other = (Organization) obj;
        if (!other.canEqual(this)) {
            return false;
        }
        
        return Objects.equals(this.name, other.getName());
    }
    
    public boolean canEqual(final Object obj) {
        return obj instanceof Organization;
    }
    
}
