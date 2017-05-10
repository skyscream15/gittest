package hi;

public class Animal {
	public void sound() {
		System.out.println("Animal 努贰胶狼 sound()");
	}
}

class Dog extends Animal {
	public void sound() {
		System.out.println("港港");
	}
}

class Cat extends Animal {
	public void sound() {
		System.out.println("具克");
	}
}