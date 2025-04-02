
import java.util.*;

public class hash {
          public static void main(String[] args) {
                    HashMap<String,Integer> map = new HashMap<>();

                 //insertion
                    map.put("india", 200);
                    map.put("china", 123);
                    map.put("argentina", 346);

                    System.out.println(map);
                    map.put("china", 500);
                    System.out.println(map);
                    //if key exist then value will be updated, and key is not exist then new pair will be inserted
                    if (map.containsKey("china")) { //exist the give true not exist then give false
                              System.out.println("present in the map");
                    } else {
                              System.out.println("not present in the map");
                    }
                    // System.out.println(map.get("india"));//.get if key exist then give value, and key does not exist get null 
                    // System.out.println(map.get("indi"));
                    // int[] arr = { 1, 2, 3, 4 };
                    // for (int i = 0; i < arr.length; i++) {
                    //           System.out.print(arr[i] + " ");
                    // }
                    // System.out.println();

                    // for (int val : arr) {
                    //           System.out.print(val + " ");
                    // }
                    // System.out.println();

                    for(Map.Entry<String,Integer> e : map.entrySet()){
                             System.out.println( e.getKey());
                             System.out.println(e.getValue());
                    }
                    System.out.println();

                    Set<String> keys = map.keySet();
                    for (String key : keys) {
                              System.out.println(key + " " + map.get(key));
                    }
                    map.remove("china");
                    System.out.println(map);
          }
}