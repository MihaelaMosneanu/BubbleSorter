
import org.example.BubbleSorter;
import org.example.SalesRepresentative;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;


public class BubbleTest {
    @Test
    public void sort_desc_works() {
        Random randomizer = new Random();
        int length = randomizer.nextInt(10, 20);
        SalesRepresentative[] array = new SalesRepresentative[length];
        for (int i = 0; i < length; i++) {
            array[i] = new SalesRepresentative("Dave", randomizer.nextInt(0, 230), randomizer.nextInt(0, 48));
        }

        SalesRepresentative[] copy = Arrays.copyOf(array, array.length);
        Arrays.sort(copy, new Comparator<SalesRepresentative>() {
            @Override
            public int compare(SalesRepresentative o1, SalesRepresentative o2) {

                return o2.getRevenue() - o1.getRevenue();
            }
        });


        BubbleSorter bubbleSorter = new BubbleSorter();
        SalesRepresentative[] sortedArray = bubbleSorter.sort(array);

        Assertions.assertArrayEquals(sortedArray, copy);
    }
}
