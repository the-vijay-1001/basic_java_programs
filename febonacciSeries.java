// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Test{
    void febonacciSeries(int num){
        int f0 = 0;
        int f1 = 1;
        int f = 0;
        System.out.println(f0);
        System.out.println(f1);
        for(int i = 2; i<num; i++){
            f = f0 + f1;
            f0 = f1;
            f1 = f;
            System.out.println(f);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int num = sc.nextInt();
        Test obj = new Test();
        obj.febonacciSeries(num);
    }
}
