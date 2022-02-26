package recursion;
import java.util.ArrayList;

public class LinearSearchWithRecursion3 {
    public static void main(String[] args) {
        int[] arr = {4100, 4100, 4100, 4100, 4100};
        int count = 0;
        ArrayList<Integer> searchedElement = new ArrayList<>();
        int element = 4100;
        System.out.println(search2(arr, element, count));
    }

    public static ArrayList<Integer> search2(int[] arr, int element, int count) {
        ArrayList<Integer> searchedelements = new ArrayList<>();
        if (count == arr.length) {
            return searchedelements;
        } else if (count < arr.length && arr[count] != element) {
            return search2(arr, element, count + 1);

        } else {
            searchedelements.add(count);
            ArrayList<Integer> allPrevElements = search2(arr, element, count + 1);
            searchedelements.addAll(allPrevElements);
            return searchedelements;

        }

    }

}
