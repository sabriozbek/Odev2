
public class Student extends User {
private String[] takenCourses;
private String membershipStatus;

public Student(String[] takenCourses, String membershipStatus) {
	super();
	this.takenCourses = takenCourses;
	this.membershipStatus = membershipStatus;
}
public Student() {
	
}

public String[] getTakenCourses() {
	return
			takenCourses;
}
public void setTakenCourses(String[] takenCourses) {
	this.takenCourses = takenCourses;
}
public String getMembershipStatus() {
	return membershipStatus;
}
public void setMembershipStatus(String membershipStatus) {
	this.membershipStatus = membershipStatus;
}




}
