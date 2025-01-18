import java.util.Scanner;
public class getter {
  private String name;
  private int age;
  public void setName(String newname){
    name=newname;
  }
  public void setAge(int newAge){
    age=newAge;
  }
  public String getName(){
    return name;
  }
  public int getAge(){
    return age;
  }
  public static void main(String[] args){
    getter g=new getter();
    Scanner s=new Scanner(System.in);
    
    System.out.println("enter the name:");
    String name=s.next();
    g.setName(name);

    System.out.println("enter the age:");
    int age=s.nextInt();
    g.setAge(age);
    System.out.println("name:"+g.getName());
    System.out.println("Age:"+g.getAge());
  }

    
}
