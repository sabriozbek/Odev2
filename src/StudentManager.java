
public class StudentManager extends UserManager{
	
	public void registerStudent(Student student) {
		System.out.println(student.getFirstName()+" "+student.getLastname()+" ba�ar�yla kaydoldu.");
		
			
		
	}
	public void viewTakenCourses(Student student) {
		System.out.println("��rencinin ald��� dersler:");
		for (  String courses :student.getTakenCourses() ) {
			System.out.println(courses);
			
		}
		
		
		
		
}
	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getfullName()+" sisteme ��renci olarak giri� yapt�.");
	}
	
	public void membershipStatus(Student student) {
		System.out.println("�yelik Durumu: "+student.getMembershipStatus());
		
	}
	
	

}
