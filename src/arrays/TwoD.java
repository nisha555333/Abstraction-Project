package arrays;
import java.util.Scanner;
public class TwoD{ 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String arr [][]	= new String[5][2];
		for(int i=0;i<5;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("enter no:of employes:"+(i+1)+"from company no:"+(j+1)+" "+":");
				arr[i][j]=sc.next();
				
			}
		}
        for(int i = 1;i<=5;i++) {
        	for(int j = 0;j<2;j++) {
        		System.out.println("enter no:of employes:"+(i+1)+"from company no:"+(j+1)+arr[i][j]);
        	}
        }
	}
}
