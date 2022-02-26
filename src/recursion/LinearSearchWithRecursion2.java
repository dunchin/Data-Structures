package recursion;
import java.util.ArrayList;

public class LinearSearchWithRecursion2 {
    public static void main(String[] args) {
        int[] arr = {4100, 4100, 4100, 4100, 4100};
        int count = 0;
        ArrayList<Integer> searchedElement = new ArrayList<>();
        int element = 4100;
        System.out.println(search(arr, element, count, searchedElement));

    }

    public static ArrayList<Integer> search(int[] arr, int element, int count, ArrayList<Integer> searchedelements) {
        if (count == arr.length) {
            return searchedelements;
        } else if (count < arr.length && arr[count] != element) {
            return search(arr, element, count + 1, searchedelements);
        } else {
            searchedelements.add(count);
            return search(arr, element, count + 1, searchedelements);

        }

    }


}
