package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;


public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 9, 4, 13, 0};
        int[] arr1 = {2, 5, 7, 9};
        int arr2[] = {5, 2, 3, 7, 9, 1};
        int[] arr3 = {4, 5, 1, 2, 7, 9, 3};
        int []arr4={6,3,7,1,2,9,0,3,5,1,2};
        System.out.println(linearSearch(arr, 60));
        System.out.println(binarySearch(arr1, 5));
        bubleSort(arr2);
        System.out.println(Arrays.toString(arr2));
        selectionSort(arr3);
        System.out.println(Arrays.toString(arr3));
        mergeSort(arr4);
        System.out.println(Arrays.toString(arr4));
    }

    public static int linearSearch(int[] arr, int target) {
//        boolean found=false;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
//                found=true;
                return i;
            }
        }
//            } if (!found){
        return -1;
//
//  }
//        return target;
    }

    public static int binarySearch(int[] arr1, int target) {

        int l = 0;
        int r = arr1.length;

        while (l <= r) {
            int m = (l + r) / 2;
            if (arr1[m] == target) {
                return m;
            } else if (arr1[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return -1;
    }

    public static void bubleSort(int[] arr2) {
        for (int j = 0; j < arr2.length - 1; j++) {
            boolean sort = true;
            for (int i = 0; i < arr2.length - 1; i++) {
                if (arr2[i] > arr2[i + 1]) {
                    int temp = arr2[i + 1];
                    arr2[i + 1] = arr2[i];
                    arr2[i] = temp;
                    sort = false;

                }

            }
            if (sort) {
                return;

            }
        }

    }
    public static void selectionSort(int[] arr3) {
        for (int j = 0; j < arr3.length; j++) {
            int minIndex = j;
            for (int i = j; i < arr3.length; i++) {
                if (arr3[i] < arr3[minIndex]) {
                    minIndex = i;
                }
            }
            int temp = arr3[minIndex];
            arr3[minIndex] = arr3[j];
            arr3[j] = temp;

        }

    }

    public static void mergeSort(int[] arr4) {
        if (arr4.length<2){
            return;
        }
        int minIndex= arr4.length;
        int []leftArray= Arrays.copyOfRange(arr4,0,minIndex);
        int[] rightArray=Arrays.copyOfRange(arr4,minIndex,arr4.length);
        mergeSort(leftArray);
        mergeSort(rightArray);
        int l=0,r=0,k=0;
        while (l<leftArray.length&& r<rightArray.length){
            if (leftArray[l]<rightArray[l]){
                arr4[k]=leftArray[l];
                l++;
                k++;
            }else {
                arr4[k]=rightArray[r];
                r++;}
                k++;

            }
        while
        (l<leftArray.length){
            arr4[k]=leftArray.length;
            l++;
            k++;

        }
        while
        (l<rightArray.length){
            arr4[k]=rightArray.length;
            l++;
            k++;

        }
        }



    }
