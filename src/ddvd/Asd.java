package ddvd;



public class Asd {
	

	
	public void empDetails(int num) {
		System.out.println(num);
	}
	public void empDetails(String name) {
		System.out.println(name);
		
	}
	public void empDetails(long phone) {
		System.out.println(phone);
		
	}
	
	 public static void main(String[] args) {
		 Constructor_1 c = new Constructor_1();
				System.out.println(c.salary); 
		 Asd a= new Asd();
		 a.empDetails(12345);
		 a.empDetails(9876543218l);
		 a.empDetails("kalai");
		
}}
