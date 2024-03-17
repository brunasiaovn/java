package media;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Media
 */
public class Media {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bis.readLine());
        int b = Integer.parseInt(bis.readLine());
        int c = Integer.parseInt(bis.readLine());

        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            System.out.println(a);
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            System.out.println(b);
        } else if ((c >= a && c <= b) || (c <= a && c >= b)) {
            System.out.println(c);
        }
    }
}