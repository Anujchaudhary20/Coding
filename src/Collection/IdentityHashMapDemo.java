package Collection;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        String key1 = new String("Key");
        String key2 = new String("Key");
        Map<String,Integer> map = new IdentityHashMap<>();
//      Map<String,Integer> map = new HashMap<>();
        map.put(key1,1);
        map.put(key2,2);
        System.out.println(map);
    }
}
