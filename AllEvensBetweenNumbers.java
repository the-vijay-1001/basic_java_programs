// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class Test{
    void printAllEvens(int num){
        for(int i = 1; i<= num; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Loop : ");
        int num = sc.nextInt();
        // System.out.println("You Have Enter a, b :" + a + " , "+ b);
        Test obj = new Test();
        obj.printAllEvens(num);
    }
}
