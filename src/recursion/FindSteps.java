package recursion;
// Number of steps so that a number could be reduced to zero ,if num is even divide it to half ,if its not subtract one from it.
public class FindSteps {
    public static void main(String[] args) {
        System.out.println(steps(1000, 0));
    }

    public static int steps(int num, int count) {
        if (num == 0) {
            return count;
        }
        if (num % 2 == 0) {
            return steps(num / 2, count + 1);
        }

        return steps(num - 1, count + 1);

    }


}
