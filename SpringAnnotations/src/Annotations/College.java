package Annotations;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class College implements Serializable {
	@Value("PG345")
 private String cid;
	@Value("Global Tech")
 private String cname;
	@Value("Hyderabad")
 private String cloc;
	@Autowired
 private Student std;
 public College() {
	super();
	// TODO Auto-generated constructor stub
 }
 public College(String cid, String cname, String cloc, Student std) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.cloc = cloc;
	this.std = std;
 }
 public String getCid() {
	return cid;
 }
 public void setCid(String cid) {
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
 public Student getStd() {
	return std;
 }
 public void setStd(Student std) {
	this.std = std;
 }
 @Override
 public String toString() {
	return "College [cid=" + cid + ", cname=" + cname + ", cloc=" + cloc + ", std=" + std.toString()+ "]";
 }
 
}
