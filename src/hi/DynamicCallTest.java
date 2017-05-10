package hi;

public class DynamicCallTest {
	public static void main(String args[]) {
		Animal animal = new Animal();
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		animal.sound();
		dog.sound();
		cat.sound();
	}
}