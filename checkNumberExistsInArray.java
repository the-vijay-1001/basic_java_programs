import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Any Number to check it exist on the array or not !");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        loop(num);
  }
  
  public static void loop(int num){
      int[] myNum = {10, 20, 30, 40};
      for(int i = 0; i < myNum.length; i++){
          if(myNum[i] == num){
              System.out.println("Yes");
              return;
          }
          continue;
      }
      System.out.println("not exists");
  }
}
