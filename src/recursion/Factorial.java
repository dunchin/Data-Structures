package recursion;

//Q Factorial of number , i.e. for 5 = 120 ;
public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
    public static int factorial(int fact){
        if(fact ==0){
            return 1;
        }
        return  fact * factorial(fact-1);
    }
}
