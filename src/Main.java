public class Main {
   public static void main(String[] args) {
//      Lý thuyết Array
//      Khai báo mảng
      int[] arr = {1,2,3,4,5};
      System.out.println(arr[0]);
      test(arr);
      System.out.println(arr[0]);
   }
   
   public static void test(int[] arr) {
      arr[0] = 10;
   }
}
