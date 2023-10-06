package s103_Java_Collections.S103_N1exercise1;

import java.util.ArrayList;
import java.util.HashSet;

public class CurrentMonth {
    public static void main(String[] args) {

        ArrayList<Month> list = new ArrayList<>();

        for(int i = 1; i <=12; i++){
            if(i != 8){
                list.add(new Month(i));
            }
        }
        Month august = new Month(8);

        list.add(7, august);

        System.out.println("\nMonths in the ArrayList: ");
        for(Month month: list){
            System.out.println("Month: " + month.getNumber());
        }
        HashSet<Month> monthSet = new HashSet<>(list);

        System.out.println("\nMonths in the HashSet: ");
        for(Month month : monthSet) {
            System.out.println("Month: " + month.getNumber());
        }
    }
}
