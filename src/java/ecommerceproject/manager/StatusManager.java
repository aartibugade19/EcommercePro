/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceproject.manager;


import ecommerceproject.Util.NewHibernateUtil;
import ecommerceproject.entity.payment_type;
import ecommerceproject.entity.status;
import ecommerceproject.entity.usertype;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Aarti
 */
public class StatusManager {

  
        public Integer addStatus(int status_id,String status_name) {
		SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		Integer userId = null;
		try {
			tx = session.beginTransaction();
			status st = new status(status_id,status_name);
			userId = (Integer) session.save(st);

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

