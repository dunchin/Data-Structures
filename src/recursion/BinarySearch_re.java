package recursion;

import java.util.ArrayList;

public class BinarySearch_re {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(100);

        System.out.println(binarySearch(arr,100,0,6));

    }

    public static int binarySearch(ArrayList<Integer> arrayList, int search, int start, int end) {

        int mid = (start + end) / 2;

        if (arrayList.get(mid) == search) {
            return search;
        }
        if (search > arrayList.get(mid)) {
            return binarySearch(arrayList, search, mid + 1, end);
        }
        if (search < arrayList.get(mid)) {
            return binarySearch(arrayList, search, start, mid - 1);
        }
        return 0;
    }

}
