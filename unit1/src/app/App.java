package app;

public class App {
    public static void main(String[] args) throws Exception {
       helloWorld();
       isCool("AJ");
       multiply(4, 5, 7, 8, 9);
    }
    public static void helloWorld(){
        System.out.println("Hello world");
    }
        public static void AJ(){
            System.out.println("AJ");    
  }
public static void John(){
    System.out.println("John");
}
public static void Lester(){
    System.out.println("Lester");
}

public static void isCool(String name){
    System.out.println(name + " is cool.");
}
    public static void greaterthan10(int number){
        if (number>10){
       System.out.println("Number is graeter than 10");
        }
       else {
           System.out.println("number is not greater than 10");
       }
}
public static void multiply(int num1, int num2, int num3, int num4, int num5){
        System.out.println(num1 * num2 * num3 * num4 * num5);

        }
    } 
     



