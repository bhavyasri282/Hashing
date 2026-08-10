import java.util.*;
public class intersection_of_2Arrays{
    static ArrayList<Integer> intersection(int a[],int b[]){
        HashSet<Integer> sa=new HashSet<>();
        for(int num:a){
            sa.add(num);
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int num:b){
            if(sa.contains(num)){
                res.add(num);
                sa.remove(num);
            }
        }
        return res;
    }
    public static void main(String args[]){
        int a[]={1,2,1,3,1};
        int b[]={3,1,3,4,1};
        ArrayList<Integer> res=intersection(a,b);
        for(int num:res){
            System.out.print(num+" ");
        }
    }
}
