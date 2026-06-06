
import java.util.Arrays;
import java.util.Scanner;
public class array {
	
	public static void main(String args[])
	{
	  // 1.Printing arrays 
		int[] arr1 = new int[5];
		arr1[0]=25;
		arr1[1]=14;
		arr1[2]=27;
		arr1[3]=36;
		arr1[4]=85;
		
		System.out.println(arr1); //array's type and memory-related representation, not the elements
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		
		for(int k:arr1) //for each loop
		{
			System.out.print(k + " ");
		}
		
		//2.Prompting user to enter elements in an array
		
		int[] arr2=new int[5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
			
		}
		
		for(int j:arr2)
		{
			System.out.print(j + " ");	
		}
		
		System.out.println();
		
		System.out.println(Arrays.toString(arr2));
		
		
	}

}