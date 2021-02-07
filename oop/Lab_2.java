package oop;

import static java.lang.Math.abs;
import static java.lang.Math.round;
import java.util.Arrays;

public class Lab_2{
	// Lab 2

	// Ex 1
	public int oppositeHouse(int n, int l){
		return l * 2 - n + 1;
	}

	// Ex 2
	public String nameshuffle(String line){
		String[] str = line.split(" ");
		return str[1] + " " + str[0];
	}

	// Ex 3
	public double discount(double cost, double percent){
		return cost * (1 - percent / 100);
	}

	// Ex 4
	public int differenceMaxMin(int[] arr){
		return Arrays.stream(arr).max().getAsInt() - Arrays.stream(arr).min().getAsInt();
	}

	// Ex 5
	public int equal(int a, int b, int c){
		int res = boolToInt(a == b) + boolToInt(a == c) + boolToInt(b == c) + 1;
		return res < 4 ? res : res - 1;
	}

	// Ex 6
	public String reverse(String line){
		char[] ch_line = line.toCharArray();
		char[] res = new char[line.length()];
		for (int k = line.length() - 1; k >= 0; k--){
			res[line.length() - k - 1] = ch_line[k];
		}

		return String.valueOf(res);
	}

	// Ex 7
	public int programmers(float a, float b, float c){
		float max1 = (a + b + abs(a - b))/2;
		float min1 = (a + b - abs(a - b))/2;

		float max2 = (max1 + c + abs(max1 - c))/2;
		float min2 = (min1 + c - abs(min1 - c))/2;

		return (int)(max2 - min2);
	}

	// Ex 8
	public boolean getXO(String line){
		char[] ch_line = line.toLowerCase().toCharArray();
		int a = 0, b = 0;
		for (int k = 0; k < line.length(); k++){
			if (ch_line[k] == 'x')
				a++;
			else if (ch_line[k] == 'o')
				b++;
		} 

		return a == b;
	}

	// Ex 9
	public String bomb(String line){
		char[] ch_line = line.toLowerCase().toCharArray();
		char[] bomb = {'b', 'o', 'm', 'b'};
		String res = "Relax";

		int count = 0;
		for (int k = 0; k < line.length(); k++){
			if (ch_line[k] == bomb[count]){
				count++;
			}
			else 
				count = 0;

			if (count == 4){
				res = "Duck!";
				break;
			}
		} 

		return res;
	}

	// Ex 10
	public boolean sameAscii(String a, String b){
		return get_ascii_sum(a) == get_ascii_sum(b);
	}

	private int boolToInt(boolean b) {
	    return b ? 1 : 0;
	}

	private int get_ascii_sum(String line){
		char[] ch_line = line.toCharArray();
		int res = 0;

		for (int k = 0; k < line.length(); k++){
			res += (int)ch_line[k];
		}

		return res;
	}
}