package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionMap {
    public static void main(String[] args) {
        Map<Integer , String> mp = new HashMap<Integer , String>() ;

        mp.put(1, "Pankaj ") ;
        mp.put(2,"Dogra") ;
        mp.put(3,"Python") ;
        mp.put(4,"Java") ;
        mp.put(4,"Java") ;

        Map<Integer , String> mp1 = new TreeMap<Integer , String>() ;
        mp1.put(1, "Pankaj ") ;
        mp1.put(0,"Dogra") ;
        mp1.put(3,"Python") ;
        System.out.println("TreeMap: " + mp1);

        mp.put(1, "Pankaj ") ;
        mp.put(2,"Dogra") ;
        mp.put(3,"Python") ;
        mp.put(4,"Java") ;
        mp.put(4,"Java") ;


        System.out.println(mp);

        mp.values() ;
        System.out.println(mp.values());


        mp.keySet() ;
        System.out.println(mp.keySet());

        mp.containsKey(1) ;
        System.out.println(mp.containsKey(1));

        for(Map.Entry<Integer,String> it : mp.entrySet())
        {
            System.out.println(it);

            System.out.println(it.getKey());

            System.out.println(it.getValue());
        }

        for(Integer x : mp.keySet())
        {
            System.out.println(x);
        }

        for(String str: mp.values())
        {
            System.out.println(str);
        }

        mp.putIfAbsent(7, "Go") ;
        if(mp.containsKey(7))
        {
            mp.put(7, "Go") ;
        }

        if(mp.containsValue("Go"))
        {
            System.out.println("Mission Ok ");
        }

        System.out.println(mp);
    }
}
