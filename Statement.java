package Com;
import java.util.Scanner;

public class Statement {

	public static void main(String[] args) {
		String answer;
		do {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the quantity=");
		int quantity=input.nextInt();
		System.out.println("Enter the price=");
		int price=input.nextInt();
		double total=quantity*price;
		System.out.println("total is="+ total);
		
		
		System.out.println("Do you want to perform again");
		 answer=input.next();
		}while(answer.equals("Yes"));
	}
		 
		
		
	

	}


