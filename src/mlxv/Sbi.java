package mlxv;

public class Sbi extends Bank{
	
	@Override
	void savings() {
		System.out.println("savings account");
		
		
	}

	@Override
	void deposit() {
		System.out.println("deposit account");
		
	}
public static void main(String[] args) {
	Sbi i=new Sbi();
	i.branchDetails();
	i.deposit();
	i.savings();
	
}
}


