import java.util.*;
public class Arr_Lis_Loop {
  public static void main(String[] args) {
    ArrayList<String> comali = new ArrayList<String>();
    comali.add("Kishore");//AddItems
    comali.add("Dora");
    comali.add("PowerRanger");
    comali.add("ChotaBheem"); 
//    for (int i = 0; i < comali.size(); i++) {
//      System.out.println(comali.get(i));
//    }
    Collections.sort(comali); //sorting An item
    for (String i : comali) {
        System.out.println(i);
      }
  }
}