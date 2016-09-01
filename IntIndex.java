package GuviLogical;
import java.util.Arrays;
import java.util.Scanner;
public class IntIndex
{
public static void main(String[] args) 
{
	Integer a[]= {-3,-1,1,3,5};
	Arrays.sort(a);
	for(int i=0;i<a.length;i++)
	{
		
	int num1=a[i];
	int index=Arrays.asList(a).indexOf(a[i]);
	if(num1==index)
	System.out.println("Number"+num1 +" equal its index "+index);
	}
	
}	
}
