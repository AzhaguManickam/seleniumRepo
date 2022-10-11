package week1day2;

public class Bicycle {
	
	public void canRide() {
		System.out.println("can ride");
	}
    private void rideFast() {
    	System.out.println("ride fast");
    }
    void canPedal() {
    	System.out.println("can pedal");
    }
    protected void exercise(){
    	System.out.println("exercise");
    	
    }
    public static void main(String[] args) {
       Bicycle cycle=new  Bicycle();
       cycle.canRide();
       cycle.rideFast();
       cycle.canPedal();
       cycle.exercise();
       
       
       
		
	}
}
