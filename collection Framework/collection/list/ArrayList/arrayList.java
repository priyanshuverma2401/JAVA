import java.util.ArrayList;
import java.util.Collections;

public class arrayList {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    // add element
    list.add(0);
    list.add(2);
    System.out.println(list);

    //get element
    int ele = list.get(0);
    System.out.println(ele);

    // add element in beetween
    list.add(1,1);
    System.out.println(list);

    //set element
    list.set(0,5);
    System.out.println(list);

    //delete element
    list.remove(2);
    System.out.println(list);

    //size
    int size = list.size();
    System.out.println(size);

    //loop
    for(int i =0; i < list.size(); i++){
      System.out.println(list.get(i));
    }

    //sorting
    Collections.sort(list);
    System.out.println(list);

  }      
  }

