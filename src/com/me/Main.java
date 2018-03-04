package com.me;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //arrays are numbered starting at 0

        //defining an array with the number of ints
        int[] myIntArray = new int[3];  //3 ints in array, although none are assigned values
        myIntArray[0] = 100;         //defining values of individual ints
        myIntArray[1] = 200;
        myIntArray[2] = 300;
        System.out.print(myIntArray[0] + ", "); //no "ln"
        System.out.print(myIntArray[1] + ", ");
        System.out.println(myIntArray[2]);

        int[] myArray1 = {500, 600, 700}; //values assigned in array definition
        System.out.println(myArray1[2]);    //print each value individually
        System.out.println(myArray1[1]);
        System.out.println(myArray1[0]);

        //with double
        double []myDoubleArray = new double[10];
        myDoubleArray[3] = 30;
        System.out.println(myDoubleArray[3]);
        //print result; 30.0

        //with String
        String []myStringArray = {"One", "Two", "Three"};
        System.out.println(myStringArray[0]);

        String []myStringArray1 = new String[3];
        myStringArray1[0] = "One";
        myStringArray1[1] = "Two";
        myStringArray1[2] = "Three";
        System.out.println(myStringArray1[2]);

        String []myStringArray2 = new String[3];
        myStringArray2[0] = "One";
        myStringArray2[1] = "Two";
        myStringArray2[2] = "Three";
        System.out.print(myStringArray2[0] + ", ");
        System.out.print(myStringArray2[1] + ", ");
        System.out.println(myStringArray2[2]);

        char []myCharArray = {'a', 'b', 'c'};
        System.out.println(myCharArray[1]);

        char []myCharArray1 = new char[3];
        myCharArray1[0] = 'e';
        myCharArray1[1] = 'f';
        myCharArray1[2] = 'g';
        System.out.println(myCharArray1[1]);

        System.out.println("----------------------");

        String[] array = new String[]{"Cari", "Maybel", "Jill"};
        System.out.println(Arrays.toString(array));

        System.out.println("-----------------------------");

        char[]printCharArray = new char[]{'x', 'y', 'z'};
        System.out.println(Arrays.toString(printCharArray));

        System.out.println("-------------------------");

        double[] doubleArray = { 7.0, 9.0, 5.0, 1.0, 3.0 };
        System.out.println(Arrays.toString(doubleArray));

        System.out.println("-------------------------------------");

        int[] intArray = { 7, 9, 5, 1, 3 };
        System.out.println(Arrays.toString(intArray));

        System.out.println("--------------------------------------");
        //nested array
        String[][] deepArray = new String[][] {{"John", "Mary"}, {"Alice", "Bob"}};
        System.out.println(Arrays.toString(deepArray));
        System.out.println(Arrays.deepToString(deepArray));
        /*output;
        [[Ljava.lang.String;@f5f2bb7, [Ljava.lang.String;@73035e27]
        [[John, Mary], [Alice, Bob]]*/


    }


}


