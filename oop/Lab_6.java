package oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Lab_6{
	// Lab 6

	// Ex 1
	public static String hiddenAnagram(String line0, String line1){
		int counter;
		String res = "";
		char let;

		ArrayList<Character> mainLetArr = new ArrayList<>();
		ArrayList<Character> letArr;

		for (int i = 0; i < line1.length(); i++){
			let = line1.toLowerCase().charAt(i);
			if ((int)let > 96 && (int)let < 123)
				mainLetArr.add(let);
		}

		for (int k = 0; k < line0.length(); k++){

			res = "";
			counter = -1;
			letArr = new ArrayList<>(mainLetArr);

			for (int i = k; i < line0.length(); i++){
				let = line0.toLowerCase().charAt(i);
				if ((int)let < 97 || (int)let > 122)
					counter++;
				else if (letArr.contains(let)){

					if (counter == -1)
						counter = i;
					else if (i - counter != 1){
						res = "notfound";
						break;
					}
					else 
						counter = i;

					res += let;
					letArr.remove(letArr.indexOf(let));
				}
			}

			if (letArr.size() == 0){
				break;
			}
			else
				res = "notfound";
		}

		return res;
	}

	// Ex 2
	public static String[] collect(String line, int sliceLen){
		if (line.length() < sliceLen){
			return new String[] {};
		}
		else{
			String newLine = "", oldLine = "";
			for (int i = 0; i < line.length(); i++){
				if (i < sliceLen)
					newLine += line.charAt(i);
				else
					oldLine += line.charAt(i);
			}

			return append(collect(oldLine, sliceLen), newLine);
		}
	}

	private static <T>T[] append(T[] arr, T el){
		int arrSize = arr.length;
		arr = Arrays.copyOf(arr, arrSize + 1);
		arr[arrSize] = el;
		Arrays.sort(arr);
		return arr;
	} 

	// Ex 3
	public static String nicoCipher(String mes, String key){
		int[] keyArr = new int[key.length()];
		ArrayList<String> arr = new ArrayList<>(Arrays.asList(key));
		Collections.sort(arr);

		System.out.println(arr);

		for (int i = 0; i < keyArr.length; i++){
			keyArr[i] = arr.indexOf(key.charAt(i));
			// arr[keyArr[i]] = "0";
		}

		System.out.println(Arrays.toString(keyArr));

		return "";
	}

}



/*
Пчелиные приключения

Пока простой пчеловод пытался привлечь постоянных покупателей 
в пригородный павильон продаж парфюмерии, противные птички принесли
проблемы повлиявшие на появлие посетителей. Позже, попытки помешать
получившемуся положению привели к планомерной потери приличной прибыли.
Пришлось привлекать посторонних предпринимателей, проводящих постепенное 
перенаселение птиц по пути, приводящему к Португалии. После планового 
перемещения противников продаж пчеловод почувствовал печаль, потребовавшую 
пренепременного посещения к Португалии, в поисках птиц, потерянных по причине
пренебежительности к пению.
Почему? Просто пение птиц приносит приятное послевкусие перекрывающие 
проделки пернатых. 60

*/

/*
Вдруг виновник войны ворвался во внутреннее 
воинскоге ведомство вскликнув внезапное высказывание влечащее
восторженные возгласы. Верные воевода внял всем вокруг о важности
взрывного вооружения. Вздох 
*/