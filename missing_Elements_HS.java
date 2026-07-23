import java.util.*;
public class missing_Elements_HS{
    public static void main(String args[]){
        int arr[]={1,3,4,5};
        int n=arr.length;
        HashSet<Integer> set=new HashSet<>();
        for(int num : arr){
            set.add(num);
        }
        for(int i=arr[0];i<=arr[n-1];i++){
            if(!set.contains(i)){
                System.out.println(i +" is missing");
                
            }
        }
    }
}

