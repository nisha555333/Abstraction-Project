package arrays;

public class Statictest {
   static int a,b,c;
   int m,n,o;
   static {
	   a=100;b=200;c=300;
//	   m=400;n=500;o=600;
   }{
	   a=101;b=202;c=303;
	   m=400;n=500;o=600;
   }
	static void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
//		System.out.println(m);
//		System.out.println(n);
//		System.out.println(o);
		}
	void dynamic() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		
	}

}
