
package com.demo.Services;

import com.demo.Bean.AccountInfo;

public interface Interface_AccServ {
	Boolean AddAccount(int ch);

	AccountInfo[] displayAll();

	AccountInfo FindAccNo(int ac);

	AccountInfo[] FindName(String nm);

	AccountInfo[] FindAccType(String acTy);



	

}
