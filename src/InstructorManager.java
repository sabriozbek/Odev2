
public class InstructorManager extends UserManager{

public void addCourse(String course,Instructor instructor) {
	System.out.println(course+" Kursu sisteme eklendi \nKurs Eðitmeni: "+instructor.getfullName());
}
public void getGivenCourses(Instructor instructor) {
	for (String course : instructor.getGivenCourses()) {
		System.out.println(course+ " Kursu");
	}
}

@Override
public void login(User user) {
	// TODO Auto-generated method stub
	System.out.println(user.getfullName()+" sisteme öðretmen olarak giriþ yaptý.");
}



}
