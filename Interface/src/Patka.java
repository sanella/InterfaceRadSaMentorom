
public class Patka implements Animal {

	public String name;
	
	public Patka(String _name){
		this.name = _name;
	}
	
	@Override
	public void animalTipe() {
		System.out.println("Patka");
		
	}

	@Override
	public void getName() {
		System.out.println(this.name);
	}

}
