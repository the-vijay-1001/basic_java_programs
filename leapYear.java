import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      System.out.println("Enter any year to check leap year :");

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        isLeap(year);
  }
  
  public static void isLeap(int year){
      if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
          System.out.println("Yes It's a leap year!!");
      }
      else{
          System.out.println("No It's not a leap year!!");
      }
  }
}
