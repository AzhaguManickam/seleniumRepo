package week1day2;

public class calculator {
	public void addTwoNumbers(int x,int y) {
		int z=x+y;
		System.out.println(z);
	}
	public void subTwoNumbers(int x,int y) {
	    int z=x-y;
	    System.out.println(z);
	}
	public void multiplyTwoNumbers(int x,int y) {
		int z=x*y;
		System.out.println(z);
	}
	public void divideTwoNumbers(int x,int y) {
		 int z=x/y;
		 System.out.println(z);
	}
	public static void main(String[] args) {
		calculator calc=new calculator();
		calc.addTwoNumbers(36,880);
		calc.multiplyTwoNumbers(55, 88);
		calc.subTwoNumbers(49,7);
		calc.divideTwoNumbers(100,10);
		
		
	}

}
