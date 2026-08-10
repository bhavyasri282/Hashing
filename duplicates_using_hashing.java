import java.util.*;
public class duplicates_using_hashing{
    static boolean dup(int arr[],int k){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return true;
            }
            set.add(arr[i]);
            if(i>=k){
                set.remove(arr[i]);
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,3,6};
        System.out.println(dup(arr,3));
    }
}
