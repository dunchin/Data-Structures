package recursion;

//Q; given a num , count number of zeroes in it ? 1000 -> num. of zeroes = 3 ;
public class CountNumberOfZeroes {
    private static int count;

    public static void main(String[] args) {
        numOfZeroes(30204);
        System.out.println(count);

        System.out.println(numOfZeroes1(30204,0));
    }

    //int count =0;
    public static void numOfZeroes(int n) {
        if (n % 10 == n) {
            return;
        }
        if (n % 10 == 0) {
            count = count + 1;
        }
        numOfZeroes(n / 10);
    }
    public static int numOfZeroes1(int n, int count) {
        if (n == 0) {
            return count;
        }
        else if(n%10 == 0){
             return numOfZeroes1(n/10, count+1);
        }
        else if(n%10 != 0){
            return numOfZeroes1(n/10, count);
        }

        return 0;
    }


}
