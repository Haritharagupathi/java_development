import java.util.Arrays;
public class object {
    public static void main(String[] args){
Person p = new Person();
p.name="haritha";
p.nationality="ireland";
p.dateofBirth="2/09/2003";
p.passport=new String[]{p.name,p.nationality,p.dateofBirth};
p.seatNumber=5;
System.out.println(p.name);
System.out.println(p.nationality);
System.out.println(p.dateofBirth);
System.out.println(Arrays.toString(p.passport));
System.out.println(p.seatNumber);

    }

    static class Person{
        String name;
        String nationality;
        String dateofBirth;
        String[] passport;
        int seatNumber;

    }
    
}
