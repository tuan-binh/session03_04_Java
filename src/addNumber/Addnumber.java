package addNumber;

import java.util.Arrays;
import java.util.Scanner;

public class Addnumber {
   public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
      Scanner sc = new Scanner(System.in);
      int[] newArr = new int[arr.length + 1];
      System.out.print("Nhập vào index bạn muốn chèn: ");
      int index = Integer.parseInt(sc.nextLine());
      System.out.print("Nhập vào value bạn muốn chèn: ");
      int value = Integer.parseInt(sc.nextLine());
      for (int i = 0; i < newArr.length; i++) {
         if (i == index) {
            newArr[i] = value;
         } else if (i < index) {
            newArr[i] = arr[i];
         } else {
            newArr[i] = arr[i - 1];
         }
      }
      System.out.println(Arrays.toString(newArr));
   }
}
