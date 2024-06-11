package Com;

public class Functiondemo {

	public static void main(String[] args) {
		Functiondemo obj1= new Functiondemo(); 
		// TODO Auto-generated method stub
		add();
		obj1.sub();
		int result=obj1.div();
		System.out.println("div=" +result);
		//sub();
		

	}
	public static void add() {
		int a=1;
		int b=4;
		int total=a+b;
		System.out.println("Add=" +total);
	}
	public  void sub() {
		int a=10;
		int b=4;
		int total=a-b;
		System.out.println("sub=" +total);
}
	public  int div() {
		int a=12;
		int b=4;
		int total=a/b;
		//System.out.println("div=" +total);
		return total;
}
}
