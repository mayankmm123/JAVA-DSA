package ARRAYS;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class hashing {
  
    public static void main(String[] args) {
        int arr[]={1,2,32,3,2,1,2,3,5,6,6,6,5,4,5,6};
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i], 1);
            }

            map.put(arr[i], map.getOrDefault(arr[i], 0));
        }
        Set<Integer> keySet = map.keySet();
        for(Integer key: keySet){
            if(map.get(key)>arr.length/3){
                System.out.println(key);
            }
        }
    }
}


