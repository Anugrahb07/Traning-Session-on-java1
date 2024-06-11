package Com;
import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    //int Ajay=10;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("Eligable for voting");
		}else {
			System.out.println(" Not Eligable for voting");
		}
			
		}

	

}
