/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceproject.manager;


import ecommerceproject.Util.NewHibernateUtil;
import ecommerceproject.entity.invoice;
import ecommerceproject.entity.usertype;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Aarti
 */
public class InvoiceManager {

  
        public Integer addInvoice(int invoice_id, int user_id, int product_id, int payment_type_id, int address_id, int status_id, int product_prize, String name) {
		SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		Integer userId = null;
		try {
			tx = session.beginTransaction();
			invoice  i = new invoice(invoice_id, user_id, product_id, payment_type_id, address_id, status_id, product_prize, name);
			userId = (Integer) session.save(i);

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

