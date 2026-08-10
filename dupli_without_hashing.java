import java.util.*;
public class dupli_without_hashing{
    static boolean dupli(int arr[],int k){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]&&Math.abs(i-j)<=k){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,1,2,3,4};
        System.out.println(dupli(arr,3)?"Yes":"No");
    }
}
