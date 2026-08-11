import java.util.*;

public class most_frequent_element {

    static int mostfrequentEle(int[] arr) {
        int n = arr.length;

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Step 1: Count frequencies
        for (int i = 0; i < n; i++) {
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }

        // Step 2: Find most frequent element
        int maxCount = 0;
        int res = -1;

        for (var entry : freq.entrySet()) {
            int val = entry.getKey();
            int cnt = entry.getValue();

            if (maxCount < cnt || (cnt == maxCount && val > res)) {
                res = val;
                maxCount = cnt;
            }
        }

        return res;
    }

    public static void main(String args[]) {
        int arr[] = {40, 50, 30, 40, 50, 30, 30};

        System.out.println(mostfrequentEle(arr));
    }
}