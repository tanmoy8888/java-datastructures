package com.tanmoy.java.datastructures.arrays;

import java.util.Arrays;

/**
 * @author Tanmoy Mukherjee
 * Remove an element from an array
 */
public class RemoveElementbyIndex {

    private static int [] arr = new int[]{2,4,7,8,9};

    public static void main(String[] args) {
        int element =7;
        int[] arrElements = removeAnElementFromArray(element);
        System.out.println("Arrays.toString(arrElements) = " + Arrays.toString(arrElements));
    }
    public static int getIndexofElement(int [] arr,int element){
        int index =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
               index =i;
            }
        }
        return  index;
    }

    public static int[] removeAnElementFromArray(int index){
        int [] newArray =new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++) {
            if (arr[i] < index) {
                newArray[i] = arr[i];
            } else if (i == index) {
                continue;
            } else {
                newArray[i] = arr[i + 1];
            }
        }
       return newArray;
    }

}
