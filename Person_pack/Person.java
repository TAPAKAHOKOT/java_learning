package Person_pack;

public class Person{
	// Переменные - поля, функции - методы
	int height = 160;
	public Person (int height) {
		this.height = height;
	}

	public String say(){
		return "Hello, wy height is " + height;
	}
}