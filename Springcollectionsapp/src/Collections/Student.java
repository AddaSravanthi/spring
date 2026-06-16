package Collections;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class Student implements Serializable {
private Set<Integer> ids;
private List<String> names;
private List<Double> marks;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(Set<Integer> ids, List<String> names, List<Double> marks) {
	super();
	this.ids = ids;
	this.names = names;
	this.marks = marks;
}
public Set<Integer> getIds() {
	return ids;
}
public void setIds(Set<Integer> ids) {
	this.ids = ids;
}
public List<String> getNames() {
	return names;
}
public void setNames(List<String> names) {
	this.names = names;
}
public List<Double> getMarks() {
	return marks;
}
public void setMarks(List<Double> marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [ids=" + ids + ", names=" + names + ", marks=" + marks + "]";
}



}
