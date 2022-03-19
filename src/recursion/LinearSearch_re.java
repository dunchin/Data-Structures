package recursion;

import java.util.ArrayList;

public class LinearSearch_re {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(0);
        arr.add(0);
        arr.add(1);
        int index = 0;
        ArrayList<Integer> tar_arr = new ArrayList<Integer>();
        System.out.println(check(arr, 1, 0));
        System.out.println(checkIndex(arr, 1, 0));
        System.out.println(checkLastIndex(arr,1,4));
        System.out.println(checkAllIndex(arr,1,0,tar_arr));
    }

    public static boolean check(ArrayList<Integer> arr, int target, int index) {
        if (arr.get(index) == target) {
            return true;
        }
        if (arr.get(index) != target && index == arr.size() - 1) {
            return false;
        }
        return check(arr, target, index + 1);
    }

    public static int checkIndex(ArrayList<Integer> arr, int target, int index) {
        if (arr.get(index) == target) {
            return index;
        }
        if (arr.get(index) != target && index == arr.size() - 1) {
            return -1;
        }
        return checkIndex(arr, target, index + 1);
    }

    // start counting from last index.
    public static int checkLastIndex(ArrayList<Integer> arr, int target, int index) {
        if (arr.get(index) == target) {
            return index;
        }
        if (arr.get(index) != target && index == 0) {
            return -1;
        }
        return checkLastIndex(arr, target, index -1);
    }

    public static ArrayList<Integer> checkAllIndex(ArrayList<Integer> arr, int target, int index , ArrayList<Integer> tar_arr) {
        if (arr.get(index) == target && index != arr.size()-1) {
            tar_arr.add(index);
            return checkAllIndex(arr,target,index+1,tar_arr);
        }
        if (index == arr.size()-1) {
            tar_arr.add(index);
            return tar_arr;
        }
        return checkAllIndex(arr, target, index +1,tar_arr);
    }
}
