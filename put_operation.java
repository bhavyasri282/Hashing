import java.util.*;
public class put_operation{
    public static void main(String args[]){
        HashMap<Character,Integer> map=new HashMap<>();
        String s="bhavya";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        System.out.println(map);
    }
}
