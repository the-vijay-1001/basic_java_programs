// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Test{
    void isPrime(int num){
        if(num <= 1){
            System.out.println("Not a prime Number!!!");
            return;
        }
        int newNum = num/2;
        
        while(newNum > 2){
            if(num%newNum == 0){
                System.out.println("Not a prime number!!!");
                return;
            }
            newNum --;
        }
        System.out.println("It is a prime number!!");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        Test obj = new Test();
        obj.isPrime(num);
    }
}
