import java.util.HashMap;
import java.util.Set;
import java.util.Map;
public class Entry_set{
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"bhavya");
        map.put(2,"navya");
        map.put(3,"divya");
        Set<Map.Entry<Integer,String>> Entries=map.entrySet();
        System.out.println(Entries);
    }
}
