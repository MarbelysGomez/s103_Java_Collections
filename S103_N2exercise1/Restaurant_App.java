package s103_Java_Collections.S103_N2exercise1;

import java.util.HashSet;
import java.util.Set;

public class Restaurant_App {
    public static void main(String[] args) {

        Set<Restaurant> restaurantSet = new HashSet<>();

        restaurantSet.add(new Restaurant("Bar Tossa de Mar", 6));
        restaurantSet.add(new Restaurant("Bar Calella de Palafrugell", 9));
        restaurantSet.add(new Restaurant("Bar Cadaqués", 8));

        restaurantSet.add(new Restaurant("Restaurant Barcelona", 6));
        restaurantSet.add(new Restaurant("Restaurant Barcelona", 7));

        restaurantSet.add(new Restaurant("Cafe Caracas", 10));
        restaurantSet.add(new Restaurant("Cafe Caracas", 10));

        for (Restaurant restaurant : restaurantSet){
            System.out.println(restaurant.getName() + ", Score: " + restaurant.getScore());
        }
    }
}
