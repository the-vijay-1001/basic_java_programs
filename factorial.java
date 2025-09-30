// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Test{
    void factorial(int num){
        int sum = 1;
        for(int i = 1; i<= num; i++){
            sum *= i;
        }
        System.out.println("factorial of " + num + " is : "+sum);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number To Check Armstrong Number : ");
        int num = sc.nextInt();
        Test obj = new Test();
        obj.factorial(num);
    }
}
