public class scope {
        int instance=9;
        static int staticVar=89;

    public void  display(){
        int localvar=9;
        System.out.println("local variable:"+localvar);
        System.out.println("instance variable:"+instance);
        System.out.println("static variable:"+staticVar);
        System.out.println("Block varaible:");
        for(int i=0;i<10;i++){
            System.out.println(i);
        }

    }
    public static void main(String[] args){
        scope sc=new scope();
        sc.display();
    }
    
}
