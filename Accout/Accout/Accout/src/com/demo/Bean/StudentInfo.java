package com.demo.Bean;


import java.text.SimpleDateFormat;
import java.util.Date;

public class StudentInfo {
	private int Id;
	private String Name;
	private String Address;
	private Date AdmissionDate;
	private int M1, M2, M3;
	public StudentInfo() {
		super();
	}
	public StudentInfo(int id, String name, String address, Date admissionDate, int m1, int m2, int m3) {
		super();
		Id = id;
		Name = name;
		Address = address;
		AdmissionDate = admissionDate;
		M1 = m1;
		M2 = m2;
		M3 = m3;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Date getAdmissionDate() {
		return AdmissionDate;
	}
	public void setAdmissionDate(Date admissionDate) {
		AdmissionDate = admissionDate;
	}
	public int getM1() {
		return M1;
	}
	public void setM1(int m1) {
		M1 = m1;
	}
	public int getM2() {
		return M2;
	}
	public void setM2(int m2) {
		M2 = m2;
	}
	public int getM3() {
		return M3;
	}
	public void setM3(int m3) {
		M3 = m3;
	}
	@Override
	public String toString() {
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd/mm/yyyy");
		String dd= sdf.format(AdmissionDate);
		
		return "Id: " +Id +"Name: "+ Name+"Addmission Date:"+ dd+ "Marks1:" +M1+ "Marks2: "+ M2+ "Marks3: "+ M3;
	} 
	
	

}
