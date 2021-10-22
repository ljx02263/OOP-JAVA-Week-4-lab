package Week4Demos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 很有借鉴意义的一个例子：（校验）不同的数
 */
public class DistinctNumbers {
    public static void main(String[] args) {

        //Create a new Arraylist with Integer numbers(object)
        ArrayList<Integer> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter integers (input ends with 0): ");
        int value;

        do {
            value = input.nextInt(); // Read a value from the input

            if (!list.contains(value) && value != 0)
                list.add(value); // Add the value if it is not in the list
        } while (value != 0); //if 0, drop out of the loop

        // Display the distinct numbers
        System.out.print("The distinct integers are: ");
        for (int i = 0; i < list.size(); i++) //list.size()
            System.out.print(list.get(i) + " ");
    }
}