import java.util.Arrays;
public class TwoDArray {
    public static void main(String[] args){
        int[][] grades={
            { 19,20,39,56},
            {56,89,67,90},
            {67,89,99,98}
        };
        System.out.println(Arrays.toString(grades[0]));
        System.out.println(Arrays.toString(grades[1]));
        System.out.println(Arrays.toString(grades[2]));
        System.out.println("Accessing grades:");
        System.out.println("ram:"+grades[0][0]+ " " +grades[0][1]+ " " +grades[0][2]+ " "+grades[0][3] );
        System.out.println("prem:"+grades[1][0]+ " " +grades[1][1]+ " " +grades[1][2]+ " "+grades[1][3] );
        System.out.println("charan:"+grades[2][0]+ " " +grades[2][1]+ " " +grades[2][2]+ " "+grades[2][3] );
    }

    
}
