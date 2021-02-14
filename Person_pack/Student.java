package Person_pack;

import Person_pack.Person;


public class Student extends Person{
	int course = 1;

	public Student(){}

	public Student (int c) {
		course = c;
	}
	public Student (int c, int height) {
		super(height);
		course = c;
	}

	public String tell(){
		return "I am at " + course + " course";
	}
}
