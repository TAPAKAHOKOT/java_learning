import Person_pack.Person;
import Person_pack.Student;

import Comp_pack.Computer;

import Inter_pack.Array;
import Inter_pack.MyArray;
import Inter_pack.TestArray;

import oop.Lab_1;
import oop.Lab_2;
import oop.Lab_3;
import oop.Lab_4;
import oop.Lab_5;
import oop.Lab_6;

import java.lang.String; 
import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;


public class Main{
	public static void main(String[] args){
		// My code LOL
		// Вывод
		System.out.print("\n\nOutput\n\n");

		System.out.print("Hello World");	

		// Переменные 
		System.out.print("\n\nVariables\n\n");

		String line = "\nSome line";
		boolean isTrue = true;
		double doub_num = 3.14d;

		System.out.println(line);	
		System.out.println(test(1, 2));

		// Ввод
		// System.out.print("\n\nInput\n\n");
		// 
		// Scanner u_input = new Scanner(System.in);
		// System.out.println("User input = " + u_input.nextLine()); // Ввод строки
		// System.out.println(u_input.nextInt()); // Ввод инт

		// Матем. операции
		System.out.print("\n\nMath operations\n\n");

		Scanner i_num = new Scanner(System.in);
		int a = 3, b = 2;
		a--;
		b *= 3;

		System.out.printf("a=%s b=%s\n", a, b);

		// Условные операторы
		System.out.print("\n\nIf Else / Switch Case\n\n");

		if (a > b)
			System.out.printf("a(%s) > b(%s)\n", a, b);
		else
			System.out.printf("a(%s) <= b(%s)\n", a, b);

		String new_line = a > b ? "a > b" : "a <= b";

		switch (a){
			case 1:
				System.out.println("A is 1");
				break;
			case 2:
				System.out.println("A is 2");
				break;
			default:
				System.out.println("A is Unknown");
		}

		// Циклы
		System.out.print("\n\nCycles\n\n");

		for (int k = 0; k < 10; k++){
			System.out.print(k + (k == 9 ? " |" : " _ ") );
		}

		System.out.print("\n");
		int i = 9;
		while (i >= 0){
			System.out.print(i + (i == 0 ? " |" : " _ ") );
			i--;
		}

		System.out.print("\n");
		i = 0;
		do {
			System.out.print(i + (i == 9 ? " |" : " _ ") );
			i++;
		} while (i < 10);

		// Массивы
		System.out.print("\n\nArrays\n\n");

		// int[] arr = new int[] {3, 2, 1};
		int[] arr = {3, 2, 1};
		System.out.println(Arrays.toString(arr));

		// Многомерный массивы
		System.out.print("\n\nMulti Arrays\n\n");

		int[][] m_arr = {{1, 2, 3}, {4, 5, 6}};
		// System.out.println(Arrays.toString(m_arr[0]) + "\n" + Arrays.toString(m_arr[1]));
		Arrays.stream(m_arr).map(Arrays::toString).forEach(System.out::println);

		// Функции
		// System.out.print("\n\nFunctions\n\n");

		// Классы
		System.out.print("\n\nClasses\n\n");

		Person ivan = new Person();
		System.out.println(ivan.say());

		// Наследование 
		Student john = new Student(4, 173);
		System.out.println("\n" + john.tell());
		System.out.println(john.say());

		// Вложенные классы
		Computer pc = new Computer();
		pc.i7.start();
		System.out.println("\n" + pc.i7.status());
		System.out.println(pc.transfer.status());

		// Анонимные классы 
		new Computer(){
			void fastTunning(){
				this.i7.start();
				this.transfer.start();
			}
		};

		// Абстрактные классы
		// public abstract class...
		// abstract pupbil void ...
		// Абстрактный метод может быть только в абстрактном классе
		// Нельзя создать абстрактный класс

		// Перегрузка методов
		System.out.println("\n" + summ(1, 2)); 
		System.out.println(summ(1, 2, 3)); 
		System.out.println(summ(1, 2.5f)); 

		// static && final
		// static позволяет взывать метод или поле класса, без содания экземпляра класса
		// int x = math.summ(1, 2);

		// final a = 10;
		// теперь а - константа, ее нельзя менять

		// Если написать public final class...
		// то наследника у этого класса быть не может

		// Если public final void 
		// То мы не сможем переопределить этот меод

		// интерфейсы
		Array inter_a = new MyArray();
		System.out.println("\n" + inter_a.Add(3));
		System.out.println(inter_a.Add(1));
		System.out.println(inter_a.Add(4));
		System.out.println(inter_a.Get(2));


		Array inter_b = new TestArray();
		System.out.println("\n" + inter_b.Add(1));
		System.out.println(inter_b.Add(1));
		System.out.println(inter_b.Add(2));
		System.out.println(inter_b.Add(3));
		System.out.println(inter_b.Get(-1));
		System.out.println(inter_b.Get(-10));


		// Решение лаб
		System.out.print("\n\nLabs\n\n");

		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Lab 1 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		Lab_1 my_Lab_1 = new Lab_1();
		System.out.println("<<< Lab 1 >>>\n");

		System.out.println("Ex 1\t" + my_Lab_1.convert(3));
		System.out.println("Ex 2\t" + my_Lab_1.points(17, 12));
		System.out.println("Ex 3\t" + my_Lab_1.footballPoints(3, 4, 2));
		System.out.println("Ex 4\t" + my_Lab_1.divisibleByFive(37));
		System.out.println("Ex 5\t" + my_Lab_1.and(true, true));
		System.out.println("Ex 6\t" + my_Lab_1.howManyWalls(46, 5, 4));
		System.out.println("Ex 7\t" + my_Lab_1.squared(9));
		System.out.println("Ex 8\t" + my_Lab_1.profitableGamble(0.9, 3, 2));
		System.out.println("Ex 9\t" + my_Lab_1.frames(10, 25));
		System.out.println("Ex 10\t" + my_Lab_1.mod(218, 5));

		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Lab 2 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		Lab_2 my_Lab_2 = new Lab_2();
		System.out.println("\n<<< Lab 2 >>>\n");

		System.out.println("Ex 1\t" + my_Lab_2.oppositeHouse(5, 46));
		System.out.println("Ex 2\t" + my_Lab_2.nameshuffle("Donald Trump"));
		System.out.println("Ex 3\t" + my_Lab_2.discount(89, 20));

		int[] arr_1 = {44, 32, 86, 19};
		System.out.println("Ex 4\t" + my_Lab_2.differenceMaxMin(arr_1));
		System.out.println("Ex 5\t" + my_Lab_2.equal(3, 3, 3));
		System.out.println("Ex 6\t" + my_Lab_2.reverse("Hello It's me!"));
		System.out.println("Ex 7\t" + my_Lab_2.programmers(147, 33, 526));
		System.out.println("Ex 8\t" + my_Lab_2.getXO("xooX"));
		System.out.println("Ex 9\t" + my_Lab_2.bomb("Bomd is here, bomb!"));
		System.out.println("Ex 10\t" + my_Lab_2.sameAscii("AA", "B@"));

		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Lab 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		Lab_3 my_Lab_3 = new Lab_3();
		System.out.println("\n<<< Lab 3 >>>\n");

		Object[][] cities = {{"Nice", 942208},
							{"Abu Dhabi", 1482816},
							{"Naples", 2186853},
							{"Vatican City", 572}};			
		System.out.println("Ex 1: \n");
		my_Lab_3.millionsRounding(cities);

		for (int k = 0; k < cities.length; k++){
			System.out.println(cities[k][0] + " - " + cities[k][1]);
		}

		double[] triangle_sides = my_Lab_3.otherSides(2);
		System.out.println("\nbEx 2: \t" + triangle_sides[0] + " " + triangle_sides[1]);

		System.out.println("Ex 3: \t" + my_Lab_3.rps("paper", "rock"));

		int[] nums_arr = {12, 90, 75};
		System.out.println("Ex 4: \t" + my_Lab_3.warOfNumbers(nums_arr));
		System.out.println("Ex 5: \t" + my_Lab_3.reverseCase("sPoNtAnEoUs"));
		System.out.println("Ex 6: \t" + my_Lab_3.inatorInator("Doom"));
		System.out.println("Ex 7: \t" + my_Lab_3.doesBrickFit(1, 2, 2, 1, 1));
		System.out.println("Ex 8: \t" + my_Lab_3.totalDistance(36.1, 8.6, 3, true));

		int[] nums_arr_2 = {1, 0, 4, 5, 2, 4, 1, 2, 3, 3, 3};
		System.out.println("Ex 9: \t" + my_Lab_3.mean(nums_arr_2));
		System.out.println("Ex 10: \t" + my_Lab_3.parityAnalysis(243));

		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Lab 4 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		Lab_4 my_Lab_4 = new Lab_4();
		System.out.println("\n<<< Lab 4 >>>\n");

		int[] nums_arr_3 = {3, 2, 1, 4, 5, 6, 7};
		System.out.println("Ex 1: \t" + my_Lab_4.sevenBoom(nums_arr_3));
		int[] nums_arr_4 = {5, 6, 7, 8, 9, 9};
		System.out.println("Ex 2: \t" + my_Lab_4.cons(nums_arr_4));
		System.out.println("Ex 3: \t" + my_Lab_4.unmix("hTsii  s aimex dpus rtni.g"));
		System.out.println("Ex 4: \t" + my_Lab_4.noYelling("Oh my goodness!!! WOOOW!?!?!"));
		System.out.println("Ex 5: \t" + my_Lab_4.xPronounce("The x box xylophone was excellent!"));
		int[] nums_arr_5 = {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5};
		System.out.println("Ex 6: \t" + my_Lab_4.largestGap(nums_arr_5));
		System.out.println("Ex 7: \t" + my_Lab_4.funFun(7977));
		System.out.println("Ex 8: \t" + my_Lab_4.commonLastVowel("Watch the characters dance"));
		System.out.println("Ex 9: \t" + my_Lab_4.memeSum(122, 81));
		System.out.println("Ex 10: \t" + my_Lab_4.unrepeated("call 911"));

		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Lab 5 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		System.out.println("\n<<< Lab 5 >>>\n");

		System.out.println("Ex 1: \t" + Lab_5.sameLetterPattern("ABAB", "CDCD"));
		System.out.println("Ex 2: \t" + Lab_5.spiderVsFly("H3", "E2"));
		System.out.println("Ex 3: \t" + Lab_5.digitsCount(10));
		System.out.println("Ex 4: \t" + Lab_5.totalPoints(new String[] {"trance", "recant"}, "recant"));
		System.out.println("Ex 5: \t" + Lab_5.longestRun(new int[] {2, 3, 2, 1, 10, 11, 15}));
		System.out.println("Ex 6: \t" + Lab_5.takeDownAverage(new String[] {"95%", "83%", "90%", "87%", "88%", "93%"}));
		System.out.println("Ex 7: \t" + Lab_5.rearrange("Tesh3 th5e 1I lov2e way6 she7 j4ust i8s."));
		System.out.println("Ex 8: \t" + Lab_5.maxPossible(8732, 91255));
		System.out.println("Ex 9: \t" + Lab_5.timeDifference("Los Angeles", "April 1, 2011 23:23", "Canberra"));
		System.out.println("Ex 10: \t" + Lab_5.isNew(203));

		// >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Lab 6 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		System.out.println("\n<<< Lab 6 >>>\n");
		System.out.println("Ex 1: \t" + Lab_6.hiddenAnagram("D  e b90it->?$ (c)a r...d,,#~", "bad credit"));
		System.out.println("Ex 2: \t" + Arrays.toString(Lab_6.collect("intercontinentalisationalism", 6)));
		System.out.println("Ex 3: \t" + Lab_6.nicoCipher("mubashirhassan", "crazy"));
		System.out.println("Ex 4: \t" + Arrays.toString(Lab_6.twoProduct(new int[] {1, 2, 3, 9, 4, 5, 15, 3}, 45)));
		System.out.println("Ex 5: \t" + Arrays.toString(Lab_6.isExact(40320)));
		System.out.println("Ex 6: \t" + Lab_6.fractions("0.19(2367)"));
		// System.out.println("Ex 7: \t" + Lab_6.pilString("33314444155555"));
		System.out.println("Ex 7: \t" + Lab_6.pilString("3331444415"));
		System.out.println("Ex 8: \t" + Lab_6.generateNonconsecutive(4));
		System.out.println("Ex 9: \t" + Lab_6.isValid("abbcc"));
		System.out.println("Ex 10: \t" + Arrays.deepToString((Lab_6.sumsUp(new int[] {1, 6, 5, 4, 8, 2, 3, 7}))));


		System.out.println("\n\n\n\n\n");
		int[] arr_sort = {4, 7, 3, 10, 1, 5, 8, 9, 6, 0, 2};
		Integer[] arr_sort_2 = {4, 7, 3, 10, 1, 5, 8, 9, 6, 0, 2};
		System.out.println("Array: " + Arrays.toString(arr_sort));

		LinkedList<Integer> arr_sort_3 = new LinkedList<Integer>(Arrays.asList(arr_sort_2));
		LinkedList<Integer> result =  lazyQuickSort(arr_sort_3);

		System.out.println("Sorted array: " + result.toString());

		quickSort(arr_sort, 0, arr_sort.length-1);
		System.out.println("Sorted array: " + Arrays.toString(arr_sort));
		
	}

