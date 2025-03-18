package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        // Set is collection that cannot contain duplicate elements
        // faster operation
        // Set ---> HashSet, LinkedHashSet, TreeSet, EnumSet

        Set<Integer> set = new HashSet<>();        //for unordered element
//      Set<Integer> set = new LinkedHashSet<>();  //for ordered element
//      Set<Integer> set = new TreeSet<>();        //for sorted element
        set.add(12);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(67);
        System.out.println(set);
    }
}
