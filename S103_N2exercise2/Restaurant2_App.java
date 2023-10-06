package s103_Java_Collections.S103_N2exercise2;

import java.util.TreeSet;

public class Restaurant2_App {
    public static void main(String[] args) {

        TreeSet<Restaurant2> restSet = new TreeSet<>();

            Restaurant2 rest1 = new Restaurant2("ITAcademy Coffee shop", 9);
            Restaurant2 rest2 = new Restaurant2("Bar Barcelona Activa", 1);
            Restaurant2 rest3 = new Restaurant2("Restaurant @22", 5);

            restSet.add(rest1);
            restSet.add(rest2);
            restSet.add(rest3);

            for (Restaurant2 restaurant: restSet){
                System.out.println("Name: " + restaurant.getName() + ", Score: " + restaurant.getScore());
            }
    }
}
