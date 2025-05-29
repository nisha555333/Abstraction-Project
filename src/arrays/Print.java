package arrays;
import java.util.Scanner;
public class Print {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Square s = new Square();
		System.out.println(s.collectdata());
		System.out.println(s.calculatedata());
		System.out.print("the area of Square"+" "+ s.dispaly());
		Circle c = new Circle();
		System.out.println(s.collectdata());
		System.out.println(s.calculatedata());
		System.out.print("the area of Circle"+" "+ s.dispaly());
		System.out.println("Hello world ");
	}

}
