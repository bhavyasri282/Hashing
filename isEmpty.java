import java.util.*;
public class isEmpty {
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<>();
        System.out.println(map.isEmpty());
        map.put(1,"bhavya");
        map.put(2,"navya");
        map.put(3,"divya");
        System.out.println(map.isEmpty());
    }
}
