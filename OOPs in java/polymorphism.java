/*
 * polymorphism refers to the ability of objects to exist in multiple forms. It's a fancy way of saying that objects can have different behaviors depending on the context they're used in. This is achieved through several mechanisms, but the core idea is that you can treat different objects in a similar way, even if they have underlying differences.
 */
/*
 * There are two main types of polymorphism:

Compile-time polymorphism (static polymorphism): This happens when the specific method to be called is determined at compile time by the compiler. This is often achieved through method overloading, where a class can have multiple methods with the same name but different parameter lists. The compiler figures out which method to call based on the arguments you provide.

Run-time polymorphism (dynamic polymorphism): This happens when the specific method to be called is determined at runtime. This is typically achieved through inheritance, where subclasses can override methods inherited from their parent class. When you call a method on a parent class reference that actually refers to a subclass object, the subclass's overridden method is executed at runtime.
 */
/*
 * Polymorphism makes code more flexible and reusable. You can write code that works with different types of objects without having to know the exact type beforehand. This can lead to cleaner, more maintainable code.
 */
class student{
  String name;
  int age;
  public void printInfo(){
    System.out.println("don't have any information to print");
  }
  public void printInfo(String name){
    System.out.println("name is : " + name);
  }
  public void printInfo(int age){
    System.out.println("age is: " + age);
  }
  public void printInfo(int age, String name){
    System.out.println("name is: "+ name +" and Age is : "+ age);
  }
}
public class polymorphism {
  public static void main(String[] args){
    student s1 = new student();
    s1.name = "priyanshu verma";
    s1.age = 19;
    s1.printInfo();
    s1.printInfo(s1.age);
    s1.printInfo(s1.name);
    //s1.printInfo(s1.age,s1.name);
  }
}
