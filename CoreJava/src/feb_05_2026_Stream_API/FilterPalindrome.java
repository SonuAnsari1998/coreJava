package feb_05_2026_Stream_API;

import java.util.stream.Stream;

/*Q6) WAP to filter Palindrome Words from an Array.

String[] words = {"madam", "hello", "racecar", "java", "level", "world"};

Output : Palindrome Words: [madam, racecar, level]*/
public class FilterPalindrome {
	public static void main(String[] args) {
	String[] words = { "madam", "hello", "racecar", "java", "level", "world" };
	
	Stream.of(words).filter(name -> {
		boolean isPalindrome = true;
		for(int i=0;i<=name.length()/2;i++) if(name.charAt(i) != name.charAt(name.length()-i-1)) isPalindrome = false;
		return isPalindrome;
	}).forEach(IO::println);
	}
}
