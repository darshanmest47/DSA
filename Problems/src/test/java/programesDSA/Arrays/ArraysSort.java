package programesDSA.Arrays;
import java.util.*;

public class ArraysSort {

    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter the values of the array for sorting");

        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the Order in which you need the array to be sorted");
        System.out.println("asc for ascending desc for descending");
        Scanner sc1 = new Scanner(System.in);
        String order = sc1.nextLine();
        switch(order){
            case "asc":
            for(int i=0;i<size;i++){
                for(int j=i;j<size;j++){
                    if(arr[i]>arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            break;

            case "desc":
            for(int i=0;i<size;i++){
                for(int j=i;j<size;j++){
                    if(arr[i]<arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            break;

            default:
            System.out.println("Please enter keywords as either 'asc' or 'desc'");



        }
        System.out.println("Sorted Array in "+order+" is : ");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
    }
    
}
