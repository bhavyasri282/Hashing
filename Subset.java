import java.util.*;
public class Subset{
    static boolean isSubset(int a[],int b[]){
        HashSet<Integer> hashSet=new HashSet<>();
        for(int num:a){
            hashSet.add(num);
        }
        for(int num:b){
            if(!hashSet.contains(num)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6};
        int b[]={2,4,5,7};
        if(isSubset(a,b)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}