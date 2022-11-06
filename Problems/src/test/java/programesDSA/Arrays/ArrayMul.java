package programesDSA.Arrays;
import java.util.*;

public class ArrayMul {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows for first array");
		int r1= sc.nextInt();
		System.out.println("Enter the no of columns for first array");
		int c1=sc.nextInt();
		
		System.out.println("Enter the no of rows for second array");
		int r2= sc.nextInt();
		System.out.println("Enter the no of columns for second array");
		int c2=sc.nextInt();
		
		if(c1!=r2) {
			System.out.println("Matrix Multiplication is not possible");
		}
		else {
			System.out.println("Enter the Data for first array");
			int arr1[][]=new int[r1][c1];
			for(int i=0;i<r1;i++) {
				for(int j=0;j<c1;j++) {
					arr1[i][j]=sc.nextInt();
				}
			}
			
			System.out.println("First Array is :");
			for(int i=0;i<r1;i++) {
				System.out.print("[");
				for(int j=0;j<c1;j++) {
					System.out.print(arr1[i][j]);
					System.out.print(",");
				}
				System.out.print("]");
				System.out.println();
			}
			
			System.out.println("Enter the Data for second array");
			int arr2[][]=new int[r2][c2];
			
			for(int i=0;i<r2;i++) {
				for(int j=0;j<c2;j++) {
					arr2[i][j]=sc.nextInt();
				}
			}
			
			System.out.println("Second Array is :");
			for(int i=0;i<r2;i++) {
				System.out.print("[");
				for(int j=0;j<c2;j++) {
					System.out.print(arr2[i][j]);
					System.out.print(",");
				}
				System.out.print("]");
				System.out.println();
			}
			
			
			int[][] resArr=new int[r1][c2];
			int sum =0;
			for(int i=0;i<r1;i++) {
				
				for(int j=0;j<c2;j++) {
					for(int k=0;k<c1;k++) {
					 sum=sum+(arr1[i][k]*arr2[k][j]);
					}
					resArr[i][j]=sum;
					sum=0;
				}
			}
			
			System.out.println("resultant array is: ");
			for(int i=0;i<r1;i++) {
				System.out.print("[");
				for(int j=0;j<c2;j++) {
					System.out.print(resArr[i][j]);
					System.out.print(",");
				}
				System.out.print("]");
				System.out.println();
			}
		}
		
		

	}

}
