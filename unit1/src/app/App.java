package app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

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