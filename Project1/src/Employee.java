public class Employee{
private int id;
private String name;
private String emailId;
private String dept;
private String desg;
private float sal;
public Employee() {
	super();
	System.out.println("--Default Constructor get Called----");
}
public Employee(int id, String name, String emailId, String dept, String desg, float sal) {
	super();
	this.id = id;
	this.name = name;
	this.emailId = emailId;
	this.dept = dept;
	this.desg = desg;
	this.sal = sal;
	System.out.println("--Parameterized Constructor get Called----");
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getDesg() {
	return desg;
}
public void setDesg(String desg) {
	this.desg = desg;
}
public float getSal() {
	return sal;
}
public void setSal(float sal) {
	this.sal = sal;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", emailId=" + emailId + ", dept=" + dept + ", desg=" + desg
			+ ", sal=" + sal + "]";
}



}
