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
		
		// 3. Java Utility Methods
		
		int[] arr3= {52,78,98,69,35};
		int[] arr4= {57,21,35,41,63};
		
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		
		int key=78;
		int index=Arrays.binarySearch(arr3,78);
		System.out.println("Index: " + index );
		
		
		Arrays.fill(arr3,5);
		System.out.println(Arrays.toString(arr3));
		
		System.out.println(Arrays.equals(arr3, arr4));
		
		int[] newArr = Arrays.copyOf(arr4,arr4.length);
		System.out.println(Arrays.toString(newArr));
		
		
		// 4. Passing Functions
		
		int[] arr5= { 15,45,75,69,25};
		System.out.println(Arrays.toString(arr5));
		change(arr5);
		System.out.println(Arrays.toString(arr5));
		
	}
		static void change(int[] arr)
		{
			arr[1]=58;
		}
		
	}