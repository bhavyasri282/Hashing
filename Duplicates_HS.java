import java.util.*;
public class Duplicates_HS{
    public static void main(String args[]){
        int arr[]={1,2,2,2,3,4,5};
        HashSet<Integer> set=new HashSet<>();
        for(int num : arr){
            if(set.contains(num)){
                System.out.println("Duplicate found "+num);
                return;
            }
            set.add(num);
        }
        System.out.println("No Duplicates");
    }
}

