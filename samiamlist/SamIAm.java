package samiamlist;

import java.util.ArrayList;

public class SamIAm {
    public static void main(String[] args) throws Exception {
        String m1 = "Sam";
        String m2 = "I";
        String m3 = "Am";
        String m4 = "Ham";

        ArrayList<String> list = new ArrayList<>();
        list.add(m1); //0
        list.add(m2); //1
        list.add(m3); //2

        list.add(1, m4);
        list.add(3, m4);
        list.add(5, m4);

        for (String s : list) {
            System.out.println(s);
        }
    }
}
