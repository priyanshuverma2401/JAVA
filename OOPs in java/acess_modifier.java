class account{
  public String name; // public data
  protected String email;
  private String password;

  //getter &setters
  public String getPassword(){
    return this.password;
  }
  public void setPassword(String pass){
    this.password = pass;
  }
}

public class acess_modifier {
  public static void main(String[] args) {
      account a1 = new account();
      a1.name = "customer1";
      a1.email = "priyanhsukumarv984@gmail.com";
     // a1.password = "7635";// throws an error
      a1.setPassword("priyanshu@2522");
      System.out.println(a1.getPassword());

  }}

