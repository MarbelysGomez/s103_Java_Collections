package s103_Java_Collections.S103_N1exercise1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ArrayList<Month> monthList = new ArrayList<>(11);
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "September",
                "October", "November", "December"};

        for(String month: months) {
                monthList.add(new Month(month));
        }

        monthList.add(7, new Month("August"));

        System.out.println("Months in the ArrayList: ");
        for(Month month: monthList) {
            System.out.println(month.getName());
        }

        HashSet<Month> monthSet = new HashSet<>(monthList);
        monthSet.add(new Month("June"));

        System.out.println("\nMonths in the HashSet: ");
        for(Month month : monthSet) {
            System.out.println(month.getName());
        }

        System.out.println("\nIterating with for loop: ");
        for(int i = 0; i < monthList.size(); i++) {
            System.out.println(monthList.get(i));
        }

        System.out.println("\nIterating with iterator: ");
        Iterator<Month> monthIterator = monthList.iterator();
        while(monthIterator.hasNext()) {
            System.out.println(monthIterator.next().getName());
        }
    }
}
