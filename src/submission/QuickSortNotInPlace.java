package submission;
import java.util.ArrayList;
import java.util.List;
public class QuickSortNotInPlace {
public static List<Integer> sort(List<Integer> list) {
    if (list.size() <= 1) {
        return list;
    }

    int pivot = list.get(0);
    List<Integer> lesser = new ArrayList<>();
    List<Integer> greater = new ArrayList<>();
    List<Integer> equal = new ArrayList<>();

    for (int i : list) {
        if (i < pivot) {
            lesser.add(i);
        } else if (i > pivot) {
            greater.add(i);
        } else {
            equal.add(i);
        }
    }

    List<Integer> sorted = sort(lesser);
    sorted.addAll(equal);
    sorted.addAll(sort(greater));

    return sorted;
         }
    }


