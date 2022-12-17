package submission;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static submission.QuickSort.quickSort;
import static submission.QuickSortNotInPlace.sortQuick;

public class Main {
    public static void main(String[] args) {
        int[] sizes = {10, 100, 500, 1000, 1500, 2000, 2500, 3000, 5000, 7500, 10000};
        for(int s : sizes) {
            int[] sample =  new Random().ints(s, 0, 10000000).toArray();
            List<Integer> list11 =Arrays.stream(sample).boxed().toList();
//            System.out.println(Arrays.toString(sample));

            final long startTime = System.currentTimeMillis();
            list11 = sortQuick(list11);
            final long endTime = System.currentTimeMillis();
            float a = (endTime - startTime)/ 1000f;
            System.out.println("Total execution time: " + (a));

        }}
}