package stream_API_Logical_Program;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Test1 {
	void main() {

		System.out.println("Arrays.stream");
		String arrString[] = { "Mango", "Banana", "Apple", "Coconate", };
		Stream<String> stm = Arrays.stream(arrString);
		stm.forEach(IO::println);

		System.out.println("\nArrays.Intstream");
		int arrInt[] = { 12, 13, 14, 15, 16 };
		IntStream streamInt = Arrays.stream(arrInt);
		streamInt.forEach(IO::println);

		System.out.println("\nArrays.Longstream");
		long arrLong[] = { 10L, 20L, 30L, 40L, 50L };
		LongStream longStrm = Arrays.stream(arrLong);
		longStrm.forEach(IO::println);
		
		System.out.println("\nArrays.Doublestream");
		double doubleStrm[]= {100D, 200D, 300D, 400D, 500D};
		DoubleStream dbstrm=Arrays.stream(doubleStrm);
		dbstrm.forEach(IO::println);
		

	}
}