	private static int test(int a, int b){
		return a + b;
	}

	static int summ(int a, int b){
		return a + b;
	}
	static int summ(int a, int b, int c){
		return a + b + c;
	}
	static float summ(int a, float b){
		return a + b;
	}

	static <T> LinkedList<Integer> lazyQuickSort(LinkedList<Integer> arr){
		if (arr.size() < 2)
			return arr;
		else{
			int pivot = arr.get(0);
			LinkedList<Integer> less = new LinkedList<Integer>();
			LinkedList<Integer> greater = new LinkedList<Integer>();



			for (int i = 1; i < arr.size(); i++){
				int el = arr.get(i);

				if (el < pivot)
					less.add(el);
				else 
					greater.add(el);
			}


			less = lazyQuickSort(less);
			greater = lazyQuickSort(greater);


			LinkedList<Integer> res = new LinkedList<Integer>();
			for (int i = 0; i < less.size(); i++)
				res.add(less.get(i));
			res.add(pivot);
			for (int i = 0; i < greater.size(); i++)
				res.add(greater.get(i));

			return res;

		}

	}

	static void quickSort(int[] arr, int start, int end){
		int pivot = start;
		int low = start+1;
		int hight = end;

		while (start < end){
			if (arr[low] > arr[pivot] && arr[hight] < arr[pivot]){
				int temp = arr[low];
				arr[low++] = arr[hight];
				arr[hight--] = temp;
			}

			if(arr[low] < arr[pivot])
				low++;
			if (arr[hight] > arr[pivot])
				hight--;

			if (low >= hight){
				int temp = arr[pivot];
				arr[pivot] = arr[low-1];
				arr[low-1] = temp;

				quickSort(arr, start, low-1);
				quickSort(arr, low, end);
				break;
			}
		}
	}
	
}