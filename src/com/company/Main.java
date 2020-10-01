package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] array = { "1", "2", "3", "5" };
        // uncomment below line and comment above line for testing sample test case 2
//      String[] array = { "1", "2", "3", "abc", "5" };
        try {
            System.out.println(calculateSumofNumbers(array));
        }catch (NumberFormatException ne){
            System.out.println("We can catch the NumberFormatException");
        }


    }
    public static int calculateSumofNumbers(String[] array) throws NumberFormatException{
        int sum = 0;
        for (String i : array) {
            /*
             * TODO: Handle the exception thrown during parsing the integer value
             * from string so that sum of all the integer numbers can be calculated
             * successfully in the given array.
             */
            sum += Integer.parseInt(i);
        }

        return sum;
    }
}

