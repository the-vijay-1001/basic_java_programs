import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        findMin();
  }
  
  public static void findMin(){
      int[] myNum = {94,1, 20, 3, 40, 7,-7};
      int min = myNum[0];
      for(int i = 0; i < myNum.length; i++){
        if(myNum[i] < min){
            min = myNum[i];
        }
      }
      System.out.println("Min Number is : " + min);
  }
}
