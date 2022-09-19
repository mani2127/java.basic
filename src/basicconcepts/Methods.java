package basicconcepts;

public class Methods {
	
	public void empname() {
		System.out.println("Employee name is Manikandan");
	}
	
	public String empcompanyname() {
		return "Company name is Global";
	}
	
	private boolean married() {
		return true;
	}

	public static void main(String[] args) {
		
		Methods me=new Methods();
		boolean marriagestatus=me.married();
		System.out.println(marriagestatus);
	}
}
