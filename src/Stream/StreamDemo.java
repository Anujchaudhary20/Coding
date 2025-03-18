package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        //feature introduce in Java 8
        //process collection of data in a functional and declarative manner
        //simplify Data Processing
        //Embrace Functional Programming
        //Improve Readability and Maintainability
        //Enable Easy Parallelism

        //What is Stream?
        //Sequence of Element supporting functional and declarative programming.

        //How to use Streams?
        //source, intermediate operation & terminal operation

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = numbers.stream();
//        int count =0;
//        for (int i : numbers){
//            if(i%2==0){
//                count++;
//            }
//        }
//        System.out.println(count);
        System.out.println(numbers.stream().filter(x-> x%2==0).count());

        ////Creating Streams
        // 1. From Collections
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> streams = list.stream();

        // 2. Arrays
        String [] array = {"a","b","c"};
        Stream<String> stream1 = Arrays.stream(array);

        // 3. Using stream.of()
        Stream<String> stream2 = Stream.of("a", "b", "c");

        //infinite Streams
        Stream<Integer> generate = Stream.generate(() -> 1);
        //OR
        List<Integer> collect = Stream.iterate(1, x -> x + 2).limit(50).collect(Collectors.toList());
        System.out.println(collect);
    }
}
