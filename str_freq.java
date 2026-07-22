import java.util.*;
public class str_freq{
    public static void main(String args[]){
        HashMap<Character,Integer> map=new HashMap<>();
        String str="bhavya";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        System.out.println(map);
    }
}