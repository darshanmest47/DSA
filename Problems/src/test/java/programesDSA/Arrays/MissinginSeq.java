package programesDSA.Arrays;
import java.util.*;

public class MissinginSeq {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of the Array");
        int arrlen=sc.nextInt();
        int arr1[]=new int[arrlen];
        System.out.println("Enter the numbers in sequence");
        for(int i=0;i<arrlen;i++){
              arr1[i]=sc.nextInt();
        }

        int num=arr1[0];
        int start=0;
        for(int i=start;i<arrlen;i++){
            if(arr1[i]==num){
                System.out.println("Item found at index "+i+" is "+num);
                num++;
                
            }
            
            else{
                System.out.println();
                System.out.println("Numbers are not in Sequence");
                System.out.println("Item missing at index "+i+" is "+num);
                num++;
                start=i;
                i--;
                System.out.println();

            }
        }

    }
    
}
