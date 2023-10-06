package s103_Java_Collections.S103_N2exercise2;

import java.util.Objects;

public class Restaurant2 implements Comparable<Restaurant2> {
    private String name;
    private int score;

    public Restaurant2(String name, int score){
        this.name = name;
        this.score = score;
    }
    public String getName(){
        return this.name;
    }
    public int getScore(){
        return this.score;
    }
    public boolean equals(Object restObj){
        if (this == restObj) return true;
        if (restObj == null || getClass() != restObj.getClass()) return false;
        Restaurant2 that = (Restaurant2) restObj;
        return Objects.equals(name,that.name) && score == that.score;
    }
    public int hashCode(){
        return Objects.hash(name);
    }
    public int compareTo(Restaurant2 other){
        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison != 0) {
            return nameComparison;
        } else {
            return Integer.compare(this.score, other.score);
        }
    }
}
