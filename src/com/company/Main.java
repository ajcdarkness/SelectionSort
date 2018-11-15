package com.company;

public class Main {

    public static void main(String[] args) {
        int[] nueces = {3 ,6 ,9, 1,2, 7, 8, 11, 23};
        for(int m = 0; m < nueces.length; m++){
            System.out.println(nueces[m]);
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void selectionSort(int[] arr){

    }
}
