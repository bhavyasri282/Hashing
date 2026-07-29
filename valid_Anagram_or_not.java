import java.util.*;
public class valid_Anagram_or_not {
    public static void main(String args[]){
        HashMap<Character,Integer> map1=new HashMap<>();
        String s1="anagram";
        HashMap<Character,Integer> map2=new HashMap<>();
        String s2="nagaram";
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(map1.containsKey(ch)){
                map1.put(ch,map1.get(ch)+1);
            }else{
                map1.put(ch,1);
            }
            char ch1=s2.charAt(i);
            if(map2.containsKey(i)){
                map2.put(ch1,map2.get(ch1)+1);
            }else{
                map2.put(ch1,1);
            }
        }
        if(map1.equals(map2)){
            System.out.println("same frequenecy");
        }else{
            System.out.println("not same frequenecy");
        }
    }
}

