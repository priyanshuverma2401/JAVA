 /*
  * properties of abstract class:
  1--> An abstract class can be declared with an abstract keyword
  2--> it can have abstract and non abstract methods.
  3--> it cannot be instantiated.
  4--> it can have constructor and static methos also
  5--> it can have final method which will force the subclass not to change the body of the method
  */
 
 
 abstract class Animal{
  abstract void walk();
  public void eat(){
    System.out.println("animal can eat");
  }
}
class horse extends Animal{
  public void walk(){
    System.out.println("walks on 4 legs");
  }
}
class chicken extends Animal{
  public void walk(){
    System.out.println("walks on two legs");
  }
}
public class abstraction {
  public static void main(String[] args) {
      horse h1 = new horse();
      h1.walk();
      h1.eat();
  }}

