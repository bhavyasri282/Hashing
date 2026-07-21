import java.util.HashMap;
public class remove_function{
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"bhavya");
        map.put(2,"navya");
        map.put(3,"divya");
        map.put(4,"swetha");
        map.remove(3);
        map.remove(4);
        System.out.println(map);
    }
}
