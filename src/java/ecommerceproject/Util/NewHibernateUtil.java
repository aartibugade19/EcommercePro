/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceproject.Util;

/**
 *
 * @author Aarti
 */
import java.io.File;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class NewHibernateUtil {

  private static SessionFactory factory;

	static {
		try {
                    File  file=new File("C:\\Users\\Aarti\\Documents\\NetBeansProjects\\EcommercePro\\src\\java\\hibernate.cfg.xml");
			factory = new Configuration().configure(file).buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static void main(String[] args) {
		System.out.println(factory);
	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}

}
