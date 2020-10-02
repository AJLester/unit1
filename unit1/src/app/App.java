package app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
  Scanner input = new Scanner(System.in);
  System.out.println("what color is the sky");
  String s1 = input.nextLine();
int score =  0;
  if (s1.equals("blue")) {
      System.out.println("Right");
score = score + 1;
  } else {
      System.out.println("wrong");
  }
  System.out.println("what color is dirt");
  String s2 = input.nextLine();
  if (s2.equals ("brown")) {
      System.out.println("Right");
      score = score + 1;
  }
  else {
      System.out.println("wrong");
  }

  System.out.println("what is the newest I phone");
  String s3 = input.nextLine();
  if (s3.equals("I phone 11 pro")) {
      System.out.println("Right");
      score = score + 1;
  }
  else {
      System.out.println("wrong");
  }
  System.out.println("how many fingers on 2 hands");
  String s4 = input.nextLine();
  if (s4.equals("10")) {
      System.out.println("Right");
      score = score + 1;
  }
  else {
      System.out.println("wrong");
  }
  System.out.println("who won the stanly cup");
  String s5 = input.nextLine();
  if (s5.equals("lightning")) {
      System.out.println("Right");
      score = score + 1;
  }
  else {
      System.out.println("wrong");
  }
      
}
}

