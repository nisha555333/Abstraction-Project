package arrays;

public class Main {

	public static void main(String[] args) {
		System.out.println(Statictest.a);
		System.out.println(Statictest.b);
		System.out.println(Statictest.c);
//		System.out.println(Statictest.m);
//		System.out.println(Statictest.n);
		Statictest.display();
		System.out.println("----------------");
		Statictest s = new Statictest();
		System.out.println(s.m);
		System.out.println(s.n);
		System.out.println(s.o);
		s.dynamic();

	}

}
