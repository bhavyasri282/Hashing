import java.util.*;
public class clear {
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"bhavya");
        map.put(2,"navya");
        map.put(3,"divya");
        System.out.println(map);
        map.clear();
        System.out.println(map);
    }
}
