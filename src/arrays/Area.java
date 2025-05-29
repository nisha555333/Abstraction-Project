package arrays;
import java.util.Scanner;

abstract public class Area {
    static final double pi = 3.14;
    double area;
    static Scanner sc = new Scanner(System.in);  // shared Scanner object

    abstract void collectdata();
    abstract void calculatedata();
    
    void display() {
        System.out.println("Area: " + area);
    }
}
