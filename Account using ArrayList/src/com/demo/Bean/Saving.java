package com.demo.Bean;

public class Saving extends AccountInfo  {
	private int checkno;
	private double interest;

	public Saving() {
		super();
	}
	public Saving(int Id,String Name, double Balance,int checkno) {
		super(Id,Name,Balance);
		this.checkno = checkno;
		interest= (float) (0.10 * Balance);
	}
	public int getCheckno() {
		return checkno;
	}
	public void setCheckno(int checkno) {
		this.checkno = checkno;
	}
	
	@Override
	public String toString() {
		return super.toString()+"Saving [checkno=" + checkno + "]";
	}
	@Override
	public double CalculateInterest()
	{
		return interest;
	}
	
}
