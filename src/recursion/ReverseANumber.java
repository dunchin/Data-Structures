package recursion;

// Q: 12345 - > output: 54321
public class ReverseANumber {

    private static int sum = 0;

    public static void main(String[] args) {
        //-----1------//
        System.out.println(reverse1(12345));

        //-----2------//
        reverse2(23456);
        System.out.println(sum);

        //-----3------//
        System.out.println(reverse3(12345));

    }

    static String reverse1(int n) {
        if (n == 0) {
            return "0";
        }
        return Integer.toString(n % 10) + reverse1(n / 10);
    }

    public static void reverse2(int n){
        if(n==0){
            return;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        reverse2(n/10);
    }

    static int reverse3(int n){
        int digits = (int) ((Math.log10(n))+1);
        return helper(n,digits);
    }

    private static int helper(int n, double digits) {

        if(n%10 == n){
            return n;
        }

        return (int) ((n%10)* Math.pow(10,digits-1) + helper(n/10 , digits-1));
    }

}
