
public class User {
	private int id;
	private String firstName;
	private String lastname;
	 private String age;
	 private String email;
	 
	 
	public User(int id, String firstName, String lastname, String age, String email) {

		this.id = id;
		this.firstName = firstName;
		this.lastname = lastname;
		this.age = age;
		this.email = email;
	}
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getfullName() {
		return this.firstName+" "+this.lastname;
	}
	 
}
