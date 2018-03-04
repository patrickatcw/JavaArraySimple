package com.me;

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


    }


}


