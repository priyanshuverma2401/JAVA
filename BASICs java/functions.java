public class functions {
  public static void printName(String name){
    System.out.println("My name is : "+name);
  }

  public static void printjava(){
    System.out.println("hello java");
  }

  public static int find_sum(int a, int b){
    int sum = a+b;
    return sum;
  }
  public static void main(String[] args){
    printjava();
    printName("priyanshu verma");
    int sum = find_sum(4,5);
    System.out.println(sum);
  }
}
