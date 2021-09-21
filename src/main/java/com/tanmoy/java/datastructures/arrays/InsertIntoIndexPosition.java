package com.tanmoy.java.datastructures.arrays;

import java.util.Arrays;

/**
 * @author Tanmoy Mukherjee
 * Insert an element in a specific index position
 */
public class InsertIntoIndexPosition {
    private static int [] arr = new int[]{2,4,7,8,9};
    public static void main(String[] args) {
        System.out.println("arr.length = " + arr.length);
        int[] ints = insertIntoArray(4, 10);
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));
    }

    public static int[] insertIntoArray(int indexPosition , int element){
        int [] newArray =new int[(arr.length)+1];
        System.out.println("newArray.length = " + newArray.length);
        for(int i=0;i<arr.length+1;i++){
            if(i<indexPosition){
                newArray[i]=arr[i];
            }
            else if(i == (indexPosition)){
                newArray[i]=element;
            }
            else{
                newArray[i] = arr[i-1];
            }
        }
        return  newArray;
    }


    public static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("i = " + arr[i]);
        }
    }

}
