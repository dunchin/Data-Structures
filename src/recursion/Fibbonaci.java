package recursion;

public class Fibbonaci {
    public static void main(String[] args) {

        System.out.println(fibb(6));

    }

    public static int fibb(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibb(n - 2) + fibb(n - 1);
        }
    }
}
