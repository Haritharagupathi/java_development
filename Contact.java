import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.Period;

public class Contact {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;


    public Contact(String name, String phoneNumber, String birthDate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age=toAge(birthDate);
    }
    public Contact(Contact source){
        this.name=source.name;
        this.phoneNumber=source.phoneNumber;
        this.birthDate=source.birthDate;
        this.age=source.age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getphoneNumber(){
        return phoneNumber;
    }
    public void setphoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getBirthDate(){
        return birthDate;
    }
    public void setBirthDate(String birthDate){
        this.birthDate=birthDate;
        setAge(toAge(birthDate));
    }
    private void setAge(int age){
        this.age=age;
    }
    public int toAge(String birthDate){
       LocalDate parsed_dob= LocalDate.parse(birthDate,DateTimeFormatter.ofPattern("yyyy-MM-dd"));
       LocalDate currentDate=LocalDate.now();
       Period period= Period.between(parsed_dob,currentDate);
       return period.getYears();

    }
}
