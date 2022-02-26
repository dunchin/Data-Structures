package recursion;

public class FindNumberofZeroes {
    public static void main(String[] args) {
        System.out.println(numberofzeroes(300000, 0));
    }

    public static int numberofzeroes(int num, int count) {
        if (num == 0) {
            return count;
        }
        int rem = num % 10;
        if (rem == 0) {
            return numberofzeroes(num / 10, count + 1);
        }
        return numberofzeroes(num / 10, count);


    }

}
