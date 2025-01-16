import java.util.Arrays;
public class updatingArrays {
    public static void main(String[] args){
        String[] arr1={"apple","mango","grapes"};
        arr1[2]="orange";
        System.out.println("Array 1:"+Arrays.toString(arr1));
        String[] arr2=new String[10];
        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];

        }
        System.out.println("Array 2:"+Arrays.toString(arr2));
    }
    
}
