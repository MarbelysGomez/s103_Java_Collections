package s103_Java_Collections.S103_N2exercise1;

import java.util.Objects;

public class Restaurant {
    private String name;
    private int score;

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
    @Override
    public boolean equals(Object restObj) {
        if (this == restObj) return true;
        if (restObj == null || getClass() != restObj.getClass()) return false;
        Restaurant that = (Restaurant) restObj;
        return score == that.score && Objects.equals(name, that.name);
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, score);
    }
}
