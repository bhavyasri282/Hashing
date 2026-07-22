import java.util.*;
public class array_count_freq{
    public static void main(String args[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        int arr[]={1,2,3,4,1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }
            else{
                map.put(num,1);
            }
        }
        System.out.println(map);
    }
}
