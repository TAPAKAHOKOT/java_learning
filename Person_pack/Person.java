package Person_pack;

public class Person{
	// Переменные - поля, функции - методы
	public int height = 160;

	public Person(){}

	public Person (int height) {
		this.height = height;
	}

	public String say(){
		return "Hello, wy height is " + height;
	}
}

