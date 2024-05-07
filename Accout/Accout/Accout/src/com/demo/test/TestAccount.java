package com.demo.test;
import java.util.Scanner;

import com.demo.Bean.AccountInfo;
import com.demo.Services.AccServices;
import com.demo.Services.Interface_AccServ;
import com.demo.Dao.*;

public class TestAccount {

	public static void main(String[] args) {

		Interface_AccServ Aserv= new AccServices();
		int choice = 0;
		Scanner sc= new Scanner(System.in);
		do {
			
		System.out.println("1.Add New Account\n2.Display Account Info.\n3.Find by Account No.\n4.Find by Account Holder Name\n5.Sorting of Account by Type\n6.Close account\n7.Exit ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter choice of Account");
			System.out.println("1.Saving\n2.Current\n3.Demate");
			int  ch= sc.nextInt();
			Boolean status=Aserv.AddAccount(ch);
			if(status)
			{
				System.out.println("Congratulation");
			}
			else 
			{
				System.out.println("Null");
			}
			break;
		case 2:
			AccountInfo [] AI= Aserv.displayAll();
			for(AccountInfo a: AI)
			{
				if(a!=null)
				{
					System.out.println(a);
				}
				else {
					break;
				}
				
			}
			                         
			break;
		case 3:
			System.out.println("Enter the Banck account no.");
			int ac= sc.nextInt();
			AccountInfo Ai= Aserv.FindAccNo(ac);
			if(Ai!=null)
			{
				System.out.println(Ai);
			}
			else {
				System.out.println("Enter Bank account no is present");
				break;
			}
			
			break;
		case 4:
			System.out.println("Enter the user Name which is tobe Search");
			String nm=sc.next();
			AI= Aserv.FindName(nm);
			if(AI!=null)
			{
				for(AccountInfo a:AI)
				{
					if(a!=null)
					{
						System.out.println(a);
					}
					else
					{
						break;
					}
				}
			}
			
			break;
		case 5:
			System.out.println("Enter the user Name which is tobe Search");
			String AcTy=sc.next();
			AI= Aserv.FindAccType(AcTy);
			if(AI!=null)
			{
				for(AccountInfo a:AI)
				{
					if(a!=null)
					{
						System.out.println(a);
					}
					else
					{
						break;
					}
				}
			}
			break;
		case 7:
			System.out.println("Thank You for visiting us......");
			break;
			}
		}while(choice!=7);
		}

}
