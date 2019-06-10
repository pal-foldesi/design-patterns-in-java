package structural.flyweight;

import java.util.Objects;

public class Design {
    private final String description;
    private final String location;

    public Design(String description, String location) {
        this.description = description;
        this.location = location;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Design design = (Design) obj;
        return description.equals(design.description) && location.equals(design.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, location);
    }

    @Override
    public String toString() {
        return "description='" + description + '\'' +
                ", location='" + location + '\'';
    }
}
