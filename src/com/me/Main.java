package com.me;

public class Main {

    public static void main(String[] args) {

        //arrays are numbered starting at 0

        //defining an array with the number of ints
        int[] myIntArray = new int[3];  //3 ints in array, although none are assigned values
        myIntArray[0] = 10;         //defining values of individual ints
        myIntArray[1] = 20;
        myIntArray[2] = 30;
        System.out.print(myIntArray[0]);   //notice no "ln'
        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[1]);

    }


}


