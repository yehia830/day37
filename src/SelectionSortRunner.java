/**
 * Created by Yehia830 on 9/27/16.
 */
public class SelectionSortRunner {
    public static void main(String[] args) {

    }

    public void selectionSort(int[] selectionSortArray){
        for(int current = 0; current < selectionSortArray.length-1; current++){
            int index = current;
            for(int counter = current + 1; counter < selectionSortArray.length; counter++)
                if(selectionSortArray[counter] < selectionSortArray[index]){
                    index = counter;
                }
            int smallerNumber = selectionSortArray[index];
            selectionSortArray[index] = selectionSortArray[current];
            selectionSortArray[current] = smallerNumber;
        }
    }

}

