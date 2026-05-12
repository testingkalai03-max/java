package ddvd;



public class Constructor_1 {
	

	    // default variable
	    String name;

	    // protected variable
	    protected double salary=234562;

	    // static variable
	    static String company = "Infosys";

	    int empid;

	    // Default constructor
	    Constructor_1() {
	        System.out.println("Default Constructor");
	    }

	    // Parameterized constructor
	    Constructor_1(int empid, String name, double salary) {

	        this.empid = empid;
	        this.name = name;
	        this.salary = salary;
	        System.out.println("Employee Id: " + empid);
	        System.out.println("Employee Name: " + name);
	        System.out.println("Salary: " + salary);

	        // static variable
	        System.out.println("Company: " + company);
	    }

	    public static void display() {

	     System.out.println("static method");   

	       
	    }
	

	    public static void main(String[] args) {

	        // calling default constructor
	    	new Constructor_1();	     // Constructor_1 c = new Constructor_1();
	       

	     
new Constructor_1(101,"priya",32456);//Constructor_1 c1 = new Constructor_1(123,"kalai", 23456);
Constructor_1.display();
	      
	    }
	}


