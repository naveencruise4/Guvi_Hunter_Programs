package GuviHunter;

import java.util.Arrays;

public class SumOfNumbersToGettarget {
	public static void main(String[] args) 
	{
	int num[]={1,3,2,2,1};
	boolean flag=false;
	int target=5;
	for(int i=1;i<num.length;i++)
	{
		int n1=num[i];
		for(int j=1;j<num.length;j++)
		{
			if(i!=j)
			{
			int n2=num[j];
			int n3=n1+n2;
			if(n3==target)
			{
				System.out.println(n1+","+n2);
				flag=true;	
			}
			}	
	}
	}
	if(flag)
	{
	}
	else
	{
		System.out.println("No possible Combinations");
	}
}
}