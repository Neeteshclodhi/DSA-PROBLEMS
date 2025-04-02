package arrayList;

import java.util.Collections;

import java.util.ArrayList;

public class arr {
          public static void main(String[] args) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(8);
                    list.add(5);
                    list.add(6);
                    System.out.println(list);
                    // list.remove(1);
                    // System.out.println(list);
                    // int element = list.get(1); //pass the index

                    // System.out.println(element);
                    //add element in between

                    //list.add(2, 90);
                    //System.out.println(list);

                    //set element
                    // list.set(0, 10);
                    // System.out.println(list);

                    //size-this unctionn return the size of the arraylist
                    // int size = list.size();
                    // System.out.println(size);

                    //loops
                    // for (int i = 0; i < list.size(); i++) {
                              // System.out.println(list.get(i));


                              //sorting
                              Collections.sort(list);
                              System.out.println(list);
                    }
          }
