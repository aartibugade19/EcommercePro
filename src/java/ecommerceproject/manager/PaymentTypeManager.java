/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceproject.manager;


import ecommerceproject.Util.NewHibernateUtil;
import ecommerceproject.entity.payment_type;
import ecommerceproject.entity.usertype;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Aarti
 */
public class PaymentTypeManager {

  
        public Integer addPaymentType(int payment_type_id,String payment_type_name) {
		SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		Integer userId = null;
		try {
			tx = session.beginTransaction();
			payment_type u = new payment_type(payment_type_id, payment_type_name);
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

