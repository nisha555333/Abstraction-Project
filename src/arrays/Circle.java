package arrays;
public class Circle extends Area {
		@Override
		void collectdata() {
			System.out.println("enter the radius of a square:");
			int radius = sc.nextInt();
		}
		@Override
		void calculatedata(int radius) {
			area =pi*(radius*radius);
		}
	}

}
