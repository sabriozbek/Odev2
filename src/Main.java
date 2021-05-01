
public class Main {

	public static void main(String[] args) {
		String[] courses= {"java","c#"};

		
		
		
		Student student2=new Student();
		student2.setFirstName("Sabri");
		student2.setLastname("Battal");
		student2.setTakenCourses(courses);
		student2.setMembershipStatus("Free");
		
		
		Instructor instructor =new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastname("Demiroğ");
		instructor.setGivenCourses(courses);
		
		
		
		UserManager userManager =new UserManager();
		userManager.login(student2);
		UserManager userManager2=new UserManager();
		userManager2.exit(instructor);
		
		StudentManager studentManager=new StudentManager();
		studentManager.login(student2);
		studentManager.membershipStatus(student2);
		studentManager.registerStudent(student2);
		
		studentManager.viewTakenCourses(student2);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addCourse("Java", instructor);
		instructorManager.getGivenCourses(instructor);
		instructorManager.login(instructor);
		
		
	}

}
