package oop;

import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Lab_5{
	// Lab 5

	// Ex 1
	public static boolean sameLetterPattern(String line1, String line2){
		return get_pattern(line1).equals( get_pattern(line2) );
	}

	public static String get_pattern(String line){
		ArrayList<Character> letArr = new ArrayList<>();

		String pat = "";
		char let;

		for (int i = 0; i < line .length(); i++){
			let = line.charAt(i);

			if (!letArr.contains(let)){
				letArr.add(let);
			}
			pat += letArr.indexOf(let);
		}

		return pat;
	}	

	// Ex 2
	public static String spiderVsFly(String startPoint, String endPoint){
		String res = startPoint;

		String[] ways;
		String bWay = startPoint;
		while (!bWay.equals(endPoint)){
			ways = getWays(bWay);

			double disctance = -1, wDist = 0;

			for (String way : ways){
				wDist = getDistance(getCoords(way), getCoords(endPoint));

				if (disctance == -1 || wDist < disctance){
					disctance = wDist;
					bWay = way;
				}
			}

			res += "-" + bWay;
		}

		return res;
	}

	public static int[] getCoords(String coords){
		char let = coords.charAt(0);
		int step = coords.charAt(1) - '0';
		
		switch (let){
			case 'A':
				return new int[] {step, 0};
			case 'E':
				return new int[] {-step, 0};
			case 'G':
				return new int[] {0, -step};
			case 'C':
				return new int[] {0, step};
			case 'B':
				return new int[] {step, step}; 
			case 'F':
				return new int[] {-step, -step}; 
			case 'H':
				return new int[] {-step, step}; 
			case 'D':
				return new int[] {-step, step}; 
		}

		return new int[] {0, 0};
	}

	public static double getDistance(int[] d1, int[] d2){
		return Math.sqrt( Math.pow(d1[0] - d2[0], 2) + Math.pow(d1[1] - d2[1], 2) );
	}

	public static String[] getWays(String coords){
		char let = coords.charAt(0);
		int iLet = (int)let;

		int step = coords.charAt(1) - '0';

		int[] nWays;
		if (step == 4)
			nWays = new int[] {3};
		else if (step == 0)
			return new String[] {"A1", "B1", "C1", "D1", "E1", "F1", "G1", "H1"};
		else
			nWays = new int[] {step - 1, step + 1};


		char[] lWays;
		if (iLet == 'A')
			lWays = new char[]{'B', 'H'};
		else if (iLet == 'H')
			lWays = new char[]{'A', 'G'};
		else
			lWays = new char[]{(char)(iLet-1), (char)(iLet + 1)};


		String[] res = new String[lWays.length + nWays.length];
		int c = 0;
		for (char i : lWays){
			res[c] = "" + i + step;
			c++;
		}

		for (int i : nWays){
			res[c] = "" + let + i;
			c++;
		}
		return res;
	}

	// Ex 3
	public static int digitsCount(int num){
		return (num > 0) ? (1 + digitsCount(num / 10)) : (0);
	}

	// Ex 4
	public static int totalPoints(String[] arr, String word){
		int totalScore = 0;

		ArrayList<Character> letArr = new ArrayList<>();

		char let;
		for (int i = 0; i < word .length(); i++){
			let = word.charAt(i);
			if (!letArr.contains(let)){
				letArr.add(let);
			}
		}

		int letNum;
		boolean solved;
		for (String line : arr){
			letNum = line.length();
			solved = true;
			for (int i = 0; i < line.length(); i++){
				let = line.charAt(i);
				if (!letArr.contains(let)){
					solved = false;
					break;
				}
			}

			if (solved)
				totalScore += letNum - 2;
			if (letNum == 6)
				totalScore += 50;
		}

		return totalScore;
	}

	// Ex 5
	public static int longestRun(int[] arr){
		boolean goUp = false, goDown = false;
		int score = 0, maxScore = 0;
		for (int i = 1; i < arr.length; i++){
			if (goUp || goDown){
				score++;
			}

			if (arr[i] - arr[i-1] == 1 && !goUp){
				goUp = true;
				goDown = false;

				if (score > maxScore)
					maxScore = score;
				score = 1;
			} else if (arr[i] - arr[i-1] == -1 && !goDown){
				goUp = false;
				goDown = true;
				
				if (score > maxScore)
					maxScore = score;
				score = 1;
			} else if ( Math.abs(arr[i] - arr[i-1]) != 1 ){
				goUp = false;
				goDown = false;
				
				if (score > maxScore)
					maxScore = score;
				score = 0;
			}
		}

		return maxScore;
	}

	// Ex 6
	public static String takeDownAverage(String[] arr){
		int res = 0;
		for (String line : arr){
			res += Integer.parseInt(line.substring(0, line.length() - 1));
		}

		return Math.round((res / arr.length) - 5 * (arr.length + 1) ) + "%";
	}

	// Ex 7
	public static String rearrange(String line){
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher;

		String[] lineArr = line.split(" ");
		String[] newLineArr = new String[lineArr.length];

		for (String s : lineArr){
			s = s.replace(".", "");
			matcher = pattern.matcher(s);
			matcher.find();
			int sym = Integer.parseInt(matcher.group());
			newLineArr[sym - 1] = s.replace(sym+"", "");
		}

		String res = "";
		for (String s : newLineArr)
			res += (res == "") ? (s) : (" " + s);
		
		res += ".";

		return res;
	}

	// Ex 8
	public static int maxPossible(int num1, int num2){
		int[] arr = new int[digitsCount(num2)];
		for (int i = 0; i < arr.length; i++){
			arr[i] = num2 % 10;
			num2 /= 10;
		}
		

		Arrays.sort(arr);

		int res = 0, counter = arr.length-1, num1Size = digitsCount(num1);
		for (int i = 0; i < num1Size; i++){
			int num1C = (int)(num1 / (Math.pow(10, num1Size - 1 - i))) % 10;

			if ( num1C < arr[counter] ){
				res = (res == 0) ? (arr[counter]) : (res*10 + arr[counter]);
				counter--;
			}
			else{
				res = (res == 0) ? (num1C) : (res*10 + num1C);
			}
		}

		return res;
	}

	// Ex 9
	public static String timeDifference(String inpCity, String inpDate, String outCIty){
		String[] monthes_k = {"January", "Februrary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int[] monthes_v = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		Map<String, Integer[]> monthes = new HashMap<String, Integer[]>();

		int dayCounter = 0;
		for (int i = 0; i < monthes_k.length; i++){
			monthes.put(monthes_k[i], new Integer[] {i, dayCounter} );
			dayCounter += monthes_v[i];
		}
		int minutesAtYear = dayCounter * 24 * 60;

		String[] cities_k = {"Los Angeles", "New York", "Caracas", "Buenos Aires", "London", "Rome", "Moscow", "Tehran", "New Delhi", "Beijing", "Canberra"};
		double[] cities_v = {-8, -5, -4.5, -3, 0, 1, 3, 3.5, 5.5, 8, 10};
		Map<String, Double> cities= new HashMap<String, Double>();

		for (int i = 0; i < cities_k.length; i++){
			cities.put(cities_k[i], cities_v[i]);
		}

		// translating inp date to minutes
		int totalMinutes = 0;
		String[] date = inpDate.split(" ");
		totalMinutes += ( monthes.get(date[0])[1] + Integer.parseInt(date[1].replace(",", "")) ) * 24 * 60;
		String[] time =  date[3].split(":");
		totalMinutes += Integer.parseInt(time[0]) * 60 + Integer.parseInt(time[1]);

		totalMinutes += minutesAtYear * Integer.parseInt(date[2]);

		totalMinutes += (int)( ( cities.get(outCIty) - cities.get(inpCity) ) * 60 );

		// counting time difference
		String res = "";
		res += totalMinutes / minutesAtYear + "-"; // added year
		totalMinutes -= ( (int)(totalMinutes / minutesAtYear) ) * minutesAtYear;

		// starting counting new date
		int monthCounter = 0, mDaysSum = 0;
		for (int i = 0; i < monthes_v.length; i++){
			mDaysSum += monthes_v[i];
			monthCounter++;
			// System.out.println(mDaysSum + " - days");
			if (totalMinutes < mDaysSum * 24 * 60){
				mDaysSum -= monthes_v[i];
				break;
			}
		}

		res += monthCounter + "-"; // added month

		totalMinutes -= mDaysSum * 24 * 60;

		res += totalMinutes / (24 * 60); // added day

		totalMinutes -= ( (int)totalMinutes / (24 * 60) ) * 24 * 60;

		res += " " + ((totalMinutes / 60 < 10) ? "0" : "") + totalMinutes / 60; // added hours

		totalMinutes -= ( (int)(totalMinutes / 60) ) * 60;

		res += ":" + totalMinutes; // added minutes

		return res;
	}


	// Ex 10
	public static boolean isNew(int num){
		int size = digitsCount(num);
		if (size == 1)
			return true;

		for (int i = 1; i < size; i++){
			int n1 = num / (int)(Math.pow(10, size - i));
			int n2 = num % (int)Math.pow(10, size - i) / (int)Math.pow(10, size - i - 1);

			if ( !(n2 == 0 && i == 1) ){
				if (n1 >= n2)
					return false;
			}

			num = num % (int)Math.pow(10, size - i);
		}

		return true;
	}
}