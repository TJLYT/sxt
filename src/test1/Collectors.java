import java.util.Arrays;

public class Collectors {
    /**
     * java 8 特性
     */
	
	
	public static void main(String[] args) {

        //3 apple, 2 banana, others 1
		//建一个数组
		List<String> test=
			Arrays.asList("apple","apple","apple1","banan","kk");
		  Map<String, Long> result =
	                items.stream().collect(
	                        Collectors.groupingBy(
	                                Function.identity(), Collectors.counting()
	                        )
	                );

	        Map<String, Long> finalMap = new LinkedHashMap<>();

	        //Sort a map and add to finalMap
	        result.entrySet().stream()
	                .sorted(Map.Entry.<String, Long>comparingByValue()
	                        .reversed()).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));

	        System.out.println(finalMap);


	    }
	}