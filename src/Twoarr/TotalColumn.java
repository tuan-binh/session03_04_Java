package Twoarr;

import java.util.Scanner;

public class TotalColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Mời bạn nhập cột muốn tính tổng: ");
        int column = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][column - 1];
        }
        System.out.println("Tổng = " + sum);
    }
}
