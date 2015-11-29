/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceproject.manager;
import ecommerceproject.Util.NewHibernateUtil;
import ecommerceproject.entity.brand;
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
public class BrandManager {
    public Integer addBrand(int brand_id,String brand_name) {
		SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		Integer userId = null;
		try {
			tx = session.beginTransaction();
			brand b = new brand(brand_id,brand_name);
			userId = (Integer) session.save(b);

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

    public void lisProduct() {
		SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			List<brand> brands = session.createQuery("FROM brand").list();
			Iterator<brand> itr = brands.iterator();
			while(itr.hasNext()){
				brand b = itr.next();
				System.out.println(b.getBrand_id());
				System.out.println(b.getBrand_name());

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
