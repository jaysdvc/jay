/*
 * Question 1:
 *
 * The Sieve of Eratosthenes is the earliest means of finding prime numbers.  
 * A description can be found at https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes.
 * Develop an implementation of the Sieve of Eratosthenes.  
 * This implementation should be reusable 
 * (i.e. can be imported and used as-is in a micro-service or application).  
 * Provide an application that demonstrates the Sieve’s functionality 
 * (a console application is adequate). 
 * The application should prompt the user for an integer, 
 * display the prime numbers between 1 and the provided integer,
 * then prompt for another integer, and continue until the user exits.  
 * Also, provide unit test coverage for your implementation of the Sieve.
 * Any integer other than 0 or ± 1 that is not divisible without remainder 
 * by any other integers except ± 1 and ± the integer itself
 * A prime number (or a prime) is a natural number greater than 1 
 * that is not a product of two smaller natural numbers.
 * 
 * Version info: 1.0
 *
 * Copyright notice: none
 */
package demoapp;

/*
 * Used for console input - Packages used
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * The Sieve of Eratosthenes demo console application
 */
public class demomain {
	/*
	 * Text used for output to user
	 */
	static String[] str_Text = { "quit", "SIEVE OF ERATOSTHENES CLOSED.", "SIEVE OF ERATOSTHENES",
			"ENTER AN INTEGER: (quit ends program): ",
			"The Sieve of Eratosthenes is an ancient algorithm for finding all prime numbers.",
			"First enter an integer and the app will inform you if it is a prime number.",
			"Then the app will display all prime numbers to the value you entered.", " is a Prime Number.",
			" is not a Prime Number." };

	/*
	 * The Sieve of Eratosthenes demo console application
	 */
	public static void main(String[] args) {
		/*
		 * Run the application
		 */
		try {
			// run the application
			void_runPrimeNumbers();
		} catch (Exception err) {
			// any error message
			System.out.println(err.getMessage());
		} finally {
			// final action
			System.out.println(str_Text[1]);
		} // end try
	} // end main

	/*
	 * The Sieve of Eratosthenes demo console application - input loop
	 */
	static void void_runPrimeNumbers() {
		/*
		 * Endless loop for user input and display information
		 * quit stops loop and end applications
		 */
		try {
			// value for user input if not quit
			int int_value = 0;
			// value for loop until quit
			boolean bol_Loop = true;
			// get input for user
			// quit exit
			// value to test and list
			// continue loop 
			while (bol_Loop) {
				// user messages
				System.out.println(str_Text[2]);
				System.out.println(str_Text[4]);
				System.out.println(str_Text[5]);
				System.out.println(str_Text[6]);
				System.out.println(str_Text[3]);
				// set up to read user input
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				// user input
				String str_value = reader.readLine();
				// test user input
				if (str_value.equals(str_Text[0])) {
					// end loop
					bol_Loop = false;
				} else {
					// convert to integer and prime test value and display
					int_value = Integer.parseInt(str_value);
					void_PrimeNumbers(int_value);
					void_PrimeNumbersList(int_value);
				} // end if
			} // end while
		} catch (Exception err) {
			// any error message
			System.out.println(err.getMessage());
		} finally {
			// final action
			System.out.println("<===>");
		} // end try
	} // end void_runPrimeNumbers

	/*
	 * The Sieve of Eratosthenes demo console application - check number - input
	 * number
	 */
	static void void_PrimeNumbers(int int_value) {
		/*
		 * test number to see if prime
		 */
		try {
			// test and increment
			int i = 2;
			// count to test
			int int_count = 0;
			// loop 
			while (i < int_value) {
				// check 
				if (int_value % i == 0) {
					// count 
					int_count++;
					// end 
					break;
				} // end if
				i++;
			} // end while
			if (int_count == 0) {
				// user info
				System.out.println(int_value + str_Text[7]);
			} else {
				// user info
				System.out.println(int_value + str_Text[8]);
			} // end if
		} catch (Exception err) {
			// any error message
			System.out.println(err.getMessage());
		} finally {
			// final action
			System.out.println("<===>");
		} // end try
	} // end void_PrimeNumbers

	/*
	 * The Sieve of Eratosthenes demo console application - provide list user input
	 */
	static void void_PrimeNumbersList(int int_value) {
		/*
		 * list prime numbers to the user input value
		 */
		try {
			// test and increment
			int i;
			// number to test for list
			int int_number = 1;
			// count to test
			int int_count;
			// loop
			while (int_number <= int_value) {
				// assign
				int_count = 0;
				i = 2;
				// loop
				while (i <= int_number / 2) {
					// check
					if (int_number % i == 0) {
						// increment
						int_count++;
						// break
						break;
					} // end if
					// count
					i++;
				} // end while
				if (int_count == 0 && int_number != 1) {
					// user info
					System.out.print(int_number + "\n");
				} // end if
				// add
				int_number++;
			} // end while
		} catch (Exception err) {
			// any error message
			System.out.println(err.getMessage());
		} finally {
			// final action
			System.out.println("<===>");
		} // end try
	} // end void_PrimeNumbersList
}// end of demoapp