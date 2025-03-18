package Collection;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();
//        Hashtable is synchronized
//        no null key or value
//        Legacy class,ConcurrentHashMap
//        Slower than hashMap
//        Only liknkedlist in collision
        hashtable.put(1,"key1");
        hashtable.put(2,"key2");
        hashtable.put(3,"key3");
        System.out.println(hashtable);
//        hashtable.put(null,"value");//Throws Exception
//        hashtable.put(3,null);//Throws Exception
    }
}
