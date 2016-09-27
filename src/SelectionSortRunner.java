/**
 * Created by Yehia830 on 9/27/16.
 */
public class SelectionSortRunner extends BaseSorter {
    public static void main(String[] args) {

    }

    public void sort(int[] SelectionSortArray){
        for( int i = 0; i<SelectionSortArray.length - 1; i++){
            int min = i;
            for (int j = i + 1; j < SelectionSortArray.length;j++){
                if(SelectionSortArray[j] < SelectionSortArray[min]){
                    min = j;
                }
                swapNumbers(i,j,SelectionSortArray);
            }


        }


    }

}

