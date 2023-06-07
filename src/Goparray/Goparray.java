package Goparray;

import java.util.Arrays;

public class Goparray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};

        int[] newArr = new int[arr1.length + arr2.length];

        for (int i = 0; i < newArr.length; i++) {
            if(i<arr1.length) {
                newArr[i] = arr1[i];
            } else {
                newArr[i] = arr2[i - arr1.length];
            }
        }

        System.out.println(Arrays.toString(newArr));
    }
}
