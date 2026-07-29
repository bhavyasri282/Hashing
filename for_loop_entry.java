import java.util.*;
public class for_loop_entry{
    public static void main(String args[]){
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('a',2);
        map.put('b',3);
        map.put('c',4);
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" --> "+entry.getValue());
        }
    }
}
