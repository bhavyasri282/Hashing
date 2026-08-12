import java.util.*;
public class get_repeated_val{
    static int get_repeated_val(int arr[]){
        HashSet<Integer> hashset=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(hashset.contains(arr[i])){
                return arr[i];
            }
            hashset.add(arr[i]);
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,2,4};
        System.out.println(get_repeated_val(arr));
    }
}