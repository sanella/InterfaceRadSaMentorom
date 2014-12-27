
public class Konj implements Animal{
	
	public String name;
	
	public Konj(String name){
		this.name = name;
	}
	
	@Override
	public void animalTipe() {
	System.out.println("Konj");	
	}

	@Override
	public void getName() {
		System.out.println(this.name);
		
	}

}
