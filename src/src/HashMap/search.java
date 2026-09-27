import java.util.*;
public class search {
  public static void main(String[] args){
     HashMap<String,Integer> map=new HashMap<>();
     map.put("India",150);
     map.put("china",200);
     map.put("Indonesia",400);
     if(map.containsKey("India")){
        System.out.println("Key is present in the map");
     }else{
        System.out.println("Key is not present in the map ");
     }
     System.out.println(map.get("India"));
     int[] arr={10,12,30,40,60,80};
     for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
     }
     System.out.println();
     for(int val :arr){
        System.out.print(val+" ");
     }
     System.out.println();
  }
}
