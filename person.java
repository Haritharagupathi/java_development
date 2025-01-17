public class person {
    String name;
    String nationality;
    String dateOfBirth;
    String[] passport;
    int seatNumber;
    public person(String name,String nationality,String dateOfBirth,int seatNumber){
        this.name=name;
        this.nationality=nationality;
        this.dateOfBirth=dateOfBirth;
        this.seatNumber=seatNumber;

    }

    public static void main(String[] args){
        person p=new person("haritha","indian","21/09/2003",1);
        System.out.println("\nname:"+p.name+ "\nnationality:"+p.nationality+ "\ndateOfBirth:"+p.dateOfBirth+ "\nSeatNumber:"+p.seatNumber);
    }
}
