import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        int pos = 0;
        for (int x : intList) {
            if (x > 0) {
                pos++;
            }
        }
        int[] listpos = new int[pos];
        int countpos = 0;
        for (int x : intList) {
            if (x > 0) {
                listpos[countpos] = x;
                countpos++;
            }
        }
        for (int number : listpos) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            Arrays.sort(listpos);
        }


    }
}