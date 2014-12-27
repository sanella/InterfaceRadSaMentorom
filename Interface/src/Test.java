
public class Test {
	
public static void main(String[] args) {
	Animal[] array = new Animal[5];
	
	Animal animal1 = new Konj("Rudolf");
	Animal animal2 = new Konj("Rocki");
	
	Animal animal3 = new Patka("Kvak");
	Animal animal4 = new Patka("KUKU");
	Animal animal5 = new Patka("Flopy");
	
	animal2 = new Patka("Nova patka");
	
	array[0] = animal1;
	array[1] = animal2;
	array[2] = animal3;
	array[3] = animal4;
	array[4] = animal5;
			
	for (int i = 0; i < array.length; i++){
		array[i].animalTipe();
		array[i].getName();
	}
}
}
