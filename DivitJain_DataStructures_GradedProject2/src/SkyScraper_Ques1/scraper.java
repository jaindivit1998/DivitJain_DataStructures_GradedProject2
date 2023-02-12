package SkyScraper_Ques1;

import java.util.Scanner;

public class scraper {

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number floors in the building:");
		int n=sc.nextInt();
		
		int day[]=new int[n+1];
		
		for(int i=1; i<=n;i++)
		{
			System.out.println("Enter the floor size given on day: "+i);
			int size=sc.nextInt();
			day[size]=i;
		}
		
		int temp=n;
		int flag;
		System.out.println("The order of construction is as follow ");
		
		for(int i=1;i<=n;i++)
		{
			flag=0;
			System.out.println("Day "+i+" :");
			
			while(temp>=1 && day[temp]<=i)
			{
				flag=1;
				System.out.print(temp +" ");
				temp--;
			}
			if(flag==1)
				System.out.println();
		}
	}
}
