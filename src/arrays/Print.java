package arrays;
import java.util.Scanner;
public class Print {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        Square s = new Square();
        s.collectdata();
        s.calculatedata();
        System.out.print("The area of the Square: ");
        s.display();

        Circle c = new Circle();
        c.collectdata();
        c.calculatedata();
        System.out.print("The area of the Circle: ");
        c.display();

        Triangle t = new Triangle();
        t.collectdata();
        t.calculatedata();
        System.out.print("The area of the Triangle: ");
        t.display();
    }
}
