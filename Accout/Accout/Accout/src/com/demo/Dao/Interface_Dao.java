package com.demo.Dao;

import com.demo.Bean.AccountInfo;

public interface Interface_Dao {
	

	AccountInfo[] findall();

	Boolean Save(AccountInfo acc);

	AccountInfo FindAcc(int ac);

	AccountInfo[] getName(String nm);

	AccountInfo[] getAccType(String acTy);



}
