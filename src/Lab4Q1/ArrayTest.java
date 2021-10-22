package Lab4Q1;

import java.lang.reflect.Array;

public class ArrayTest {

    int[][] table = new int[10][8]; //field area: a two-dimensional Array

    /**
     * calculate the sum of a two dimension Array
     *
     * @param Array Input an array
     * @return An array containing the sum of each column sum
     */
    public int[] SumTotal(int[][] Array) {

        int[] total = new int[8];
        System.out.println("");
        System.out.println("Sum of each column is: ");
        for (int column = 0; column < 8; column++) {
            for (int row = 0; row < 10; row++) { //the column's sum
                total[column] += Array[row][column];
            }
            System.out.print("|" + total[column]);
        }
        System.out.println("|");
        return total;
    }

    ;

    /**
     * Initiate all random int numbers between [0,99] into a two dimension Array
     *
     * @param a A two dimension Array
     * @return a A fulfilled Array
     */
    public int[][] FillNum(int[][] a) {
        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {
                a[row][column] = (int) (Math.random() * 100);
                System.out.print("|" + a[row][column]); //print them out
            }
            System.out.println("|");
        }

        return a;
    }

    /**
     * Find the biggest number and the index inside an Array
     *
     * @param Array
     */
    public void Compare(int[] Array) {
        int maxRow;
        int indexOfMaxRow;

        maxRow = Array[0];
        indexOfMaxRow = 0;

        for (int i = 1; i < Array.length; i++) {
            if (Array[i] > maxRow) {
                maxRow = Array[i];
                indexOfMaxRow = i;
            }
        }
        System.out.println("The largest row is row:" + indexOfMaxRow + " with total:" + maxRow);

    }


    public static void main(String[] args) {

        ArrayTest Test = new ArrayTest();

        int[][] filledArray = Test.FillNum(Test.table);
        Test.Compare(Test.SumTotal(filledArray));

        // write your code here
    }


}
