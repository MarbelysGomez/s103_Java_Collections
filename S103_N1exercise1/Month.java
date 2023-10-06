package s103_Java_Collections.S103_N1exercise1;

import java.util.Objects;

public class Month {
    private int number;

    public Month(int number){
        this.number = number;
    }
    public int getNumber(){
        return this.number;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Month month = (Month) o;
        return number == month.number;
    }
    public int hashCode() {
        return Objects.hash(number);
    }
    public String toString(){
        return "This month is the: " + number + "th.";
    }
}
