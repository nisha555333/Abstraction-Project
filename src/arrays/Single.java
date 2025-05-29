package arrays;
import java.util.Scanner;
public class Single {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[5];
		for(int i=1;i<=5;i++) {
			System.out.println("Enter the name of employe no:"+i);
			arr[i-1] = sc.next();
		}
        for(String name:arr) {
        	System.out.println(name);
        }
	}

}
