import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Yehia830 on 9/27/16.
 */
public class SortingRunnerTest {
    BaseSorter baseSorter = new BubbleSort();
    BaseSorter baseSorter1 = new SelectionSortRunner();
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
       baseSorter.sort(orderedArray);
        assert3ElementOrder(orderedArray);

        int[] orderedArray1 = {5, 19, 7,20};
        baseSorter.sort(orderedArray);
        assert3ElementOrder(orderedArray);

        int[] scrambledArray2 = {7, 5, 19,20};
        baseSorter.sort(orderedArray);
        assert3ElementOrder(scrambledArray2);

        int[] scrambledArray3 = {7, 19, 5,20};
        baseSorter.sort(orderedArray);
        assert3ElementOrder(scrambledArray3);

        int[] scrambledArray4 = {19, 7, 5,20};
        baseSorter.sort(orderedArray);
        assert3ElementOrder(scrambledArray4);

        int[] scrambledArray5 = {19, 5, 7,20};
        baseSorter.sort(orderedArray);
        assert3ElementOrder(scrambledArray5);

        int[] scrambledArray6 = {20,19, 5, 7};
        baseSorter.sort(orderedArray);
        assert3ElementOrder(scrambledArray5);

        int[] scrambledArray7 = {19,20, 5, 7};
        baseSorter.sort(orderedArray);
        assert3ElementOrder(scrambledArray5);




    }
    @Test
    public void bubbleSort3ElementArray() throws Exception {
        int[] orderedArray = {5, 7, 19};
        baseSorter1.sort(orderedArray);
        assert3ElementOrder(orderedArray);

        int[] scrambledArray1 = {5, 19, 7};
        baseSorter1.sort(orderedArray);
        assert3ElementOrder(scrambledArray1);

        int[] scrambledArray2 = {7, 5, 19};
        baseSorter1.sort(orderedArray);
        assert3ElementOrder(scrambledArray2);

        int[] scrambledArray3 = {7, 19, 5};
        baseSorter1.sort(orderedArray);
        assert3ElementOrder(scrambledArray3);

        int[] scrambledArray4 = {19, 7, 5};
        baseSorter1.sort(orderedArray);
        assert3ElementOrder(scrambledArray4);

        int[] scrambledArray5 = {19, 5, 7};
        baseSorter1.sort(orderedArray);
        assert3ElementOrder(scrambledArray5);
    }





}