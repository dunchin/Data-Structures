package recursion;

//
public class NumberOfStepsToMakeZero {

    private static int count =0;
    public static void main(String[] args) {
        steps(8);
        System.out.println(count);
    }
    public static void steps(int n){
        if(n%2 == 0 && n != 0){
            count = count +1;
            steps(n/2);
        }
        if(n%2 != 0 & n != 0){
            count = count+1;
            steps(n-1);
        }
        if(n==0){
            return;
        }

    }
}
