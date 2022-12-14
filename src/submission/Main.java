package submission;

import java.lang.reflect.Array;
import java.util.Arrays;

import static submission.QuickSort.quickSort;

public class Main {
    public static void main(String[] args) {
    int[] sample = {1233,2,3,31214,5,5,6,7,7,123,235,567,4,3,2,1};
    quickSort(sample);
    System.out.println(Arrays.toString(sample));
    }
}