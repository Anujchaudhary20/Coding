package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Mycomparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
//      return o1-o2; //it will return Ascending order (-ve)
        return o2-o1;  //it will return descending order (+ve)
    }
}

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
//        return o1.length() -o2.length(); //it will return Ascending order (small length word)
        return o2.length()-o1.length();  //it will return descending order (big length word)
    }
}

class Students{
    private String name;
    private double gpa;

    public Students(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public String getName(){return name;}
    public double getGpa(){return gpa;}

}

public class Comparators<I extends Number> {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("BANANA", "APPLE", "DATE");
        words.sort(new StringLengthComparatot());
        words.sort((a, b) -> a.length() - b.length());  //Lambda Expression
        System.out.println(words);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);

        list.sort(new Mycomparator());
        System.out.println(list);


        List<Students> students = new ArrayList<>();
        students.add(new Students("Anuj", 4));
        students.add(new Students("Charlie", 3));
        students.add(new Students("Bhuvi", 5));

        Comparator<Students> comparator = Comparator.comparing(Students::getGpa).reversed().thenComparing(Students::getName);
        students.sort(comparator);
//        students.sort((a,b)-> {
//            if (b.getGpa() - a.getGpa()>0){
//                return 1;
//            }else if (b.getGpa() - a.getGpa()<0){
//                return -1;
//            }else {
//                return a.getName().compareTo(b.getName());
//            }
//        });
        for (Students s:students){
            System.out.println(s.getName()+ ":"+s.getGpa());
        }
    }
}
