import java.util.*;

//first non-repeating character



public class NonRepeating {

          public static void main(String[] args) {

                    String str = "madam";
                    HashMap<Character, Integer> map = new HashMap<>();

                    for (char c : str.toCharArray()) {
                              if (map.containsKey(c)) {
                                        map.put(c, map.get(c) + 1);
                              } else {
                                        map.put(c, 1);
                              }
                    }

                    for (char c : str.toCharArray()) {
                              if (map.get(c) == 1) {
                                        System.out.println(c);
                              }
                    }

          }
}
    


// public static char firstUniqueChar(String s) {
//     Map<Character, Integer> freq = new HashMap<>();
//     for (char c : s.toCharArray()) freq.put(c, freq.getOrDefault(c, 0) + 1);
//     for (char c : s.toCharArray()) if (freq.get(c) == 1) return c;
//     return '_'; // No unique character found
// }

