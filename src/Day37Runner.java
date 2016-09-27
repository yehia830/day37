/**
 * Created by Yehia830 on 9/27/16.
 */
public class Day37Runner {
    public static void main(String[] args) {
        System.out.println("Running ...");
        Day37Runner runner = new Day37Runner();
        System.out.println(runner.recursionTest(0, 3));
    }

    public int recursionTest(int count, int max) {
        System.out.print(count + " ");
        if (count >= max) {
            return count;
        }
        return recursionTest(count+1,max);
    }


}
