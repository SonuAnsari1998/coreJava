package feb_03_2026_Stream_API_Logical_Program;

import java.util.Arrays;

/*4. WAP to print all the names whose length is greater than 3 from String array and 
 * convert into array*/
public class FilterNamesByLength {
	void main() {
		String arr1[]= {"Sonu", "Rahul", "Rav", "Arshad", "Scott"};
		Object arr2[]=Arrays.stream(arr1).filter(name->name.length()>4).toArray();
		System.out.println(Arrays.toString(arr2));
	}
}
