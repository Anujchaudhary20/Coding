package Collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.get(2); // time complexity 0(n) because we are using loop here
        linkedList.addFirst(4);// 0(n)
        linkedList.getFirst();
        System.out.println(linkedList);
        linkedList.removeIf(x-> x%2==0);
        System.out.println(linkedList);

        LinkedList<String> animal = new LinkedList<>(Arrays.asList("Cat","Dog","Elephant"));
        LinkedList<String> animalTRemove = new LinkedList<>(Arrays.asList("Cat"));
        animal.removeAll(animalTRemove);
        System.out.println(animal);
    }

}