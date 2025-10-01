// Create a class Book with attributes: title, author, and price.

// Add a method to display book details.

// Create two objects and print their details.
import java.util.Scanner;

class Book{
    String title = "";
    String author = "";
    int price = 0;
    
    public Book(String title,String author,int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    void display(){
        System.out.println("--------------------------------------");
        System.out.print("Title : "+ this.title);
        System.out.println();
        System.out.print("Author : "+ this.author);
        System.out.println();
        System.out.print("Price : "+ this.price);
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Title of the Book : ");
        String title = sc.nextLine();
        System.out.println("Enter the Author of the Book : ");
        String author = sc.nextLine();
        System.out.println("Enter the Price of the Book : ");
        int price = sc.nextInt();
        Book obj = new Book(title,author,price);
        obj.display();
    }
}
