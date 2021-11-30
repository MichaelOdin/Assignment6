package assignment;

public class RecurAssign {

	//Recursive method that returns the sum of all the even numbers between smallestInt and largestInt
	//e.g. smallestInt: 3, largestInt:7, should return 10.
	//base case must call MyStackTrace.printTrace()
	public int sumEvenNumbersOnly(int smallestInt, int largestInt) {
		int sum = 0;
		if (smallestInt % 2 == 0 && smallestInt < largestInt) {
			sum += sumEvenNumbersOnly(smallestInt + 2, largestInt);
		}
		else if (smallestInt < largestInt){
			sum += sumEvenNumbersOnly(smallestInt + 1, largestInt);
		}
		MyStackTrace.printTrace();
		return sum;
	}
	
	//Recursive method that returns the given text without 'a' or 'A' in it.
	//e.g text: "Allan", should return the string "lln".
	//if text is null, return the empty string ""
	//base case must call MyStackTrace.printTrace()
	public String removeAs(String text) {
		return null;
	}
}
