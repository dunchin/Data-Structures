package recursion;

public class IfArraySorted {
    public static void main(String[] args) {
        int[] arr = {100, 2000, 300, 400, 500};

        System.out.println(checker(arr, 0));
    }

    public static boolean checker(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] >= arr[index + 1]) {
            return false;
        }
        return checker(arr, index + 1);
    }

}
