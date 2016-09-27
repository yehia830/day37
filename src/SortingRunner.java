/**
 * Created by Yehia830 on 9/27/16.
 */
public class SortingRunner {
    public static void main(String[] args) {


    }
    public void bubbleSort(int[] arrayToSort) {
        int initialMax = arrayToSort.length;
        for (int currentMax = initialMax; currentMax >= 0; currentMax--) {
            for (int counter = 0; counter < currentMax - 1; counter++) {
                if (arrayToSort[counter] > arrayToSort[counter + 1]) {
                    swapNumbers(counter, counter + 1, arrayToSort);
                }
            }
            printNumbers(arrayToSort);
        }
    }
    private static void swapNumbers(int i, int j, int[] array) {

        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printNumbers(int[] input) {

        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }


}
