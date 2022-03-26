package recursion;
// Q: print from n to one using recursion
public class NToOne {
    public static void main(String[] args) {
        System.out.println("N to One");
        nToOne(8);
        System.out.println();
        System.out.println("One to N");
        oneToN(8);
    }
    public static void nToOne(int n){
        if(n==1){
            System.out.println(1);
            return ;
        }
        System.out.println(n);
        nToOne(n-1);
    }

    public static void oneToN(int n){
       if(n==1){
           System.out.println(n);
           return;
       }

        oneToN(n-1);
        System.out.println(n);
    }

}
