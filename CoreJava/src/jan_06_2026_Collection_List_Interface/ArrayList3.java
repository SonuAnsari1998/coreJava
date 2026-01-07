package jan_06_2026_Collection_List_Interface;

import java.util.ArrayList;

/*3. Write a program to search an element in an ArrayList<Integer>.
   If the element is found, print its index; otherwise print "Not Found".*/

import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(2);

        int search = 5;
        boolean found = false;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(search)) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not Found");
        }
    }
}
