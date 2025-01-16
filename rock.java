import java.util.Scanner;
public class rock {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter your choice");
        String yourchoice=s.nextLine();
        s.nextLine();
        String computerchoice = computerchoice();
        String result=result(yourchoice,computerchoice);
        System.out.println(computerchoice);
        System.out.println(result);

    }
    
    public static String computerchoice(){
        double randomno=Math.random()*3;
        int integer=(int)randomno;
        switch(integer){
            case 0: return "rock";
            case 1:return "paper";
            case 2:return "scissor";
            default:return "";
    }
}
public static String result(String yourchoice,String computerchoice){
   String result="";
    if (yourchoice.equals("rock") && computerchoice.equals("scissors")) {
        result = "You win!";
    } else if (yourchoice.equalsIgnoreCase("rock") && computerchoice.equals("paper")) {
        result = "You lose!";
    } else if (yourchoice.equalsIgnoreCase("paper") && computerchoice.equals("rock")) {
        result = "You win!";
    } else if (yourchoice.equalsIgnoreCase("paper") && computerchoice.equals("scissors")) {
        result = "You lose!";
    } else if (yourchoice.equalsIgnoreCase("scissors") && computerchoice.equals("paper")) {
        result = "You win!";
    } else if (yourchoice.equalsIgnoreCase("scissors") && computerchoice.equals("rock")) {
        result = "You lose!";
    } else if (yourchoice.equalsIgnoreCase(computerchoice)) {
        result = "It's a tie!";
    } else {
        System.out.println("INVALID CHOICE");
        System.exit(0);
    }
    return result;

}

}


    

