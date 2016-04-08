package MainPackage;

import java.util.Date;

import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import util.HibernateUtil;


public class ManageDBUser {

	public static void main(String[] args) {
		System.out.println("Hibernate + Oracle");
		// session starts/opens a hibernate session
		Session session = HibernateUtil.getSessionFactory().openSession();
 
		//	Starts a transaction (transaction can either be committed or rolled back
		session.beginTransaction();
		
		//	Create a new DBUser instance
		DBUser user = new DBUser();
 
		//	Setters.
		user.setUsername("Vinay");
		user.setCreatedBy("system");
		user.setCreatedDate(new Date());

		//	session.save will cause hibernate to generate the sql required to save the record
		int UserID = (Integer) session.save(user);
		
		//	commit() saves the record(s) permenantly.  
		session.getTransaction().commit();
	}

	
}
