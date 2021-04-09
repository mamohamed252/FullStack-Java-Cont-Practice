package wee7Review.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sandbox {

	public static void main(String[] args) {
//		reviewOne();
//		reviewTwo();
//		reviewThree();
//		reviewFour();
//		reviewFive();
		reviewSix();
//		reviewSeven();
	}

	private static void reviewSix() {
		String colors[] = { "Blue", "Red", "Brown", "BRay" };

		Consumer<String> toLowerCase = (x -> x.toLowerCase());

		Stream.of(colors).filter(y -> y.startsWith("B")).sorted().forEach(System.out::println);

		Stream.of(colors).forEach(toLowerCase);

		System.out.println("---------------");
		Stream.of(colors).filter(y -> y.startsWith("R")).sorted().forEach(System.out::println);

//		Stream.of(colors).filter(y -> y.startsWith("B")).forEach(System.out::println);

	}

	private static void reviewFive() {
		String[] array = { "y", "z", "x" };

		Stream streamA = Stream.of(array);

//		streamA.forEach(msg -> System.out.print(msg));
		streamA.sorted().forEach(msg -> System.out.println(msg));

	}

	private static void reviewFour() {

		String[] array = { "y", "a", "x" };
		ArrayList<String> list = new ArrayList<String>();
		list.add("x");
		list.add("y");

		Stream streamA = Stream.of(array);
		Stream streamB = Stream.of(list);

		Collector collector = Collectors.joining("");

//		streamA.forEach(msg -> System.out.print(msg));

		System.out.println(streamA.collect(collector));
//
		System.out.println(streamB.collect(collector));

//		Collector collector = Collectors.joining("*");

////		if(stream.collect(collector).equals(stream.sorted().collect(collector))) {
//		if(stream.sorted().collect(collector).equals(stream.collect(collector))) {
//
//			System.out.println("Stream sorted");
//			System.out.println(stream.collect(collector));
//		} else {
//			System.out.println("Stream Not sorted");
//			System.out.println(stream.collect(collector));
//			
//		}

//		stream.forEach(msg -> System.out.print(msg));
////	System.out.println(stream);

////System.out.println(stream.sorted());
//
//System.out.println(stream.sorted().collect(collector));		
//	System.out.println(stream.sorted().collect(collector));

//				
//		streamA = Arrays.stream(array);
	}

	// StringBuffer
	private static void reviewThree() {
		StringBuffer sbA = new StringBuffer("135");

		sbA.replace(0, 5, "6789");
		sbA.insert(0, "12345");
		System.out.println(sbA);

		StringBuffer sbB = new StringBuffer("135");
		sbB.replace(0, 5, "6789").insert(0, "12345");
		System.out.println(sbB);

		StringBuffer sbC = new StringBuffer("135");
		sbC.insert(0, "12345").replace(5, 10, "6789");
		System.out.println(sbC);

	}

	private static void reviewTwo() {

		Tiger tiger = new Tiger();
		System.out.println(tiger.says());

		System.out.println(new Tiger2().says());

		System.out.println(tiger.run());

		System.out.println(new Tiger2().run());

	}

	public static void reviewOne() {
		// n -> { return n*n}

		MyFunctionalInterface f = n -> {
			return n * n;
		};

		System.out.println(f.square(5));

		MyFunctionalInterface s = new SquareString();

		System.out.println(s.square("testing"));

	}

}
