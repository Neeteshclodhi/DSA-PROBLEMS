
public class linsearchmenuestion {

    public static int linearSearch(String menu[], int key) {
        for (int i = 0; i < menu.length; i++) {
            // if (menu[i] == key) {
            //     return i;
            // }
        }
        return -1;
    }

    public static void main(String args[]) {
        String menu[] = { "mango", "apple", "banana", "papaya" };
        int key = 2;

        int index = linearSearch(menu, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("key found at index :" + index);
        }

    }

}
