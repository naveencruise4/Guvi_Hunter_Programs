package Logical2Programs;

public class FirstNonRepeating {
public static void main(String[] args) {
	
	int a[]={10, 5, 3, 4, 3, 5, 6};
	int l=a.length;
		int temp=0;
		for(int i=0;i<l;i++)
	{
			temp=0;
			for(int j=0;j<l;j++)
			{
				if(a[i]==a[j])
				{
					temp+=1;
				}
			}
			if(temp==1)
			{
				System.out.println(a[i]);
				break;
			}
					}
		
}
}
