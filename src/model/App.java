package model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
    {
    	System.out.println("Hibernate one to one (XML mapping)");
		Configuration cfg= new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory session= cfg.buildSessionFactory();
		Session s= session.openSession();
		
		Person person = new Person();
		person.setPersonName("stella");
		person.setEmail("stelladavies29@gmail.com");
		person.setPersonId(1);
		System.out.println(person.toString());

		Passport passport= new Passport();
		passport.setPassportNumber("ABC123DD");
		passport.setPassportId(101);
		passport.setPerson(person);
		
		s.save(person);
		s.save(passport);
		s.beginTransaction().commit();
		session.close();
		System.out.println("success");
	   }
}