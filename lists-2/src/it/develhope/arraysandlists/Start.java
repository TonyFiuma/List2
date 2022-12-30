package it.develhope.arraysandlists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Start{
    public static void main(String[] args){

        List<Integer> divisorsOf52 = new ArrayList<>();
        divisorsOf52.add(1);
        divisorsOf52.add(2);
        divisorsOf52.add(4);
        divisorsOf52.add(13);
        divisorsOf52.add(26);
        divisorsOf52.add(52);

        List<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.add(1);
        randomNumbers.add(60);
        randomNumbers.add(13);
        randomNumbers.add(12);
        // use the .addAll() method to append all the List at the bottom
        randomNumbers.addAll(divisorsOf52);
        System.out.println("The content of randomNumbers is "+randomNumbers
                                   +" the number of items is "+randomNumbers.size());

        // find the positions of the duplicates and remove the first occurrence
        randomNumbers.remove(0);
        randomNumbers.remove(1);
        System.out.println("The content now of randomNumbers is "+randomNumbers);

        // use Collections.reverse() as a comparator for the Collections.sort() method

        Collections.sort(randomNumbers);
        Collections.reverse(randomNumbers);
        System.out.println(randomNumbers);
    }
}
