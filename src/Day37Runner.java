/**
 * Created by Yehia830 on 9/27/16.
 */
public class Day37Runner {
    public static void main(String[] args) {
        System.out.println("Running ...");
        Day37Runner runner = new Day37Runner();
        System.out.println(runner.recursionTest(0, 3));
        System.out.println(runner.factorial(4));
    }

    public int recursionTest(int count, int max) {
        System.out.print(count + " ");
        if (count >= max) {
            return count;
        }
        return recursionTest(count+1,max);
    }

    public int factorial(int fact) {
        if(fact == 0 || fact == 1) {
            return 1;
        }
        int result;
        result = factorial(fact-1) * fact;

        return result;
    }

    


}
