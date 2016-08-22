package Logical2Programs;

import java.util.Scanner;

public class FirstNonRepeating {
public static void main(String[] args) {
	System.out.println("Enter Numbers");
	Scanner s=new Scanner(System.in);
	String s1=s.next();
String str[]=s1.split("");
	
	int l=str.length;
		int temp=0;
		for(int i=0;i<l;i++)
	{
			temp=0;
			for(int j=0;j<l;j++)
			{
				if(Integer.parseInt(str[i])==Integer.parseInt(str[j]))
					temp+=1;
				}
			
			if(temp==1)
			{
				System.out.println(Integer.parseInt(str[i]));
			break;
			}
					}
		
}
}
