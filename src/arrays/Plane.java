package arrays;

abstract public class Plane {

	void takeoff() {
		System.out.println("the plane is ready to take off");
	}
	abstract void fly();
	void land() {
		System.out.println("the plane has landed");
	}
}

