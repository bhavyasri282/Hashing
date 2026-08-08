import java.util.*;
public class arrays_equal_or_not {
    static boolean areequal(int a[], int b[]) {
        if (a.length != b.length) {
            return false;
        }
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int num : a) {
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        }
        for (int num : b) {
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        }
        return map1.equals(map2);
    }
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4};
        int b[] = {1, 2, 3, 3};
        if (areequal(a, b)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
