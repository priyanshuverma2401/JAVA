public class strings {
  public static void main(String[] args) {
      //concatenation
      String name = "priyanshu";
      String last_name = "verma";
      String fullname = name +" " + last_name;
      System.out.println(fullname);

      //chatAt
      String name2 = "priyanshu verma";
      System.out.println(name2.charAt(1));

      //replace
      String name3 = "priyanshu verma";
      String name4 = name3.replace('a','r');
      System.out.println(name4);
      System.out.println(name3);

      //subsring
      String name5 = "priyanshu verma";
      System.out.println(name5.substring(0,9)); 

  }}
  

