package feb_04_2026_Stream_API;

import java.util.stream.Stream;

/*Assignment : Q2
-----------------
Use Stream.iterate or Stream.generate to create an Infinite stream then filter and map the 
data to produce the first 10 odd squares. 

Output :
1
9
25
49
81
121
169
225
289
361
 */
public class InfiniteStream {
	public static void main(String[] args) {
	
		 Stream.iterate(1, n -> n + 1)   
         .filter(n -> n % 2 != 0)  
         .map(n -> n * n)        
         .limit(10)               
         .forEach(System.out::println);

	}
}
