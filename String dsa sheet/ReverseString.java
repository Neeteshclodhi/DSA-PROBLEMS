
// class Main {
//     public static void main(String[] args) {
//         String str = "NEETESH";
//         char arr[] = str.toCharArray(); //character type of array
//         for (int i = str.length() - 1; i >= 0; i--) {
//             System.out.print(arr[i]);
//         }
//     }
// }


//Two-pointer approach

//     public static void main(String[] args) {
//         String str = "bharat";
//         char chars[] = str.toCharArray();
//         int left = 0, right = str.length() - 1;
//         while (left < right) {
//             char temp = chars[left];
//             chars[left] = chars[right];
//             chars[right] = temp;
//             left++;
//             right--;
//         }
//         System.out.println(new String(chars));
//     }
// }

public class ReverseString {
          public static void main(String[] args) {
                    String str = "neetesh";
                    for (int i = str.length() - 1; i >= 0; i--) {
                              System.out.print(str.charAt(i));
                    }
                    System.out.println();
          }
}
