package com.demo.Bean;

public class Demate extends AccountInfo  {
	private int comm;
	private float interest;

	public Demate() {
		super();
	}

	public Demate(int AccNo, String Name, double Balance,int comm) {
		super(AccNo,Name,Balance);
		this.comm = comm;
		if(Balance>5000)
			interest= (float) (0.15 * Balance*comm);
		else interest= (float) (0.25 * Balance*comm);

	}
	
	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}

	@Override
	public String toString() {
		return super.toString()+"DemateAcc [comm=" + comm + "]";
	}
	public double CalculateInterest()
	{
		return interest;
	};
}
