import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        findMin();
  }
  
  public static void findMin(){
      int[] myNum = {94,1, 20, 3, 40, 7};
      int sum = 0;
      for(int i = 0; i < myNum.length; i++){
        sum += myNum[i];
      }
      System.out.println("Sum of All Number is : " + sum);
  }
}
