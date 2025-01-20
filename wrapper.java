public class wrapper {
    public static void main(String[] args){
        //autoboxing
        int primitive_int=90;
        Integer autoboxed_int=primitive_int;
        //unboxing
        Integer another_wrappedint=new Integer(20);
        int unboxed_int=another_wrappedint;

        System.out.println("autoboxing:"+autoboxed_int);
        System.out.println("unboxed int:"+unboxed_int);

        
    }
    
}
