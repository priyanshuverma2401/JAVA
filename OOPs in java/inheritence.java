

/*
 * Inheritance in object-oriented programming (OOP) is a fundamental concept that allows you to create new classes (subclasses, child classes) based on existing classes (base classes, parent classes). It's like building upon a blueprint to create more specific versions.

Here's how inheritance works:

Base Class: This is the existing class that contains properties (attributes) and functionalities (methods) that you want to reuse. Think of it as the general blueprint.
Sub Class: This is the new class you create by inheriting from the base class. It inherits all the properties and functionalities of the base class, and can also add its own specific properties and functionalities. Imagine it as a more detailed version of the blueprint with additional features.
There are several benefits to inheritance:

Code Reusability: You don't have to rewrite common code for every class. The subclass inherits everything from the base class, saving you time and effort.
Extensibility: You can easily extend the functionality of an existing class by creating a subclass. The subclass can add new features or modify inherited ones.
Hierarchical Relationships: Inheritance allows you to create a hierarchy of classes, where more specific classes inherit from more general ones. This helps organize your code and model real-world relationships between objects.
 */

/*
 * 1. Single Inheritance:

The most common and straightforward approach.
A subclass inherits from one parent class, forming a clear parent-child relationship.
This promotes code organization and reduces complexity.

2. Multilevel Inheritance:

A subclass inherits from another derived class, creating a chain of inheritance.
Imagine a grandparent, parent, and child class structure.
Useful for specific scenarios but can become complex with many levels.

3. Hierarchical Inheritance:

Multiple subclasses inherit from a single base class.
Like siblings sharing a common parent, useful for classes with shared functionalities and then specializing them.

4. Multiple Inheritance (Not directly supported):

Java doesn't directly allow a subclass to inherit from multiple base classes due to potential conflicts.
Interfaces can be used to achieve a similar effect, allowing a class to inherit functionalities from various sources.

5. Hybrid Inheritance (Advanced):

Combines multiple inheritance techniques for complex relationships.
Requires a deep understanding of inheritance to avoid creating a tangled hierarchy.
 */

 /*
  * There are two main reasons why Java doesn't support traditional multiple inheritance with classes:

Diamond Problem: This arises when a class inherits from two parent classes that themselves have a common ancestor. This creates ambiguity about which method to call from the common ancestor if both parent classes have the same method name. Imagine a diamond shape where the subclass sits at the bottom point, inheriting from two parent classes (left and right points), which both inherit from a single grandparent class (top point). The question becomes, if the subclass calls a method also defined in the grandparent, which version of the method should be executed? Java avoids this complexity by disallowing multiple inheritance with classes.

Complexity and Maintainability: Multiple inheritance can lead to intricate class structures that become difficult to understand and maintain. By disallowing it, Java encourages a cleaner and more manageable approach to code organization. Interfaces, which Java supports heavily, offer a more controlled way to achieve code reuse and shared functionalities without the complexities of multiple inheritance.
  */

import com.bank.*;

class shape{
  int length;
  int height;
}

class rectangle extends shape{   //single level inheritence
  public void area(){
    System.out.println(this.length*this.height);
  }
}

class square extends rectangle{} // multilevel inheritence}

class triangle extends shape{ // hierarchical inheritance
  public void area(){
    System.out.println((this.length*this.height)/2);
  }
}

public class inheritence{
  public static void main(String[] args) {
      square s1 = new square();
      s1.length = 5;
      s1.height = 5;
      s1.area();

      triangle t1 = new triangle();
      t1.length = 34;
      t1.height = 4;
      t1.area();

      rectangle r1 = new rectangle();
      r1.length = 6;
      r1.height = 8;
      r1.area();

      com.bank.account b1 = new com.bank.account();
      b1.name = "priyanhshu";


  }}
