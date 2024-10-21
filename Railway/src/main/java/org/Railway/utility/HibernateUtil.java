package org.Railway.utility;

import org.Railway.entity.Ticket;
import org.Railway.entity.Train;
import org.Railway.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private final static SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {

		try {
			// Create the SessionFactory from hibernate.cfg.xml
			return new Configuration().configure("hibernate.cfg.xml")

					.addAnnotatedClass(User.class)
					.addAnnotatedClass(Train.class)
					.addAnnotatedClass(Ticket.class)
					.buildSessionFactory();

		} catch (Throwable ex) {
			// Make sure you log the exception, as it might be swallowed
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public static Session getSesssion() {
		return getSessionFactory().openSession(); // Session opened
	}

}