import java.util.*;
public class basic {
   public static void main(String[]  args){
    HashMap<String,Integer> map=new HashMap<>();
    map.put("India",150);
    map.put("china",90);
    map.put("Pakistan",80);
    System.out.println(map);
    map.put("china",180);
    System.out.println(map);

   }
}
