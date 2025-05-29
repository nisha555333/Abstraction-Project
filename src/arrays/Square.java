package arrays;

public class Square extends Area {
	@Override
	void collectdata() {
		System.out.println("enter the side of a square:");
		int side = sc.nextInt();
	}
	@Override
	void calculatedata(int side) {
		area = side*side;
	}
}
