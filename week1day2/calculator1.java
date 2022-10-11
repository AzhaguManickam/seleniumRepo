package week1day2;

public class calculator1 {
	public void additionTwoNumbers(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void subracionTwoNumbers(int e,int f) {
		int g=e-f;
		System.out.println(g);
	}
	public void multiplicationOfTwoNumber(double i,double j) {
		double k=i*j;
		System.out.println(k);
	}
	public void divisionOfTwoNumbers(float x,float y) {
		float z=x/y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		calculator1 calc =new calculator1();
		calc.additionTwoNumbers(77,88);
		calc.subracionTwoNumbers(45,22);
		calc.multiplicationOfTwoNumber(77.77, 85.74);
		calc.divisionOfTwoNumbers(75.25f, 10.25f);
	}
}
		
		
