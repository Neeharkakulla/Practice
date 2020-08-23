package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestLengthOfContiniousArrays {
	public static void minSubArray(int []arr,int sum,int n)
	{
		if(n==0||sum==0) {
			System.out.println(0);
			return;
		}
		int count=Integer.MAX_VALUE;
		for(int i=0,min=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				min+=arr[j];
				if(min==sum&&count>j-i) {
					count=j-i;
					break;
				}
			}
		}
		if(count==Integer.MAX_VALUE)
			System.out.println(0);
		else
		System.out.println(count);
	}
public static void main(String[] args) {
	Scanner in =new Scanner(System.in);
	System.out.println("Enter ther size of an array");
	int n=in.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter "+n+" positive elements into array");
	for(int i=0;i<n;i++)
		arr[i]=in.nextInt();
	System.out.println("Enter the sum to calculate minmum length sub array");
	int sum=in.nextInt();
	Arrays.sort(arr);
	minSubArray(arr,sum,n);
	
}
}
