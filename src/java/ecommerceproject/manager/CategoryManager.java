/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceproject.manager;

import ecommerceproject.Util.NewHibernateUtil;
import ecommerceproject.entity.category;
import java.util.Iterator;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Aarti
 */
public class CategoryManager {

    public Integer addCategory(int category_id,String category_name) {
		SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		Integer userId = null;
		try {
			tx = session.beginTransaction();
			category ct = new category(category_id,category_name);
			userId = (Integer) session.save(ct);

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

    /////list of brands....

    public void lisCategory() {
		SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			List<category> cat = session.createQuery("FROM category").list();
			Iterator<category> itr = cat.iterator();
			while(itr.hasNext()){
				category c = itr.next();
				System.out.println(c.getCategory_id());
				System.out.println(c.getCategory_name());

                      }

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();

		}
	}

}
