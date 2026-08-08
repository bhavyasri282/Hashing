import java.util.*;
public class disjoint_or_not{
    static boolean isdisjoint(int a[],int b[]){
        HashSet<Integer> hashSet=new HashSet<>();
        for(int num:a){
            hashSet.add(num);
        }
        for(int num:b){
            if(hashSet.contains(num)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6};
        int b[]={1,8,9};
        if(isdisjoint(a,b)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}