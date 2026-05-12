package mlxv;

public class Tvs implements Bike {

	@Override
	public void cost() {
		System.out.println("2347799");
		
	}

	@Override
	public void speed() {
		System.out.println("320rpm");
		
	}
	 
public static void main(String[] args) {
	Tvs t = new Tvs();
	t.cost();
	t.speed();
}
}
