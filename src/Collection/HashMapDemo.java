package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap();
        map.put(2,"Neha");
        map.put(1,"anuj");
        map.put(3,"Simran");
        System.out.println(map);
        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Anuj"));
        //Set<Integer> keys = map.keySet();

        for (int i: map.keySet()){
            System.out.println(map.get(i));
        }
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> j :entries){
            j.setValue(j.getValue().toUpperCase());
        }
        System.out.println(map);


    }
}
