package generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
//        List<?> list = new ArrayList<String>();
//        list.add("Error")

        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showListInfo(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Привет");
        list2.add("Пока");
        list2.add("ОК");
        showListInfo(list2);

        ArrayList<Double> ard = new ArrayList<>();
        ard.add(3.14);
        ard.add(3.15);
        ard.add(3.16);
        System.out.println(summ(ard));


        ArrayList<Integer> ari = new ArrayList<>();
        ari.add(314);
        ari.add(315);
        ari.add(316);
        System.out.println(summ(ari));
    }

    static void showListInfo(List<?> list) {
        System.out.println("Мой лист содержит следующие элементы: " + list);
    }

    public static double summ(ArrayList<? extends Number> arrayList) {
        double summ = 0;
        for (Number n : arrayList) {
            summ += n.doubleValue();
        }
        return summ;
    }
}
