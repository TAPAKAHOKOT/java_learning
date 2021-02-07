package oop;

public class Lab_1{
	// Lab 1

	// Ex 1
	public int convert(int minutes){
		return minutes * 60;
	}

	// Ex 2
	public int points(int double_points, int tripple_points){
		return 2 * double_points + 3 * tripple_points;
	}

	// Ex 3
	public int footballPoints(int wins, int dead_heat, int loose){
		return 3 * wins + dead_heat;
	}

	// Ex 4
	public boolean divisibleByFive(int num){
		return num % 5 == 0;
	}

	// Ex 5
	public boolean and(boolean bool_1, boolean bool_2){
		return bool_1 && bool_2;
	}

	// Ex 6
	public int howManyWalls(int n, int w, int h){
		return n / (w * h);
	}

	// Ex 7
	public int squared(int a){
		return a * a;
	}

	// Ex 8
	public boolean profitableGamble(double prob, double prize, double pay){
		return prob * prize > pay;
	}

	// Ex 9
	public int frames(int minutes, int frames){
		return minutes * frames * 60;
	}

	// Ex 10
	public int mod(int a, int b){
		return a - (a / b)*b;
	}
}