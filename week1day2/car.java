package week1day2;

public class car {
 public void applyBrake() {
	 System.out.println("Apply Brake");
 }
 public void applyGear() {
	 System.out.println("Apply Gear");
 }
 public void switchOnAc() {
	 System.out.println("Switch On Ac");
 }
 public void applyAccelerate() {
	 System.out.println("Apply Accelerate");
 }
 public static void main(String[] args) {
	car action=new car();
	action.applyBrake();
	action.applyGear();
	action.switchOnAc();
	action.applyAccelerate();
}
}
