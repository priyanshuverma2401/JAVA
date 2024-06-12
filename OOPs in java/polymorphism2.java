

public class polymorphism2 {
  public static void printnum(){
    System.out.println("there is no input to print");
  }
  public static void printnum(int a, int b){
    System.out.println("value of a: "+a+" and value of b: "+b);
  }
  public static void printnum(int a){
    System.out.println("the value of a: "+a);
  }
  public static void main(String[] args) {
     printnum();
     printnum(4);
     printnum(4,5);
  }}
  


