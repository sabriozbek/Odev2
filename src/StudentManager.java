
public class StudentManager extends UserManager{
	
	public void registerStudent(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastname()+" başarıyla kaydoldu.");
		
			
		
	}
	public void viewTakenCourses(Student student) {
		System.out.println("Öğrencinin aldığı dersler:");
		for (  String courses :student.getTakenCourses() ) {
			System.out.println(courses);
			
		}
		
		
		
		
}
	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getfullName()+" sisteme öğrenci olarak giriş yaptı.");
	}
	
	public void membershipStatus(Student student) {
		System.out.println("Üyelik Durumu: "+student.getMembershipStatus());
		
	}
	
	

}
