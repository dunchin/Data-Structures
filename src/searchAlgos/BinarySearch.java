package searchAlgos;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int start = 0;
        int end = arr.length - 1;
        int x = 99;
        System.out.println(element(arr, x, start, end));
    }

    public static boolean element(int[] arr1, int x, int start, int end) {


        if (start > end) {
            return false;
        }

        int mid = start + (end - start) / 2;

        if (arr1[mid] == x) {
            return true;
        } else if (arr1[mid] > x) {
            return element(arr1, x, start, mid - 1);
        }

        return element(arr1, x, mid + 1, end);


    }

}
