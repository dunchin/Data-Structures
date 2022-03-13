package recursion;

public class Concept {

    public static void main(String[] args) {
        System.out.println(fun(5));
    }

    static int fun(int n) {
        if (n == 0) {
            return 0;

        }
        System.out.println(n);
        return fun(n--);

    }
    // if function is mentioned as n-- then it will pass first and subtract later  -- this will throw error as 5 is passed always
    // if function is passed as --n then it will subtract first and then pass the value--this will work as expected upto base condition


}
