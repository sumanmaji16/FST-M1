//a program to check if the sum of all the 10's in the array is exactly 30.

package Activities;

import java.util.*;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numArr = {10,77,10,54,-11,10};
		
		System.out.println ("Original Array : " + Arrays.toString(numArr));
		
		int searchNum = 10;
		int sum = 30;
		
		System.out.println("Result : " +result(numArr , searchNum , sum) );
		
		
	}

    public static boolean result(int[] numbers, int searchNum, int sum) {
        int temp_sum = 0;
        //Loop through array
        for (int number : numbers) {
            //If value is 10
            if (number == searchNum) {
                //Add them
                temp_sum += searchNum;
            }

            //Sum should not be more than 30
            if (temp_sum > sum) {
                break;
            }
        }

        //Return true if condition satisfies
        return temp_sum == sum;
    }

}
