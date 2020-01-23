package Day2;
import java.util.Scanner;
public class simple_sort {
	public void bubble_sort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int m=arr[i];
					arr[i]=arr[j];
					arr[j]=m;
				}
			}
		}for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simple_sort s=new simple_sort();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter no of elements in array:");
		int n=sc.nextInt();
		int arr[] =new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter element:");
			arr[i]=sc.nextInt();
		}
		
		s.bubble_sort(arr);
		

	}

}
