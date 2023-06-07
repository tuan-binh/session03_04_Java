package Findmaxtwo;

import java.util.Scanner;

public class Findmaxtwo {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int[] arr = {5, 4, 2, 7, 5, 8, 1, 9, 6, 3};
      
      maxTwo(arr);
      
      System.out.println("Số lớn thứ 2 là : " + arr[arr.length - 2]);
   }
   
   private static void maxTwo(int[] arr) {
      for (int i = 0; i < arr.length; i++) {
         for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] > arr[j]) {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }
         }
      }
   }
   
}
