// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Test{
    int largestNumber(int a, int b, int c){
        return a>b ? a>c ? a : c : b>c ? b : c;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int a = sc.nextInt();
        System.out.println("Enter Second Number :");
        int b = sc.nextInt();
        System.out.println("Enter Third Number :");
        int c = sc.nextInt();
        // System.out.println("You Have Enter a, b :" + a + " , "+ b);
        Test obj = new Test();
        int graterValue = obj.largestNumber(a,b,c);
        System.out.println("Grater Value : "+graterValue);
    }
}
