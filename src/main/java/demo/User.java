package demo;

public class User {
	
	private Integer id;
	private String name;
	private String email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public static User of(String name, String email) {
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		return user;
	}

	@Override
	public String toString() {
		return String.format("User{name=%s, email=%s}", name, email);
	}
}
