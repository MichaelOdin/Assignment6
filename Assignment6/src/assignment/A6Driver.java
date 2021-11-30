package assignment;

public class A6Driver {
	public static void main(String[] args) {
		RecurAssign recurAssign = new RecurAssign();
		System.out.println(recurAssign.sumEvenNumbersOnly(-3, 5));
		System.out.println(recurAssign.sumEvenNumbersOnly(3, 7));
		System.out.println(recurAssign.sumEvenNumbersOnly(0, 5));
	
		System.out.println(recurAssign.removeAs(null));
		System.out.println(recurAssign.removeAs("a"));
		System.out.println(recurAssign.removeAs("A"));
		System.out.println(recurAssign.removeAs("Allan"));

	}


}
