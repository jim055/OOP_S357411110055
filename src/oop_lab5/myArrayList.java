package oop_lab5;

import java.util.ArrayList;

public class myArrayList {
    public static void main (String[] args) {

        //ArrayList
        ArrayList list = new ArrayList();
        list.add("JIM");
        list.add("MEAN");
        list.add("B");
        System.out.println(list);
        list.add(2);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.size());
        list.remove("Girl");
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.indexOf(2017));




    }//main
}//class



