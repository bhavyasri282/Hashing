import java.util.*;
class union {
    static ArrayList<Integer> findUnion(int[] a, int[] b) {
        HashSet<Integer> st = new HashSet<>();
        for (int num : a)
            st.add(num);
        for (int num : b)
            st.add(num);
      	ArrayList<Integer> res = new ArrayList<> ();
        for(int it: st) 
            res.add(it);
        return res;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 1};
        int[] b = {3, 2, 2, 3, 3, 2};
        ArrayList<Integer> res = findUnion(a, b);
        for (int num : res)
            System.out.print(num + " ");
    }
}