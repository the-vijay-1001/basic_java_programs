import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        loop();
  }
  
  public static void loop(){
      int[] myNum = {94,10, 20, 30, 40, 78};
      int max = 0;
      for(int i = 0; i < myNum.length; i++){
        if(myNum[i] > max){
            max = myNum[i];
        }
      }
      System.out.println("Max Number is : " + max);
  }
}
