package Day2;

import java.util.Scanner;

public class Recursive_sort {
	 static void bubbleSort(int arr[], int n)
	    {
	        
	        if (n == 1)
	            return;
	      
	        
	        for (int i=0; i<n-1; i++)
	            if (arr[i] > arr[i+1])
	            {
	                
	                int temp = arr[i];
	                arr[i] = arr[i+1];
	                arr[i+1] = temp;
	            }
	      
	        
	        bubbleSort(arr, n-1);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        Recursive_sort r=new Recursive_sort();
		System.out.println("Enter no of elements in array:");
		int n=sc.nextInt();
		int arr[] =new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter element:");
			arr[i]=sc.nextInt();
		}
		
		r.bubbleSort(arr, n);
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		

	}

}
