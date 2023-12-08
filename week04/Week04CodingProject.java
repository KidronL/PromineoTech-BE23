package week04;

public class Week04CodingProject {

	public static void main(String[] args) {
		
		//Question 1: Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		//Initializing ages array

		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		//Subtracting the first element from the last by subtracting index 0 from index 7 which programmatically done by array[x - 1]. If length is not known prior, array.length; can be used to find the length.
		
		System.out.println(ages[8 - 1] - ages[0]);
		
		
		//1b: Create a new array of int called ages2 with 9 elements (ages2 will be longer than the ages array, and have more elements).  
		int[] ages2 = {1,2,3,4,5,6,7,8,9};
		
		System.out.println(ages2[9 - 1] - ages2[0]);
		
		//This is a dynamic way of finding the index value of the last element
		
		int ageSum = 0;
		
		for (int age : ages) {
			
			ageSum += age;
		}
		
		System.out.println(ageSum/ages.length);
		
		//Question 2: Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		
		// 2a: create an enhanced "for each" loop that adds the length of each string in the array to a integer variable. Iterates through the array, then is divided by the length of the names array.
		
		int nameSum = 0;
		
		for (String name : names) {
			
			nameSum += name.length();		
				
		}
		
		System.out.println(nameSum/names.length);
		
		//2b: Use String builder to initiate a new string with the 0 index of the array. Then append each string in the array using a for loop and the append method.
		
		StringBuilder nameConcat = new StringBuilder(names[0]);
		
		for (int i = 1; i < names.length; i++) {
			nameConcat.append(" ").append(names[i]);
		}
		
		System.out.println(nameConcat.toString());
		
		// Question 3: How do you access the last element of any array?
		// Since you will not always know the given length of an array to pass in the final index, you would rather access the last element by using the length method - 1 as the final index will always be 1 less than the length of the array due to it being 0 indexed.
		
		System.out.println(names[names.length - 1]);
		
		// Question 4: How do you access the first element of any array?
		// The first index of an array is always 0 index
		
		System.out.println(names[0]);
		
		//Question 5: Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		
		int[] nameLengths = new int[names.length];
		
		for (int i = 0; i < names.length; i++) {
			
			nameLengths[i] = names[i].length();
			
			System.out.println(nameLengths[i]);
			
		}
		
		//Question 6: Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		// Creating an enhanced loop
		
		int lengthSum = 0;
		
		for (int length : nameLengths) {
			
			lengthSum += length;
			
		}
		
		System.out.println(lengthSum);
		
		//Question 7: Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		//Method declared outside of main method on line 108
		
		System.out.println(concatString("May", 4));
		
		
		//Question 8: Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		//Method declared outside of main method at line 123
		
		System.out.println(fullName("Kidron", "Lightfoot"));
		
		// Question 9: Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		// Method declared outside of main method at line 137
		
		int[] q9Arr = {10,15,25,33,50};
		
		System.out.println(sumOfInt(q9Arr));
		
		//Question 10: Write a method that takes an array of double and returns the average of all the elements in the array.
		//Method declared outside of main method on line 156
		
		double[] dubArr = {12.2,14.7,38.6,44.3};
		
		System.out.println(dubAvg(dubArr));
		
		//Question 11: Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		//Method Declared outside of main method on line 172
		
		double[] dubArr2 = {33.4,1.8,10.9,2.7};
		
		System.out.println(isGreaterThanOther(dubArr, dubArr2));
		
		//Question 12: Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		//Method declared outside of the main method on line 207
		
		boolean isHotOutside = true;
		double moneyInPocket = 13.22;
		
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
		
		//Question 13: Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		//This method is creating simple logic in self driving cars to tell the car to adjust speed for turn or to maintain speed. Set it as a String to allow for a more modular method.
		//Method declared outside of the main method on line 222
		
		boolean turnApproaching = true;
		double turnDistance = 1.4;
		
		System.out.println(speedCheck(turnApproaching, turnDistance));
		
		
	}
	
	
	//Question 7 method using SringBuilder to pass String argument into the string builder and append them to one another creating a new string. It iterates for the amount of times defined by argument passed in place of x.
	public static String concatString(String str1, int x) {
		
		StringBuilder word = new StringBuilder();
		
		for (int i = 0; i < x ; i++) {
			
			word.append(str1);
		}
		
		return word.toString();		
	}
	
	//Question 8 method where the parameters are set to firstName and lastName. Arguments passed in will return concatenated with a space separating them.
	public static String fullName(String firstName, String lastName) {
		
		return firstName + " " + lastName;
		
	}
	
	//Question 9 method where a for each loop was used in order to isolate each element in the parameter array then added each element to a variable named sum. The method would return a boolean value based on if sum was greater than 100.
	public static boolean sumOfInt(int[] arr) {
		
		int sum = 0;
		
		for (int num : arr) {
			sum += num;
		}
		
		return sum > 100;
	}
	
	//Question 10 method where a for each loop was used in order to isolate each element in the parameter array. Then each element was added to the double variable sum. The method returns a double that is the result of sum / arr.length.
	public static double dubAvg(double[] arr) {
		
		double sum = 0;
		
		for (double num : arr) {
			sum += num;
		}
		
		return sum/arr.length;
	}
	
	//Question 11 method where two for each loops were used in order to find the average of each array. Method returns a boolean value that will tell you if the first array is greater than the second.
	public static boolean isGreaterThanOther(double[] arr1, double[] arr2) {
		
		double sumArr1 = 0;
		double sumArr2 = 0;
		
		for( double num : arr1) {
			sumArr1 += num;
		}
		
		double arr1Avg = sumArr1/arr1.length;
		
		for( double num : arr2) {
			sumArr2 += num;
		}
		
		double arr2Avg = sumArr2/arr2.length;
		
		return arr1Avg > arr2Avg;
			
		}
	
	//Question 12 method where an if/else statement was made to check if parameter boolean was true and the value in parameter double was greater than 12.50. Method will result a boolean value based on values passed by arguments.
	public static boolean willBuyDrink(boolean x, double y) {
		
		boolean canBuyDrink;
		
		if (x == true && y >= 12.50) {
			canBuyDrink = true;
		} else canBuyDrink = false;
		
		return canBuyDrink;
	}
	
	//Question 13 method where an if else statement was made to check if parameter boolean was true and the value in the parameter double was less than 1.5.
	
	public static String speedCheck(boolean a, double b) {
		
		if (a == true && b <= 1.5) {
			return "Slow Down!";
		} else return "Maintain speed or speed up!";
	}
	
}
