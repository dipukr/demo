package demo;

import org.hibernate.Session;

public class Main {
	public static void main(final String[] args) {
		var user = User.of("Aryan", "aryan@email.com");
		Session session = HBUtils.openSession();
		session.persist(user);
		session.close();
		System.out.println("Comfigured.");
	}
}
