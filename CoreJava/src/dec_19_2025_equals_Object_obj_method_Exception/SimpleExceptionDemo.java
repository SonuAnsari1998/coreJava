package dec_19_2025_equals_Object_obj_method_Exception;

import module java.base;

public class SimpleExceptionDemo {
	void main() {
		try {
			Scanner sc = new Scanner(System.in);
			IO.println("Enter First Number");
			int a = sc.nextInt();
			IO.println("Enter Second Number");
			int b = sc.nextInt();
			IO.println("You entered a = " + a + " and b = " + b);
		} catch (Exception e) {
			if (e instanceof InputMismatchException) {
				IO.println(e.getMessage());
				IO.println(e);
				IO.println("InputMismatchException occurred. Please enter only integer numbers.");
				IO.println(e.fillInStackTrace());
			}
		}
	}
}
