public class countOccurences {
        public static void main(String[] args) {
                  String str = "Neetesh";
            
            char ch = 'e';
            int count = 0;

            for (char c : str.toCharArray()) {
                if (c == ch) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }   


    //count occurences of each elements


//     import java.util.*;
// public class Main {

//     public static void main(String[] args) {
//         String str = "neetesh";
//         HashMap<Character, Integer> map = new HashMap<>();

//         for (char c : str.toCharArray()) {
//             if (map.containsKey(c)) {
//                 map.put(c, map.get(c) + 1);

//             } else {
//                 map.put(c, 1);
//             }

//         }
//         for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//             System.out.println(entry.getKey() + " -> " + entry.getValue());
//         }
//     }
// }

// public class Main {         

//     public static void main(String[] args) {
//         String str = "Neetesh";
//         Map<Character, Integer> charCountMap = new HashMap<>();

//         // Convert string to lowercase to count case-insensitively (optional)
//         str = str.toLowerCase();

//         // Count occurrences of each character
//         for (char c : str.toCharArray()) {
//             charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
//         }

//         // Print occurrences of each character
//         for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
//             System.out.println(entry.getKey() + " -> " + entry.getValue());
//         }
//     }
// }
