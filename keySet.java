import java.util.HashMap;
import java.util.Set;
public class keySet{
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"bhavya");
        map.put(2,"navya");
        map.put(3,"divya");
        map.put(4,"swetha");
        //first one
        System.out.println(map.keySet());
        //second one
        Set<Integer> maps=map.keySet();
        System.out.println(maps);
        //third one
        for(Integer key:map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }

    }
}
