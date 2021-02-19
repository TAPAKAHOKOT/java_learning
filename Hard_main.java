import java.util.ArrayList;
import java.util.LinkedList;

// import java.io.*;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

import Thread_pack.MainThread;
import Thread_pack.InterThread;

public class Hard_main{
	public static void main(String[] args){
		// <<<<< 1 >>>>>
		// динамичные массивы

		ArrayList<Integer> dyn_arr = new ArrayList<>(2);
		dyn_arr.add(11);
		dyn_arr.add(17);
		dyn_arr.add(19);
		// dyn_arr = [11, 17, 19]

		// dyn_arr.clear();
		// dyn_arr = []

		// get array size

		dyn_arr.remove(1);
		// dyn_arr = [11, 19]

		for (Integer k : dyn_arr){
			System.out.println(k);
		}

		System.out.println("\n");

		LinkedList<String> names = new LinkedList<>();
		names.add("Ivan");
		names.add("Nastya");
		names.add("Elon");

		names.add(2, "Alex");

		for (String k : names){
			System.out.println(k);
		}


		// <<<<< 2 >>>>>
		// исключения

		try {
			int num = 100 / 0;
		}	catch(ArithmeticException err){
			System.out.println("\nArithmetic Error info: " + err);
		}	catch(Exception err) {
			System.out.println("\nError info: " + err);
		} finally {
			System.out.println("TryCatch ended up");
		}


		// <<<<< 3 >>>>>
		// файлы

		// Сохранение информации в файл
		try {
			File file = new File("learning_file.txt");

			if (!file.exists()){
				file.createNewFile();
				System.out.println("File created");
			}

			PrintWriter pw = new PrintWriter(file);
			pw.println("First line // I suppose it works");
			pw.println("Second line // It really works");

			pw.close();

		} catch(IOException err) {
			System.out.println("IO error info: " + err);
		}

		// Чтение информации из файла
		try {
			File file = new File("learning_file.txt");

			BufferedReader bf = new BufferedReader(new FileReader("learning_file.txt"));
			String line;

			System.out.println("\n");
			while ((line = bf.readLine()) != null)
				System.out.println(line);

			bf.close();
		} catch(IOException err) {
			System.out.println("IO error info: " + err);
		} catch(Exception err) {
			System.out.println("Error info: " + err);
		}


		// <<<<< 4 >>>>>
		// потоки

		MainThread testing_th_1 = new MainThread();
		Thread testing_th_2 = new Thread(new InterThread());
		Thread testing_th_3 = new Thread(new Runnable(){
			@Override
			public void run(){
				for (int i = 1; i < 6; i++){
					System.out.println("Num is: " + i);
				}
			}
		});

		testing_th_2.start();
		testing_th_3.start();
	}
}