
public class Instructor extends User{
private String[] givenCourses;
private String biography;


public Instructor(int id, String firstName, String lastname, String age, String email, String[] givenCourses,
		String biography) {
	super(id, firstName, lastname, age, email);
	this.givenCourses = givenCourses;
	this.biography = biography;
}
public Instructor() {
	
}

public String[] getGivenCourses() {
	return givenCourses;
}
public void setGivenCourses(String[] givenCourses) {
	this.givenCourses = givenCourses;
}
public String getBiography() {
	return biography;
}
public void setBiography(String biography) {
	this.biography = biography;
}



}
