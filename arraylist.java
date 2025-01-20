import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args){
        ArrayList<String> l1=new ArrayList<>();
        l1.add("Apple");
        l1.add("Banana");
        l1.add("Cherry");
        System.out.println("ArrayList: " + l1);
        System.out.println("to get the first element:"+l1.get(0));
        l1.remove(0);  
        System.out.println("After removal: " + l1);
        l1.set(0, "Blueberry");
        System.out.println("After updating: " + l1);
        System.out.println("Size of the ArrayList: " + l1.size());
        for(String fruit:l1){
            System.out.println(l1);
        }

    }
    
}
