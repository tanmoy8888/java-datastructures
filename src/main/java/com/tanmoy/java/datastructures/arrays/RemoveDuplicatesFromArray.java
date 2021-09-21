package com.tanmoy.java.datastructures.arrays;

import java.util.Arrays;

/**
 * @author Tanmoy Mukherjee
 * Remove duplicate elements from a given array and return the new array -
 * Use Case : I/P => {1,1,1,2,2,3,3}  , Expected O/P => {1,2,3}
 */
public class RemoveDuplicatesFromArray {
    private static int [] arr = new int[]{1,1,1,2,2,3,3,4};

    public static void main(String[] args) {
        int[] elements = removeDuplicateElementsFromArray(arr);
        Arrays.sort(elements);
        System.out.println("Arrays.toString(elements) = " + Arrays.toString(elements));
    }

    public static int[] removeDuplicateElementsFromArray(int[] arr){
        int index =0;
        int [] newArray = new int[arr.length];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] != arr[i+1]){
                newArray[index++] = arr[i];
                System.out.println("arr[i] = " + arr[i]);
            }
        }
        newArray[index++] = arr[arr.length-1];
        System.out.println("Arrays.toString(newArray) = " + Arrays.toString(newArray));
        int [] finalArray = new int[index];
        for(int i=0;i<index;i++){
            finalArray[i] = newArray[i];
            System.out.println("finalArray[i] = " + finalArray[i]);
        }
        System.out.println("Arrays.toString(v) = " + Arrays.toString(finalArray));
        return finalArray;
    }
}
