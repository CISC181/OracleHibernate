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
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession();
 
		session.beginTransaction();
		DBUser user = new DBUser();
 
		user.setUsername("Bert");
		user.setCreatedBy("system");
		user.setCreatedDate(new Date());

		int UserID = (Integer) session.save(user);
		
		session.getTransaction().commit();
	}

	
}
