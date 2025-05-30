package arrays;
import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the principal:");
        int principal = sc.nextInt();
        System.out.println("enter the time:");
        int time = sc.nextInt();
        Simpleinterest o = new Simpleinterest();
        o.calculate(principal, time);
        o.display();

        
    }
}