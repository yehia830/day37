import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Yehia830 on 9/27/16.
 */
public class SortingRunnerTest {
    SortingRunner sortingRunner = new SortingRunner();
    SelectionSortRunner selectionSortRunner = new SelectionSortRunner();
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
    private void assert3ElementOrder(int[] numArray) {
        assertEquals(5, numArray[0]);
        assertEquals(7, numArray[1]);
        assertEquals(19, numArray[2]);
    }
    private void assert4ElementOrder(int[] numArray){
        int[] orderedArray = {5, 7, 19,20};
        selectionSortRunner.selectionSort(orderedArray);
        assert3ElementOrder(orderedArray);

        int[] orderedArray1 = {5, 19, 7,20};
        sortingRunner.bubbleSort(orderedArray);
        assert3ElementOrder(orderedArray);

        int[] scrambledArray2 = {7, 5, 19,20};
        sortingRunner.bubbleSort(scrambledArray2);
        assert3ElementOrder(scrambledArray2);

        int[] scrambledArray3 = {7, 19, 5,20};
        sortingRunner.bubbleSort(scrambledArray3);
        assert3ElementOrder(scrambledArray3);

        int[] scrambledArray4 = {19, 7, 5,20};
        sortingRunner.bubbleSort(scrambledArray4);
        assert3ElementOrder(scrambledArray4);

        int[] scrambledArray5 = {19, 5, 7,20};
        sortingRunner.bubbleSort(scrambledArray5);
        assert3ElementOrder(scrambledArray5);

        int[] scrambledArray6 = {20,19, 5, 7};
        sortingRunner.bubbleSort(scrambledArray5);
        assert3ElementOrder(scrambledArray5);

        int[] scrambledArray7 = {19,20, 5, 7};
        sortingRunner.bubbleSort(scrambledArray5);
        assert3ElementOrder(scrambledArray5);




    }
    @Test
    public void bubbleSort3ElementArray() throws Exception {
        int[] orderedArray = {5, 7, 19};
        sortingRunner.bubbleSort(orderedArray);
        assert3ElementOrder(orderedArray);

        int[] scrambledArray1 = {5, 19, 7};
        sortingRunner.bubbleSort(scrambledArray1);
        assert3ElementOrder(scrambledArray1);

        int[] scrambledArray2 = {7, 5, 19};
        sortingRunner.bubbleSort(scrambledArray2);
        assert3ElementOrder(scrambledArray2);

        int[] scrambledArray3 = {7, 19, 5};
        sortingRunner.bubbleSort(scrambledArray3);
        assert3ElementOrder(scrambledArray3);

        int[] scrambledArray4 = {19, 7, 5};
        sortingRunner.bubbleSort(scrambledArray4);
        assert3ElementOrder(scrambledArray4);

        int[] scrambledArray5 = {19, 5, 7};
        sortingRunner.bubbleSort(scrambledArray5);
        assert3ElementOrder(scrambledArray5);
    }





}