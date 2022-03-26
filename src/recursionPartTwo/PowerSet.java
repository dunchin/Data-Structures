package recursionPartTwo;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        //array.add(3);

        System.out.println(powerset(array));
    }


    public static List<List<Integer>> powerset(List<Integer> array) {
        // Write your code here.
        List<Integer> emptyArray = new ArrayList<Integer>();
        List<List<Integer>> subsets = new ArrayList<>();
        subsets.add(emptyArray);
        int n = array.size() ;
        return powerset(array, subsets, n);
    }

    public static List<List<Integer>> powerset(List<Integer> array, List<List<Integer>> subsets, int n) {
        // subset ke har element me push array's current element
        // last array/ original subset array ko bhi add kar diya
        // fir next element ke liye same function call kar diya

        if (n<=0) {
            return subsets;
        }

        List<List<Integer>> currentSubset = new ArrayList<>();
        currentSubset.addAll(subsets);
        for (int i = 0; i <= subsets.size()-1; i++) {
            subsets.get(i).add(array.get(n-1));
        }
        subsets.addAll(currentSubset);

        return powerset(array, subsets, n - 1);
    }
}



