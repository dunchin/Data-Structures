package recursion;

import java.util.ArrayList;

public class IfArraySorted_re {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(0);
        arr.add(0);
        arr.add(1);
        arr.add(1);
        int index = 0;
        System.out.println(check(arr, index));
    }

    public static boolean check(ArrayList<Integer> arr, int index) {
        if (arr.get(index) > arr.get(index + 1)) {
            return false;
        }
        if (arr.get(index) <= arr.get(index + 1) && index == arr.size() - 2) {
            return true;
        }
        return check(arr, index + 1);
    }

}
