// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Test{
    void isPallindrom(int num){
        int oldNum = num;
        int reverse = 0;
        while(num > 0){
            reverse = reverse *10 + (num%10);
            num = num/10;
        }
        if(reverse == oldNum){
            System.out.println("Yes It Is Pallindrom Value!!!!");
        }
        else{
            System.out.println("This Is Not Pallindrom Value!!!");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Loop : ");
        int num = sc.nextInt();
        Test obj = new Test();
        obj.isPallindrom(num);
    }
}
