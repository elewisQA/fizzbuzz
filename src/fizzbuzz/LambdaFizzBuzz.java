package fizzbuzz;

public class LambdaFizzBuzz {
	// Defining function interface & operation format
	interface functionInterface {
		void operation(int x);
	}
	
	private void operate(int x, functionInterface functionObject) {
		functionObject.operation(x);
	}
	
	public static void run() {
		functionInterface fizzBuzz = (int x) -> {
			String out = "";
			if (x % 3 == 0) {out += "Fizz";}
			if (x % 5 == 0) {out += "Buzz";}
			if (out == "") { out = "" + x;}
			System.out.println(out);
		};
		
		LambdaFizzBuzz lambda = new LambdaFizzBuzz();
		
		for (int i = 1; i <= 50; i++) {
			lambda.operate(i, fizzBuzz);
		}
	}
}
