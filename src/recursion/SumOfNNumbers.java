package recursion;

public class SumOfNNumbers {
    public static void main(String[] args) {
        System.out.println(sum(0));
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n + sum(n-1);
    }
}
