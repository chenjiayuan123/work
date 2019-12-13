package list;

import java.util.ArrayList;
import java.util.Collections;

public class list {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        arrayList.add("apple");
        arrayList.add("grape");
        arrayList.add("banana");
        arrayList.add("pear");

        System.out.println(Collections.max(arrayList));
        System.out.println(Collections.min(arrayList));

        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
