import java.util.HashSet;
public class Hashset{
    public static void main(String args[]){
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        //add function
        System.out.println(set);
        //remove function
        set.remove(3);
        set.remove(4);
        System.out.println(set);
        //contains function
        System.out.println(set.contains(3));
        //size() function
        System.out.println(set.size());
        }
}
        
    
