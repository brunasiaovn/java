package lista;

import java.util.ArrayList;

public class Li {
    public static void main(String[] args) throws Exception {

        ArrayList<String> list = new ArrayList<String>();
        list.add("1 string qualquer");
        list.add("2 string qualquer");
        list.add("3 string qualquer");
        list.add("4 string qualquer");
        list.add("5 string qualquer");

        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
