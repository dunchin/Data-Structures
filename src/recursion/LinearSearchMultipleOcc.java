package recursion;

import java.util.ArrayList;

public class LinearSearchMultipleOcc {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(0);
        arr.add(0);
        arr.add(1);
        arr.add(1);
        int index = 0;
        System.out.println(check(arr, 19,0));
    }

    public static boolean check(ArrayList<Integer> arr , int target, int index){
        if(arr.get(index)==target){
            return true;
        }
        if(arr.get(index)!=target && index == arr.size()-1){
            return false;
        }
        return check(arr,target,index+1);
    }
}
