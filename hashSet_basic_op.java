import java.util.*;
public class hashSet_basic_op{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        HashSet<Integer> set=new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        System.out.println(set);
        System.out.println(set.contains(3));
        set.remove(2);
        System.out.println(set);
    }
}
