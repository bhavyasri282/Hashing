import java.util.HashMap;
public class containsKey_function{
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"bhavya");
        map.put(2,"navya");
        map.put(3,"divya");
        map.put(4,"swetha");
        System.out.println(map.containsKey(3));
        System.out.println(map.containsKey(2));

    }
}