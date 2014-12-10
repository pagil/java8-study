package java8prj01;

import java.util.stream.Stream;


public class ComparatorLambda {

    public static void main(String... args) {
        // Sort in reverse order
        Stream.of(1, 3, 5, 7).sorted((i1, i2) -> (i2 - i1)).forEach(System.out::println);
    }
}
