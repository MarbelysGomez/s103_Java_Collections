package s103_Java_Collections.S103_N1exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator {
    public static void main(String[] args) {

        List<Integer> firstList = new ArrayList<>();
        firstList.add(74);
        firstList.add(49);
        firstList.add(447);

        List<Integer> secondList = new ArrayList<>();

        ListIterator<Integer> iteratorObj = firstList.listIterator();

        while (iteratorObj.hasNext()){
           int item = iteratorObj.next();
           secondList.add(0, item);
        }
        System.out.println("First list: " + firstList);
        System.out.println("Second list: " + secondList);
    }
}
