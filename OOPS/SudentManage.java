import java.util.Scanner;

class Student{
    private String name;
    private int age;
    private float grade;
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setAge(int age){
        if(age <= 0 || age > 110){
            System.out.println("Please Enter a valid age!");
            this.age = 0;
        }
        else{
            this.age = age;
        }
    }
    
    public float getGrade(){
        return this.grade;
    }
    
    public void setGrade(float grade){
        if(grade <= 0 || grade > 99){
            System.out.println("Please Enter a valid grade!");
            this.grade = 0;
        }
        else{
            this.grade = grade;
        }
    }
    
    @Override
    public String toString() {
        return "--------------------------------------\n" +
               "Name  : " + name + "\n" +
               "Age   : " + age + "\n" +
               "Grade : " + grade + "\n" +
               "--------------------------------------";
    }
}

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        
        System.out.println("Enter the name of the student : ");
        student.setName(sc.nextLine());
        
        System.out.println("Enter the age of the student : ");
        student.setAge(sc.nextInt());
        
        System.out.println("Enter the grade of the student : ");
        student.setGrade(sc.nextFloat());
        
        System.out.println(student);
        sc.close();
    }
}
