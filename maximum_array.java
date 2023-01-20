/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

public class maximum_array
{
	public static void main(String[] args) {
// 		int arr[];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Size in a Array:");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter The Elements in a Array:");
		for(int i =0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		
		System.out.println("Elements in a Array:");
		for(int i = 0;i<n;i++){
		    System.out.print(arr[i] + " \n");
		    
		    
		}
		
		int max = arr[0];
		for(int i = 0 ; i<arr.length;i++){
		    if(arr[i] > max){
		        max = arr[i];
		    }
		}
		System.out.println("MAX :" + max);
		
		
	}
}
