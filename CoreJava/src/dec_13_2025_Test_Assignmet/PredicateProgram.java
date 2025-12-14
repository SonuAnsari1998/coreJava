package dec_13_2025_Test_Assignmet;

import java.util.function.Predicate;

/*03.
Description:
You are required to write a Java program that demonstrates how to combine two
Predicate conditions using the and() method from the java.util.function.Predicate
interface.

Your task:
Accept an integer input N.

Create two predicates:
Predicate 1: Check if the number is even.
Predicate 2: Check if the number is greater than 10.

Combine both predicates using the and() method.
Evaluate the input number using the combined predicate.
Print whether the number satisfies both conditions

Constraints:
Input must be an integer. 1 N 109 You must use: Predicate<Integer> test() and() method

Sample Input:
12

Sample Output:
Number satisfies both predicates: true

Explanation:
Predicate 1 returns true if the number is even. Predicate 2 returns true if the number is greater
than 10. The and() method combines them so the number must satisfy both conditions.
Example: Input: 12 Even? Greater than 10? Combined result:*/
public class PredicateProgram {
	void main() {
		int n = Integer.parseInt(IO.readln("Enter a Number :"));
		Predicate<Integer> p = s -> n % 2 == 0;
		Predicate<Integer> q = t -> n >= 10;
		if (p.test(n) && q.test(n)) {
			IO.println("Number satisfies both predicates: " + p.test(n));
		} else {
			IO.println("Number Not satisfies both predicates: " + q.test(n));
		}
	}
}
