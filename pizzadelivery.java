import java.util.Scanner;
public class pizzadelivery {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of toppings :");
        int no_toppings=s.nextInt();
        String[] toppings = new String[no_toppings];
        for(int i=0;i<toppings.length;i++){
            toppings[i]=s.nextLine();
            s.nextLine();
        }
        System.out.println("print the toppings");
        for(int i=0;i<toppings.length;i++){
            System.out.println(toppings[i]);
        }

    }
    
}
