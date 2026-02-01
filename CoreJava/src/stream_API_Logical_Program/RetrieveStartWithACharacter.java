package stream_API_Logical_Program;
/*2) Retrieve all the names which starts from character A using Stream API and Convert the 
Stream to Set interface.*/

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.w3c.dom.NameList;

public class RetrieveStartWithACharacter {
	void main() {
		List<String> nameList = Arrays.asList("Sonu", "Amit", "Rahul", "Raju", "Raj", "Raju", "Amit");

		Set<String> list = nameList.stream().filter(name -> name.startsWith("R")).collect(Collectors.toSet());
		System.out.println("Filter using Set");
		list.forEach(IO::println);

		List<String> nameList1 = Arrays.asList("Sonu", "Amit", "Rahul", "Raju", "Raj", "Raju", "Amit");

		List<String> list1 = nameList1.stream().filter(name -> name.startsWith("R")).collect(Collectors.toList());

		System.out.println("\nFilter using List");
		list1.forEach(IO::println);
	}
}
