import java.util.*;
class max_dist_2occurances{
    static int maxDistance(int[] arr1){
        HashMap<Integer,Integer> hash=new HashMap<>();
        int res=0;
        for(int i=0;i<arr1.length;i++){
            if(!hash.containsKey(arr1[i])){
                hash.put(arr1[i],i);
            }else{
                res=Math.max(res,i-hash.get(arr1[i]));
            }
        }
        return res;
    }
    public static void main(String args[]){
        int arr1[]={1,2,3,2,3,1};
        System.out.println(maxDistance(arr1));
    }
}