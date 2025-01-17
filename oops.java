public class oops {
    public static void main (String[] args){
    
        Car nissan=new Car();
        nissan.make="Nissan";
        nissan.price="100000";
        nissan.year="1st";
        nissan.color="Green";


        Car dodge=new Car();
        dodge.make="dodge";
        dodge.price="200000";
        dodge.year="2nd";
        dodge.color="blue";

        System.out.println("This"+nissan.make+ "is worth" + nissan.price + "it was built in" + nissan.year + "it is" + nissan.color);
        System.out.println("This"+dodge.make+ "is worth" + dodge.price + "it was built in" + dodge.year + "it is" + dodge.color);
        
        
    
}
static class Car {
    String make;
    String price;
    String year;
    String color;
}
}
