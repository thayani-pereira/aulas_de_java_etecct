import java.awt.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class pipeline {
	public static void main(String[] args) {
	List list = (List) Arrays.asList(3, 4, 5, 10, 7);
	Stream<Integer> st1 = ((Collection<Integer>) list).stream().map(x -> x * 10);
	System.out.println(Arrays.toString(st1.toArray()));
	int sum = ((Collection<Integer>) list).stream().reduce(0, (x, y) -> x + y);
	System.out.println("Sum = " + sum);
	List newList = (List) ((Collection<Integer>) list).stream().filter(x -> x % 2 == 0)
	.map(x -> x * 10)
	.collect(Collectors.toList());
	System.out.println(Arrays.toString(((java.util.List<Integer>) newList).toArray()));
}

}