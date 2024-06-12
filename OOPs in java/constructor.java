//defining student class
class student{
  String name;
  int age;
  student(){ //non-parametrized constructor
    System.out.println("constructor is called");
  }
  student(String name, int age){ // parameterized constructor
    this.name = name;
    this.age = age;
  }

  student(student s){ // copy constructor
    this.name = s.name;
    this.age = s.age;
  }

  void printInfo(){
    System.out.println("name is : " + this.name);
    System.out.println("age is: "+this.age);
  }
}

public class constructor {
  public static void main(String args[]){
    student s1 = new student();
    s1.name = "priyanshu verma";
    s1.age = 19;
    s1.printInfo();
    student s2 = new student("aman",24);
    s2.printInfo();

    student s3 = new student(s2);//assigning the property of s2 to s3
    s3.printInfo();

  }
}
