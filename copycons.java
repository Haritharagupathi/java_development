public class copycons {
    private String name;
    private String nationality;
    private String dateOfBirth;
    private String[] passport;
    private int seatNumber;
    public copycons(String name,String nationality,String dateOfBirth,int seatNumber){
        this.name=name;
        this.nationality=nationality;
        this.dateOfBirth=dateOfBirth;
        this.seatNumber=seatNumber;
    }
    public copycons(copycons s){
        this.name=s.name;
        this.nationality=s.nationality;
        this.dateOfBirth=s.dateOfBirth;
        this.seatNumber=s.seatNumber;

    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getNationality(){
        return nationality;
    }
    public void setNationality(String nationality){
        this.nationality=nationality;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public void setDateOfBirth(String DateOfBirth){
        this.dateOfBirth=DateOfBirth;
    }

    public int getseatNumber(){
        return seatNumber;
    }
    public void setseatNumber(int seatNumber){
        this.seatNumber=seatNumber;
    }
    public static void main(String[] args){
        copycons copy=new copycons("haritha","indian","21/09/2003",5);
        copy.setseatNumber(10);
        System.out.println("Name:"+copy.getName()+ "\nNationality:"+copy.getNationality()+ "\nDate Of Birth:"+copy.getDateOfBirth()+ "\nSeat Number:"+copy.getseatNumber()+"\n");
        copycons c=new copycons(copy);
        c.setName("darun");
        c.setNationality("ireland");
        c.setDateOfBirth("5/8/2003");
        System.out.println("\nName:"+c.getName()+ "\nNationality:"+c.getNationality()+ "\nDate of Birth:"+c.getDateOfBirth()+ "\nSeat Number:"+c.getseatNumber());


    }



    
}
