package Collections;

import java.util.HashMap;

public class MapExample {

    public static void main (String [] args){


        HashMap<String,Integer> map1 = new HashMap<String, Integer>();

        map1.put("Item1", 100);
        map1.put("Item2", 200);
        map1.put("Item3", 100);
        map1.put("Item4", 50);

        System.out.println(map1);


        //Update the value of already present item
        map1.put("Item3", 300);
        System.out.println(map1);

        //Find the price of Item4 from map
        System.out.println("Price of Item4 is: "+map1.get("Item4"));

        //remove item2 from the map
        map1.remove("Item2");
        System.out.println(map1);

        for(int value:map1.values()){


            System.out.println("Value is: "+value);
        }

        //iterate through map


        for(String key:map1.keySet()){


            System.out.println("The kesy is: "+key);
            System.out.println("The value is: "+map1.get(key));
        }

        //find out occurrence of each word in the string sing hasmap.

        String str1 = "Clean world green world happy world";

        // clean 1
        // green 1
        // happy 1
        // world 3

    }
}
