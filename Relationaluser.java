package Com;
import java.util.Scanner;

public class Relationaluser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a");
		int a = sc.nextInt();
		System.out.println("Enter the b");
		int b = sc.nextInt();
		
		System.out.println("a== b=" +(a == b));
		System.out.println("a!= b=" +(a != b));
		System.out.println("a> b=" +(a > b));
		System.out.println("a< b=" +(a < b));
		System.out.println("b>= a=" +(a >= b));
		System.out.println("b<= a=" +(a <= b));
		

	}

}
