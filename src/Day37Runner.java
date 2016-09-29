/**
 * Created by Yehia830 on 9/27/16.
 */
public class Day37Runner {
    static long tracker = 0;
    static long[] fibarray;
    public static void main(String[] args) {
        System.out.println("Running ...");
        Day37Runner runner = new Day37Runner();
        System.out.println(runner.recursionTest(0, 3));
        System.out.println("The factorial test is.... " + runner.factorial(4));
        System.out.println("The fast Fib..." + runner.getFibSeq(7));
        System.out.println("The tracker is...." + tracker);

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

    public long getFib(long fibNum){

        if(fibNum == 0 || fibNum == 1){
            return fibNum;
        }


       return getFib(fibNum -1) + getFib(fibNum -2);

    }
    public long getFibSeq(long fibSeq){

        return fastFib(0,1,fibSeq);
    }

    public long fastFib(long slider1, long slider2, long fibSeqNum){
        tracker++;

        if(fibSeqNum == 1 || fibSeqNum == 0){
            return slider2;
        }

        long currentFib = slider1 + slider2;

        fibSeqNum --;

        return fastFib(slider2,currentFib,fibSeqNum);

    }






}
