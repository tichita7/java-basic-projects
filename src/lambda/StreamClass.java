package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClass {

	public static void main(String[] args) {
		//normal for sum
		int[] array = {1,2,3,4,5};
		int sum=0;
		for (int i =0;i<array.length;i++) {
			if(array[i]%2 == 0) {
				sum += array[i];
			}
		}
		System.out.println(sum);
		
		//with help of stream
//		int[] arr = {1,2,3,4,5};
//		int total = Arrays.stream(arr).filter(n->n%2==0);
		
		//create stream
		List<String> list = Arrays.asList("java", "python", "developer");
		Stream<String> myStream = list.stream();
		System.out.println(myStream);
		
		String[] arr = {"java", "python", "developer"};
		Stream<String> arrStream = Arrays.stream(arr);
		System.out.println(arrStream);
		
		Stream<Integer> intStream = Stream.of(1,2,3);
		System.out.println(intStream);
		
		Stream<Integer> limit = Stream.iterate(0, n -> n+1).limit(100);
		System.out.println(limit);
		
		Stream<String> limitString = Stream.generate(() -> "wiley").limit(5);
		System.out.println(limitString);
		
		Stream<Integer> limitRandom = Stream.generate(() -> (int)Math.random()).limit(5);
		System.out.println(limitRandom);
		
		List<Integer> lists = Arrays.asList(1,2,3,4,54,433);
		List<Integer> filteredData= 
				lists.stream()
				.filter(x -> x % 2 ==0)
				.collect(Collectors.toList());
		System.out.println(filteredData);
		
		List<Integer> mappedList = 
				filteredData.stream().map(n -> n/2)
				.collect(Collectors.toList());
		System.out.println(mappedList);
	}
}
