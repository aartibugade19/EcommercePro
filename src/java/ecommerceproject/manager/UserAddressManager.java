/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceproject.manager;

import ecommerceproject.Util.NewHibernateUtil;
import ecommerceproject.entity.user_address;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Aarti
 */
public class UserAddressManager {
public Integer adduser(String state, String city, String country, String addressline1,String date_time, int pin_no, int address_id,int user_id) {
		SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		Integer userId = null;
		try {
			tx = session.beginTransaction();
			user_address u = new user_address(state,city,country,addressline1,date_time,pin_no,address_id,user_id);
			userId = (Integer) session.save(u);

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();

		}
		return userId;
	}

}
