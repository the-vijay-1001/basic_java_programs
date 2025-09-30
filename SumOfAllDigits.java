// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Test{
    void SumOfAllNumbers(int num){
        int sum = 0;
        while(num > 0){
            sum = sum + (num%10);
            num = num/10;
        }
        System.out.println("Sum of all digits : "+ sum);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Loop : ");
        int num = sc.nextInt();
        Test obj = new Test();
        obj.SumOfAllNumbers(num);
    }
}
