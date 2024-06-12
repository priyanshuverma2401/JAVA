interface Animal{
  public void walk();
}
interface herbivorous{
  void eat();
}
class horse implements Animal, herbivorous{
  public void walk(){
    System.out.println("walks on 4 legs.");
  }
  public void eat(){
    System.out.println("it is an hervivorous animal");
  }
}

public class interfaces {
  public static void main(String[] args) {
      horse h1 = new horse();
      h1.walk();
      h1.eat();
  }}

