package springcoreapps2;

import java.io.Serializable;

public class Company implements Serializable {
	private int cid;
	private String cname;
	private String cloc;
	private Emp e;
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(int cid, String cname, String cloc, Emp e) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cloc = cloc;
		this.e = e;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCloc() {
		return cloc;
	}
	public void setCloc(String cloc) {
		this.cloc = cloc;
	}
	public Emp getE() {
		return e;
	}
	public void setE(Emp e) {
		this.e = e;
	}
	@Override
	public String toString() {
		return "Company [cid=" + cid + ", cname=" + cname + ", cloc=" + cloc + ", e=" + e.toString()+ "]";
	}
	
}
