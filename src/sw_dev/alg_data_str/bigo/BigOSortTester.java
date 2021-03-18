package sw_dev.alg_data_str.bigo;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BigOSortTester {
    public static void main(String[] args) {
        ArrayList<Integer> listToTest = new ArrayList<Integer>();
        final int TEST_SIZE1  = 500000;
        final int TEST_SIZE2  = TEST_SIZE1 * 2;
        final int TEST_SIZE3  = TEST_SIZE2 * 2;
        final int TEST_SIZE4  = TEST_SIZE3 * 2;
        final int TEST_SIZE5  = TEST_SIZE4 * 2;
        final int TEST_SIZE6  = TEST_SIZE5 * 2;
        final int TEST_SIZE7  = TEST_SIZE6 * 2;


        int[] testSizes = {TEST_SIZE1, TEST_SIZE2, TEST_SIZE3, TEST_SIZE4, TEST_SIZE5, TEST_SIZE6, TEST_SIZE7};
        SortAlgorithms sortObject = new SortAlgorithms();
        Timer timer = new Timer();

        for (int currTestSize: testSizes) {
            fillArray(listToTest, currTestSize);
            //Collections.sort(listToTest);

            timer.start();

            //You can uncomment the one you want to test. Please note that
            //the test sizes might have to be changed to convey useful data (refer to the document on
            //the VLE for illustrative test sizes in each case

            sortObject.mergeSort(listToTest);  //This is an O(N*Log(N)) algorithm
            //sortObject.linearDummyAlgorithm(listToTest); //This is an O(N) algorithm
            //sortObject.bubbleSort(listToTest); //This is an O(N^2) algorithm

            //Integer searchKey = currTestSize*5;
            //if(sortObject.binarySearch(listToTest, searchKey)) System.out.println("ERROR");
            timer.stop();

            long timeInMillisecs = TimeUnit.MILLISECONDS.convert(timer.getElapsedTime(), TimeUnit.NANOSECONDS);
            System.out.println("Array: with " + currTestSize + " elements took "
                               + timeInMillisecs + " milliSeconds to complete");
            //System.out.println("Array: with " + currTestSize + " elements took "
            //                          + timer.getElapsedTime() + " nanoSeconds to complete");
        }
    }
    public static void fillArray(ArrayList<Integer> arr, int numOfElements) {
        arr.clear();
        Random rand = new Random();
        for(int i = 0; i< numOfElements; i++) {
            //I use the modulus operator to provide a range
            arr.add(Math.abs( rand.nextInt() % (numOfElements * 4)));
        }
    }
}
