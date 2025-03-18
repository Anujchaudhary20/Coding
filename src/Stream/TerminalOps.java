package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOps {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3);

        // 1. collect
        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1).toList();

        // 2. forEach
        list.stream().forEach(x-> System.out.println(x));

        // 3. reduce : Combines elements to produce a single result
        Optional<Integer> optionalInteger = list.stream().reduce(Integer::sum);
        System.out.println(optionalInteger.get());

        // 4. count

        // 5. anyMatch,allMatch,noneMatch
        boolean b = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);
        boolean b1 = list.stream().allMatch(x -> x > 0);
        System.out.println(b1);
        boolean b2 = list.stream().noneMatch(x -> x < 0);
        System.out.println(b2);

        // 6. findFirst, findAny
        System.out.println(list.stream().findFirst().get());
        System.out.println(list.stream().findAny().get());

        // 7. toArray() : convert stream into array
        Object[] array = Stream.of(1,2,3).toArray();

        // 8. min/max
        System.out.println("max " + Stream.of(2,33,69).max(Comparator.naturalOrder()).get());
        System.out.println("max " + Stream.of(2,33,69).max((o1, o2) -> o2-o1));   //OR
        System.out.println("min " + Stream.of(2,33,69).min(Comparator.naturalOrder()).get());

        // 9. forEachOrdered
        List<Integer> numbers0 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.print(" Using forEach with parallel stream :");
        numbers0.parallelStream().forEach(System.out::println);
        System.out.print(" Using forEachOrdered with parallel stream : ");
        numbers0.parallelStream().forEachOrdered(System.out::println);

        //Example: Filtering and Collection Names
        List<String> names = Arrays.asList("Anna","Bob","Charlie","David");
        System.out.println(names.stream().filter(x->x.length()>3).toList());

        //Example: Squaring and sorting Numbers
        List<Integer> number = Arrays.asList(5,6,3,4,6,7,8,3);
        System.out.println(number.stream().map(x->x*x).sorted().toList());

        //Example: Summing Value
        List<Integer> integers = Arrays.asList(5,6,3,4,6,7,8,3);
        System.out.println(integers.stream().reduce(Integer::sum).get());

        //Example: Counting Occurrences of Character
        String sentence = "Hello world";
        System.out.println(sentence.chars().filter(x->x=='l').count());

        //stateful vs stateless

        Stream<String> stream = names.stream();
        stream.forEach(System.out::println);
    //    List<String> list1 = stream.map(String::toUpperCase).toList(); // Exception because Foreach is terminal operation which u used in previous line
    }
}
