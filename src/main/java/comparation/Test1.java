package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Zaur");
        list.add("Max");
        list.add("Roger");
        System.out.println("Before sorting");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("After Sorting");
        System.out.println(list);
    }
}
