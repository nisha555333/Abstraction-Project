package arrays;
import java.util.Scanner;
abstract public class Area {
	static final double pi = 3.14 ;
	double area;
	abstract void collectdata();
	abstract void calculatedata();
	void display() {
		System.out.println(area);
	}
}

