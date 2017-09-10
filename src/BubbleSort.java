import java.util.Scanner;

public class BubbleSort {
	public static void main(String[] args) {
		System.out.println("Enter array size:");
		Scanner input = new Scanner(System.in);
		int len = input.nextInt();
		int[] arr=new int[len];
		System.out.println("Enter array:");		
		for(int i=0;i<len;i++) {
			arr[i] = input.nextInt();
		}
		
		//int len = arr.length;
		int temp;
		for(int k=0;k<len;k++) {
			for(int i=0;i<(len-1);i++) 
			{
				if(arr[i]>arr[i+1]) 
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
		for(int i=0;i<len;i++) {
			System.out.print(arr[i]+" ");			
		}
	}
}