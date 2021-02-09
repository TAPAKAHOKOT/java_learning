package oop;

import static java.lang.Math.round;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;
import static java.lang.Math.pow;
import java.util.Arrays;

public class Lab_3{
	// Lab 3

	// Ex 1
	public void millionsRounding(Object[][] cities){
		for (int k = 0; k < cities.length; k++){
			cities[k][1] = round( ((int)(cities[k][1]) / 1000000d) ) * 1000000;
		}
	}

	// Ex 2
	public double[] otherSides(int num){
		double[] a = {round(num * 2d*100)/100d, round(num * sqrt(3)*100)/100d };

		return a;
	}

	// Ex 3
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

	// Ex 4
	public int warOfNumbers(int[] arr){
		int[] sum_nums = {0, 0};
		for (int k = 0; k < arr.length; k++){
			sum_nums[arr[k] % 2] += arr[k];
		}
		return abs(sum_nums[0] - sum_nums[1]);
	}

	// Ex 5
	public String reverseCase(String line){
		char[] ch_line = line.toCharArray();
		for (int k = line.length() - 1; k >= 0; k--){
			if ((int)ch_line[k] <= 90)
				ch_line[k] = (char)((int)ch_line[k] + 32);
			else
				ch_line[k] = (char)((int)ch_line[k] - 32);
		}

		return String.valueOf(ch_line);
	}
	// Ex 6
	public String inatorInator(String line){
		char[] ch_line = {'a', 'e', 'y', 'u', 'i', 'o'};
		char a = line.charAt(line.length() - 1);

		if (Arrays.asList(ch_line).contains(a))
			return line + "-inator " + line.length() + "000";
		else 
			return line + "inator " + line.length() + "000";
	}

	// Ex 7
	public boolean doesBrickFit(int a, int b, int c, int w, int h){
		int min_ab = (a + b - abs(a-b))/2;
		int max_ab = (a + b + abs(a-b))/2;
		int min_c = (c + max_ab - abs(max_ab-c))/2;

		return (min_ab*min_c) <= (w*h);
	}

	// Ex 8
	public double totalDistance(double fuel, double fuel_rate, int passangers, boolean condit){
		double res_rate = fuel_rate + 0.05 * fuel_rate * passangers;
		if (condit)
			res_rate *= 1.1;

		return fuel / res_rate * 100;
	}
}