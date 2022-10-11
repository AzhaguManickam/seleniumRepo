package week1day2;

public class EmployeeDetails {
	public void EmployeeName() {
		String EmployeeName="Manickam";
		System.out.println("EmployeeName="+EmployeeName);
	}
	private void EmployeeId() {
		int EmployeeId=100;
		System.out.println("EmployeeId="+EmployeeId);
	}
	protected void EmployeeAddress() {
		String EmployeeAddress="18/7/316 UNON SCHOOL STREET SURANDAI-17";
		System.out.println("EmployeeAddress="+EmployeeAddress);
	}
	public void EmployeeSalary() {
		double EmployeeSalary=9999.99;
		System.out.println("EmployeeSalary="+EmployeeSalary);
	}
	private void EmployeePhoneNumber() {
		Long EmployeePhoneNumber=9080525057L;
		System.out.println("EmployeePhoneNumber="+EmployeePhoneNumber);	
	}
	public static void main(String[] args) {
		EmployeeDetails Details=new EmployeeDetails();
		Details.EmployeeName();
		Details.EmployeeId();
		Details.EmployeeAddress();
		Details.EmployeeSalary();
		Details.EmployeePhoneNumber();
		
	}
		
	
	
	

}
