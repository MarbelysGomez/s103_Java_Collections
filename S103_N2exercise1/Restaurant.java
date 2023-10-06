package s103_Java_Collections.S103_N2exercise1;

import java.util.Objects;

public class Restaurant {
    private final String name;
    private final int score;

    public Restaurant(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return this.name;
    }
    public int getScore() {
        return this.score;
    }
    public boolean equals(Object restObj) {
        if (this == restObj) return true;
        if (restObj == null || getClass() != restObj.getClass()) return false;
        Restaurant that = (Restaurant) restObj;
        return Objects.equals(name,that.name) && score == that.score;
    }
    public int hashCode(){
        return Objects.hash(name, score);
    }
    public String toString(){
        return "The restaurant's name is " + this.name + " and has a score of " + this.score + ".";
    }
}
