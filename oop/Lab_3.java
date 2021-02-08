package oop;

import static java.lang.Math.round;
import java.util.Arrays;

public class Lab_3{
	// Lab 3

	// Ex 1
	public void millionsRounding(Object[][] cities){
		for (int k = 0; k < cities.length; k++){
			cities[k][1] = round( ((int)(cities[k][1]) / 1000000d) ) * 1000000;
		}
	}

}