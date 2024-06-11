package Com;

public class Pattern {

	public static void pattern() {
		// TODO Auto-generated method stub
		int k=5;
		
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=a;b++) {
				if(a==5 && b>2) {
					System.out.print(k);
					k--;
					
				}else {		   
		        	 System.out.print(b );
		        	 
		        	 }
		         }
			   
				System.out.println();
				}

}
	public static void main(String args[]) {
		pattern();
	}}
