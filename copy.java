import java.util.Arrays;
public class copy {
    public static void main(String[] args){
        String[] stafflastyr={"abi","charu","ram"};
        String[] staffthisyr=Arrays.copyOf(stafflastyr,stafflastyr.length);
        staffthisyr[1]="prem";
        System.out.println("staff last yr:"+Arrays.toString(stafflastyr));
        System.out.println("Staff this yr:"+Arrays.toString(staffthisyr));
    }
    }
    
