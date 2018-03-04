package com.me;

public class Main {

    public static void main(String[] args) {

        //arrays are numbered starting at 0

        //defining an array with the number of ints
        int[] myIntArray = new int[3];  //3 ints in array, although none are assigned values
        myIntArray[0] = 100;         //defining values of individual ints
        myIntArray[1] = 200;
        myIntArray[2] = 300;
        System.out.print(myIntArray[0] + ", ");
        System.out.print(myIntArray[1] + ", ");
        System.out.println(myIntArray[2]);

    }


}


