package recursion;

public class IfArraySorted {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300, 400, 500};

        System.out.println(checker(arr, 0));
    }

    public static boolean checker(int[] arr, int index) {

        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1] && index < arr.length) {
            return false;
        }

        return checker(arr, index + 1);


    }

}
