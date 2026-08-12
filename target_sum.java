import java.util.*;
public class target_sum{   
    public static boolean twosum(int arr[],int target){
        HashSet<Integer> hashset=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int comple=target-arr[i];
            if(hashset.contains(comple)){
                return true;
            }
            hashset.add(arr[i]);
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={0,-1,2,-3,1};
        int target=-2;
        if(twosum(arr,target)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
