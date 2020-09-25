package app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
<<<<<<< HEAD
        
int count = 0;
String color = "red";
boolean colors = true; 

while (count <= 10) {
    System.out.println("The count is " + count);
    count = count + 1;

}
System.out.println("count finished");
while (color == "red");{
    System.out.println("The color is " + color);
    color = "green";





    

    }
System.out.println("count finished");
    while (colors == true) {
    System.out.println("The boolean is " + colors);
    colors = false; }
    }
    
}
=======

Scanner input = new Scanner(System.in);

System.out.println("Please enter your first name.");
String name = input.nextLine();
System.out.println("Hello, " + name);

System.out.println("Please emter your last name.");
String lastname = input.nextLine();
System.out.println("Hello, " + lastname);

System.out.println("Please enter your age");
String age = input.nextLine();
System.out.println(age);

System.out.println("Please enter your grade");
String grade = input.nextLine();
System.out.println(grade);

System.out.println("Please enter your favorite color");
String color = input.nextLine();
System.out.println(color);



}


    

}
>>>>>>> 14c28919ed73f2fcb4d8c2d22dabc335040bda3a
