import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class compliletime {
    public static void main(String[] args){
        try{
        FileInputStream fis=new FileInputStream("greetings.txt");
        Scanner s=new Scanner(fis);
        System.out.println(s.nextLine());
        s.close();
        }catch(FileNotFoundException exception){
            System.out.println(exception.getMessage());

        }finally{
            System.out.println("process completed");
    }
}
    
}

