package com.demo.Dao;

import com.demo.Bean.AccountInfo;
import com.demo.Bean.*;

public class Dao implements Interface_Dao{
	static AccountInfo[] Acc;
	static int count=0;
	static {
		Acc= new AccountInfo[5];
		
		 Acc[0]=new Saving(1,"Rajan",222,77); Acc[1]=new Saving(1,"Rajana",2222,767);
		 count =2;
		 
	}
	@Override
	public AccountInfo[] findall() {
		
		return Acc;
	}

	@Override
	public Boolean Save(AccountInfo acc) {
		if(count<Acc.length)
		{
			Acc[count]=acc;
			count++;
			return true;
			
		}
		else {
			System.out.println("Array is full");
			return false;
		}
		
	}

	@Override
	public AccountInfo FindAcc(int ac) {
		for(AccountInfo FA: Acc) {
			if(FA!=null) {
				if(FA.getId()==ac) 
				{
				//System.out.println(FA);
					return FA;
				}
				}
				else {
					break;
				}
			}
		return null;
	}

	@Override
	public AccountInfo[] getName(String nm) {
		AccountInfo[] AccI= new AccountInfo[count];
		int i=0;
		for(AccountInfo FN:Acc)
		{
			if(FN!=null)
			{
				if(FN.getName().equalsIgnoreCase(nm))
				{
					AccI[i]=FN;
					i++;
					//return FN;
				}
				else
				{
					break;
				}
			}
		}
		if(i>0)
			return AccI;
		return null;
	}

	@Override
	public AccountInfo[] getAccType(String acTy) {
		/*
		 * AccountInfo[] AccI= new AccountInfo[count]; int i=0; for(AccountInfo FN:Acc)
		 * { if(FN!=null) { if(FN.().equalsIgnoreCase(acTy)) { AccI[i]=FN; i++; //return
		 * FN; } else { break; } } } if(i>0) return AccI;
		 */
		
		return null;
	}

}
