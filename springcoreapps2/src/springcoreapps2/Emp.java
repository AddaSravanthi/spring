package springcoreapps2;

import java.io.Serializable;

public class Emp implements Serializable{

	private int empid;
	private String ename;
	private double esal;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int empid, String ename, double esal) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.esal = esal;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getEsal() {
		return esal;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", ename=" + ename + ", esal=" + esal + "]";
	}
	
	
}
