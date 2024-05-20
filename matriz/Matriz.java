package matriz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matriz {
    public static void main(String[] args) throws Exception {
        int[] array = new int[20]; 
        initializeArrayValues(array); 

        int max = max(array);

        System.out.println(max);
    }

    public static void initializeArrayValues(int[] array) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(bis.readLine());
        }
    }

    public static int max(int[] array) {
        int max = array[0]; 
        for (int i = 1; i < 20; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}