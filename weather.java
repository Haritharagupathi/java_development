public class weather {
    public static void main(String[] args){
        double noon=77;
        double evening=61;
        double midnight=55;
        printtemp(noon);
        printtemp(evening);
        printtemp(midnight);

    }
    public static double fahrenheitocelsius(double fahrenheit){
        return ((fahrenheit-32)*5/9);

    }
    public static void printtemp(double fahrenheit){
        System.out.println("F:"+fahrenheit);
        System.out.println("C:"+fahrenheitocelsius(fahrenheit));
    } 
}
