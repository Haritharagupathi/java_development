import java.util.Arrays;
public class Lottery {
    public static void main(String[] args) {
        int[] t1={1,2,3,4,56,67,90};
        int[] t2=Arrays.copyOf(t1,t1.length);
        t2[3]=6;
        System.out.println("Ticket 1 number:");
        print_ticket(t1);
        System.out.println("ticket2 numbers:");
        print_ticket(t2);
    }
    public static void print_ticket(int[] ticket){
        for(int i=0;i<ticket.length;i++){
            System.out.println(ticket[i]);
        }
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       