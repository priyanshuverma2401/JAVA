import java.util.LinkedList;

public class linked_list_collection_framework {
  public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<>();
    list.addFirst("my");
    System.out.println(list);
    list.addLast("name");
    list.addLast("is");
    list.addLast("priyanshu");
    list.addLast("verma");
    System.out.println(list);
    System.out.println(list.size());

    //printing using loop
    for(int i = 0;i< list.size();i++){
      System.out.print(list.get(i));
      System.out.print("--->");
    }
    System.out.println("null");

    //removing values
    list.removeFirst();
    list.removeLast();
    System.out.println(list);

    //removing element from specific position
    list.remove(1);
    System.out.println(list);
  }}

