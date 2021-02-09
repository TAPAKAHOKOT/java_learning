import Person_pack.Person;

import oop.Lab_1;
import oop.Lab_2;
import oop.Lab_3;

import java.lang.String; 
import java.util.Scanner;
import java.util.Arrays;


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

		Person ivan = new Person(169);
		System.out.println(ivan.say());


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
		System.out.println("\nEx 2: \t" + triangle_sides[0] + " " + triangle_sides[1]);

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
	}

	private static int test(int a, int b){
		return a + b;
	}
	
}