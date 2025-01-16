import java.util.Scanner;
public class compare {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        System.out.println("enter the name1");
        String name1=s.nextLine();
        System.out.println("enter the name1");
        String name2=s.nextLine();
        System.out.println(!name1.equals(name2));
    }
}
