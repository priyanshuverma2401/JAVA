class Node{
  String data;
  Node next;
  Node(String data){
    this.data = data;
    this.next = null;
  }
}


// linked list class defination
class linked_list{
  Node head ; 

  //printing linkedList
  public void printList(){
    if(head == null){
      System.out.println("list is empty!!!");
    }
    Node temp =head;
    while(temp != null){
      System.out.print(temp.data);
      System.out.print("--->");
      temp = temp.next;
    }
    System.out.println("null");
  }

  //adding element at start
  public void addFirst(String data){
    Node newnode = new Node(data);
    if(head == null){
      head = newnode;
      return;
    }
    newnode.next = head;
    head = newnode;
  }

  //adding element at last
  public void addLast(String data){
    Node newnode = new Node(data);
    if(head == null){
      head = newnode;
    }
    Node temp = head;
    while (temp.next != null){
      temp = temp.next;
    }
    temp.next = newnode;
  }

  //removing element from starting
  public void removeFirst(){
    if(head == null){
      System.out.println("it is empty list");
      return;
    }
    head = head.next;

  }
  public void removeLast(){
    if(head == null){
      System.out.println("This is empty list");
      return;
    }
    Node last_node = head;
    while(last_node.next.next != null){
      last_node = last_node.next;
    }
    last_node.next = null;
  }

  //reversing linked list
  public void reverseIteration(){
    if(head == null || head.next == null){
      return;
    }
    Node prevNode = head;
    Node CurrNode = head.next;
    while(CurrNode != null){
      Node nextNode = CurrNode.next;
      CurrNode.next = prevNode;

      prevNode = CurrNode;
      CurrNode = nextNode;
    }
    head.next = null;
    head = prevNode;
  }
}


public class reverse_given_linked_List_iterative {
  public static void main(String[] args) {
    linked_list newList = new linked_list();
    newList.addFirst("my");
    newList.addLast("name");
    newList.addLast("is");
    newList.addLast("priyanshu");
    newList.addLast("kumar");
    newList.addLast("verma");

    newList.printList();
    newList.reverseIteration();
    newList.printList();
    

  }}


