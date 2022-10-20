package basicconcepts;

public class Methodoverriding1 extends Methodoverriding{
	
	@Override
	public void message() {
		super.message();
		System.out.println("messager override is successful");
	}
	
	public void facebookmessanger() {
		System.out.println("hai");
		
	}
	
	public static void main(String[] args) {
		Methodoverriding1 me=new Methodoverriding1();
		me.facebooklogin();
		me.facebooknewsfeed();
		me.facebookmessanger();
		me.message();
	}

}
