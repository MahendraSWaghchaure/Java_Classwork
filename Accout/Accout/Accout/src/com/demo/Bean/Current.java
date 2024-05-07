package com.demo.Bean;

public class Current extends AccountInfo {
	private String NoTransaction;
	private float interest;

	public Current() {
		super();
	}

	public Current(int AccNo, String Name, double Balance,String noTransaction) {
		super(AccNo,Name, Balance );
		interest= (float) (0.20 * Balance);
		this.NoTransaction = noTransaction;
	}

	@Override
	public String toString() {
		return super.toString()+"CurrentAcc [NoTransaction=" + NoTransaction + "]";
	}

	public String getNoTransaction() {
		return NoTransaction;
	}

	public void setNoTransaction(String noTransaction) {
		NoTransaction = noTransaction;
	}
	@Override
	public double CalculateInterest()
	{
		return interest;
	}

}
