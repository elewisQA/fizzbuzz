package fizzbuzz;

public class fizzbuzz {
	public static void main(String[] args) {
		int i = 1;
		for (; i <= 50; i++) {
			String out = "";
			if (i % 3 == 0) {
				out += "Fizz";
			}
			if (i % 5 == 0) {
				out += "Buzz";
			}
			if (out.equals("")) {
				out += i;
			}
			System.out.println(out);
		}
		
		System.out.println("\n-----------");
		System.out.println("Lambda-FizzBuzz");
		LambdaFizzBuzz.run();
	}
}
