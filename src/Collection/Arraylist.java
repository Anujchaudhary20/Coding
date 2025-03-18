package Collection;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {

//        Array
//        int [] arr = new int[10];

//        List<Integer> list  = new ArrayList<>();
//        similar to line no 18
//        List<String> list1 = Arrays.asList("Monday", "Tuesday");
//        List<List<String>> list2 = Arrays.asList(list1);

          ArrayList<Integer> list = new ArrayList<>(1000);
          list.add(1);
          list.add(80);
          list.add(40);
          list.add(90);
          list.remove(1);
          list.remove(Integer.valueOf(1)); // 1 is object here
          //add new element
          list.add(2,80);
         Object[] array = list.toArray();
         Integer[] array2 = list.toArray(new Integer[0]);

        List<Integer> list3 = List.of(1, 2, 3, 4, 5); // not modifiable
          list.addAll(list3);

          //replace the element
          list.set(2,67);
        System.out.println(list);
        System.out.println(list.get(1)); //access element by index

        System.out.println(list.size());

        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //foreach
        for (int x:list){
            System.out.println(x);
        }

        System.out.println(list.contains(5)); // element exist or not
        System.out.println(list.contains(40));
//        Collections.sort(list);         similar to line 50
        list.sort(null);
        System.out.println(list);
    }
}
