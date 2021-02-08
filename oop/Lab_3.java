package oop;

import static java.lang.Math.round;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;
import java.util.Arrays;

public class Lab_3{
	// Lab 3

	// Ex 1
	public void millionsRounding(Object[][] cities){
		for (int k = 0; k < cities.length; k++){
			cities[k][1] = round( ((int)(cities[k][1]) / 1000000d) ) * 1000000;
		}
	}

	public double[] otherSides(int num){
		double[] a = {round(num * 2d*100)/100d, round(num * sqrt(3)*100)/100d };

		return a;
	}

	public String rps(String p_1, String p_2){
		String[] arr = {"rock", "paper", "scissors"};
		String res = "";

		int n_1 = Arrays.asList(arr).indexOf(p_1) + 1;
		int n_2 = Arrays.asList(arr).indexOf(p_2) + 1;

		if (n_1 == n_2)
			res = "TIE";
		else if (n_1 < n_2)
			res = "Player 2 wins";
		else
			res = "Player 1 wins";

		if (abs(n_1 - n_2) == 2)
			if (n_1 == 1)
				res = "Player 1 wins";
			else
				res = "Player 2 wins";
		
		return res;
	}

}