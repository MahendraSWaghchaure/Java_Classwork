package com.demo.Services;

import java.util.Scanner;

import com.demo.Bean.AccountInfo;
import com.demo.Bean.Saving;
import com.demo.Dao.Dao;
import com.demo.Dao.Interface_Dao;

public class AccServices implements  Interface_AccServ{
	private Interface_Dao Adao;
	

	public AccServices() {
		super();
		this.Adao = new Dao();
	}

	public Boolean AddAccount(int ch) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Account Id");
		int id=sc.nextInt();
		System.out.println("Enter your Name");
		String nm= sc.next();
		System.out.println("Enter your bank Balance");
		double bal= sc.nextDouble();
		AccountInfo acc=null;
		switch(ch) {
		case 1:
			System.out.println("Enter Check no");
			int co= sc.nextInt();
			acc= new Saving(id,nm,bal,co);
			System.out.println("Your Saving account added Successfully....");
		break;
		case 2:
			System.out.println("Number of Transaction limit");
			int nt= sc.nextInt();
			acc= new Saving(id,nm,bal,nt);
			System.out.println("Your Current account added Successfully....");
			break;
		case 3:
			System.out.println("Commission percent as per profit");
			int com= sc.nextInt();
			acc= new Saving(id,nm,bal,com);
			System.out.println("Your Demate account added Successfully....");
			break;
		}
		
		
		return Adao.Save(acc);
	}

	@Override
	public AccountInfo[] displayAll() {
		// TODO Auto-generated method stub
		return Adao.findall();
	}

	@Override
	public AccountInfo FindAccNo(int ac) {
		// TODO Auto-generated method stub
		return Adao.FindAcc(ac);
	}

	@Override
	public AccountInfo[] FindName(String nm) {
		// TODO Auto-generated method stub
		return Adao.getName(nm);
	}

	@Override
	public AccountInfo[] FindAccType(String acTy) {
		// TODO Auto-generated method stub
		return Adao.getAccType( acTy);
	}





	

}
