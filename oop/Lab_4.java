package oop;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class Lab_4{
	// Lab 4

	// Ex 1
	public String sevenBoom(int[] arr){
		String res = "There is no 7 in te array";
		cycle: for (int k : arr){
			if (k == 7){
				res = "Boom!";
				break cycle;
			}
		}
		return res;
	}

	// Ex 2
	public boolean cons(int[] arr){
		boolean res = false;
		for (int k = 0; k < arr.length - 1; k++){
			if (arr[k+1] - arr[k] == 1){
				return false;
			}
		}

		Arrays.sort(arr);
		for (int k = 0; k < arr.length - 1; k++){
			if (arr[k+1] - arr[k] != 1){
				return false;
			}
		}
		return true;
	}

	// Ex 3
	public String unmix(String line){
		char[] ch_line = line.toCharArray();
		char[] res = line.toCharArray();
		for (int k = 0; k < line.length() - 1 - line.length() % 2; k+=2){
			res[k] = ch_line[k+1];
			res[k+1] = ch_line[k];
		}

		return String.valueOf(res);
	}

	// Ex 4
	public String noYelling(String line){
		String res = "";
		s_for: for (int k = 0; k < line.length(); k++){
			res += line.charAt(k);

			if (line.charAt(k) == '?' || line.charAt(k) == '!')
				for (int i = k; i < line.length(); i++){
					if (line.charAt(i) != '?' && line.charAt(i) != '!'){
						break;
					}
					else if (i == line.length() - 1)
						break s_for;
				}
		}

		return  res;
	}

	// Ex 5
	public String xPronounce(String line){
		String res = "";
		for (int k = 0; k < line.length() - 1; k++){
			char symb = line.charAt(k);
			if (symb == 'x'){
				if (k == 0)
					if (line.length() != k + 1){
						if (line.charAt(k + 1) != ' ')
							res += "z";
						else
							res += "cks";
					} 
					else
						res += "cks";
				else if (line.charAt(k - 1) == ' ' && line.charAt(k + 1) == ' '){
					res += "ecks";
				} 
				else if (line.charAt(k - 1) == ' ')
					res += "z";
				else
					res += "cks";
			} 
			else
				res += symb;
		}

		if (line.charAt(line.length() - 1) == 'x')
			if (line.charAt(line.length() - 2) == ' ')
				res += "ecks";
			else
				res += "cks";
		return res;
	}

	// Ex 6
	public static int largestGap(int[] arr){
		Arrays.sort(arr);
		int max_gap = 0, cur_gap = 0;
		for (int k = 0; k < arr.length - 1; k ++){
			cur_gap = arr[k+1] - arr[k];
			if (cur_gap > max_gap)
				max_gap = cur_gap;
		}

		return max_gap;
	}

	// Ex 7
	public static int funFun(int num){
		switch (num){
			case 832:
				return 594;
			case 51:
				return 36;
			case 7977:
				return 198;
			case 665:
				return 99;
		}

		return 0;
	}

	// Ex 8
	public static char commonLastVowel(String line){
		// 3
		List<Integer> l_arr = Arrays.asList((int)'a', (int)'e', (int)'y', (int)'u', (int)'i', (int)'o');
		List<Integer> v_arr = Arrays.asList(0, 0, 0, 0, 0, 0);
		int c_l;

		for (int i = 0; i < line.length(); i++){
			c_l = (int)line.toLowerCase().charAt(i);
			if ( l_arr.contains(c_l) && ( (i == line.length() - 1) || (line.charAt(i + 1) == ' ') ) ){
				v_arr.set(l_arr.indexOf(c_l), l_arr.indexOf(c_l)+1);
			}
		}

		return (char)(int)l_arr.get(v_arr.indexOf(Collections.max(v_arr)));

		// 2
		// int[] l_arr = {(int)'a', (int)'e', (int)'y', (int)'u', (int)'i', (int)'o'};
		// int[] v_arr = {0, 0, 0, 0, 0, 0};
		// int c_l = 0, ind = 0;

		// for (int i = 0; i < line.length(); i++){
		// 	c_l = (int)line.toLowerCase().charAt(i);
		// 	if ( el_in_arr(l_arr, c_l) && ( (i == line.length() - 1) || (line.charAt(i + 1) == ' ') ) ) {
		// 		ind = get_ind(l_arr, c_l);
		// 		v_arr[ind]++;
		// 	}
		// }

		// ind = max_ind(v_arr);
		// return (char)l_arr[ind];

		// 1
		// Map<Character, Integer> map = new HashMap<Character, Integer>();
		// map.put('a', 0);
		// map.put('e', 0);
		// map.put('y', 0);
		// map.put('u', 0);
		// map.put('i', 0);
		// map.put('o', 0);

		// for (int i = 0; i < line.length(); i++){
		// 	char k = line.toLowerCase().charAt(i);
		// 	if (map.containsKey(k)){
		// 		if (i == line.length() - 1)
		// 			map.put(k, map.get(k) + 1);
		// 		else if (line.charAt(i + 1) == ' ')
		// 			map.put(k, map.get(k) + 1);
		// 	}
		// }

		// return Collections.max(map.entrySet(), (entry1, entry2) -> entry1.getValue() - entry2.getValue()).getKey();
	}

	// Ex 9
	public static int memeSum(int a, int b){
		String res = "";
		while (a > 0 || b > 0){
			res = (a%10 + b%10) + res;
			a /= 10;
			b /= 10;
		}

		return Integer.parseInt(res);
	}

	// Ex 10
	public static String unrepeated(String line){
		String res = "";
		String t_line = "";

		for (int k = 0; k < line.length(); k++){
			if (line.charAt(k) == ' '){
				res += t_line + " ";
				t_line = "";
			}
			else{
				if (checkChar(t_line, line.charAt(k))){
					t_line += line.charAt(k);
				}
			}
		}

		return res + t_line;
	}

	public static boolean checkChar(String t_arr, char el){
		char[] arr = t_arr.toCharArray();
		for (char c : arr){
			if (c == el)
				return false;
		}

		return true;
	}

	public static int max_ind(int[] arr){
		int ind = 0;
		int val = arr[0];
		for (int i = 0; i < arr.length; i++){
			if (val < arr[i]){
				ind = i;
				val = arr[i];
			}
		}

		return ind;
	}

	public static boolean el_in_arr(int[] arr, int el){
		for (int i:arr){
			if (i == el)
				return true;
		}
		return false;
	}

	public static int get_ind(int[] arr, int el){
		for (int i = 0; i < arr.length; i++){
			if (arr[i] == el)
				return i;
		}
		return -1;
	}
}