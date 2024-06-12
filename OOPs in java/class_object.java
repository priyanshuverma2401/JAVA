//defining pen class
class pen{
  String colour;
  String type;
  public void write(){
    System.out.println("pen is writting");
  }
  public void penType(){
    System.out.println("pen type is :" + this.type);
  }
  public void penColour(){
    System.out.println("the colour of pen is: "+ this.colour);
  }
}


// defing students class
class students{
  String name;
  int age;
  public void printInfo(){
    System.out.println("name : "+ this.name);
    System.out.println("age : "+ this.age);
  }
  students(){
    System.out.println("constructor is called");
  }
  }


// main class /deriver class
public class class_object {
  public static void main(String args[]){

    //defining pen 1
    pen pen1 = new pen();
    pen1.colour = "blue";
    pen1.type = "ball point pen";
    pen1.write();
    pen1.penType();
    pen1.penColour();

    // defiing pen 2
    pen pen2 = new pen();
    pen2.colour = "red";
    pen2.type = "gel pen";
    pen2.write();
    pen2.penType();
    pen2.penColour();

    //defining student s1
    students s1 = new students();
    s1.name = "priyanshu kumar verma";
    s1.age = 19;
    s1.printInfo();

  }

}
