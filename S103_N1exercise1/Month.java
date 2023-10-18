package s103_Java_Collections.S103_N1exercise1;

import java.util.Objects;

public class Month {
    private String name;

    public Month(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }
    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(!(obj instanceof Month))
            return false;
        Month monthObj = (Month) obj;
        return Objects.equals(getName(), monthObj.getName());
    }
    @Override
    public String toString() {
        return "Month: " + this.name;
    }
}
