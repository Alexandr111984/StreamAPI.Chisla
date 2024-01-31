import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> posList = new ArrayList<>();

        for (Integer n : intList) {
            if (n > 0 && n % 2 == 0)
                posList.add(n);
        }

        posList.sort(Comparator.naturalOrder());

        for (Integer n : posList)
            System.out.println(n);


    }
}