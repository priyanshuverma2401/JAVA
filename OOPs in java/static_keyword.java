class student{
  String name ;
  static String school;
  public static void changeSchool(){
    school = "newSchool";
  }
}
public class static_keyword {
  public static void main(String[] args){
    student.school = "vvit";
    student s1 = new student();
    s1.name = "priyanshu";
    System.out.println(s1.school);
    student s2 = new student();
    s2.name = "tony";
    System.out.println(s2.school);
    student.changeSchool();
    System.out.println(s1.school);
    System.out.println(s2.school);
  }
}
