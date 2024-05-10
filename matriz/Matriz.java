package matriz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matriz {    public static void main(String[] args) throws Exception {
    int[] array = initializeArray();

    int max = max(array);

    System.out.println(max);
}

public static int[] initializeArray() throws IOException {
    BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

    int[] array = new int[20];
    for (int i = 0; i < 20; i++) {
        array[i] = Integer.parse