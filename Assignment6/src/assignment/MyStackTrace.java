package assignment;

public class MyStackTrace {
	public static void printTrace() {
		StackTraceElement [] trace =Thread.currentThread().getStackTrace(); 
		for(int i=2; i<trace.length; i++) {
			int stopIndex = trace[i].toString().indexOf('(');
			System.out.println(trace[i].toString());
		}
	}

}
