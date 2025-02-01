package demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {
	public static void main(final String[] args) {
		SessionFactory sessionFactory = HBUtils.getSessionFactory();
		var user = User.of("Aryan", "aryan@email.com");
		Session session = sessionFactory.openSession();
		session.persist(user);
		session.close();
		System.out.println("Comfigured.");
	}
}
