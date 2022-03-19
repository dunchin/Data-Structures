package recursion;

public class Fibbonaci_re {

    public static void main(String[] args) {
        System.out.println(fibb(6));
    }

    public static int fibb(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        // fibbonaci is needed for both of the numbers not the index to add. instead of result = n-1 + fibb(n-2) ; it will be as below:
        int result = fibb(n - 1) + fibb(n - 2);
        return result;
    }
}
