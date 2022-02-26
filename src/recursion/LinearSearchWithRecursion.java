package recursion;

import java.util.ArrayList;

public class LinearSearchWithRecursion {

    public static void main(String[] args) {
        int[] arr = {4100, 4100, 4100, 4100, 4100};
        int count = 0;
        ArrayList<Integer> searchedElement = new ArrayList<>();
        int element = 4100;
        // System.out.println(index(arr, element, count));
        System.out.println(search(arr, element, count, searchedElement));
        System.out.println(search2(arr, element, count));

    }

    public static int index(int[] arr, int element, int count) {
        if (count == arr.length) {
            return -1;
        } else if (count < arr.length && arr[count] != element) {
            return index(arr, element, count + 1);
        } else {
            return count;
        }

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

    public static ArrayList<Integer> search2(int[] arr, int element, int count ) {
        ArrayList<Integer> searchedelements = new ArrayList<>() ;
        if (count == arr.length) {
            return searchedelements;
        } else if (count < arr.length && arr[count] != element) {
            return search2(arr, element, count + 1 );

        } else {
            searchedelements.add(count);
            ArrayList<Integer> allPrevElements = search2(arr, element, count + 1) ;
            searchedelements.addAll(allPrevElements);
            return searchedelements ;

        }

    }

}
