// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Test{
    void armstrongNumber(int num){
        int oldNum = num;
        int sum = 0;
        while(num >0){
            int digit = num % 10;
            sum = sum + (digit*digit*digit);
            num = num/10;
        }
        if(oldNum == sum){
            System.out.println("It is a ArmStrong Number!" + sum);
        }
        else{
            System.out.println("No It is not a ArmStrong Number!");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number To Check Armstrong Number : ");
        int num = sc.nextInt();
        Test obj = new Test();
        obj.armstrongNumber(num);
    }
}
