/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceproject.manager;

import ecommerceproject.Util.NewHibernateUtil;
import ecommerceproject.entity.category;
import ecommerceproject.entity.product;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Aarti
 */
public class ProductManager {

     public Integer addProduct(int product_id, int product_quantity, int product_prize, int category_id, int brand_id, String product_name, String product_sku, String product_image, String product_description) {
		SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		Integer userId = null;
		try {
			tx = session.beginTransaction();
			product p = new product(product_id,product_quantity, product_prize,category_id,brand_id,product_name,product_sku,product_image,product_description);
			userId = (Integer) session.save(p);

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
     ///list of product...

     public Integer addProduct(String product_name) {
		SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		Integer prodcutid = null;
		try {
			tx = session.beginTransaction();
			product p1 = new product(product_name);
			Set<category> categories = new HashSet<category>();
			categories.add(new category("mobiles"));
			
		        p1.setCategory(categories);
			prodcutid = (Integer) session.save(p1);

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();

		}
		return prodcutid;
	}



     public List<product> getlistProduct() {
		SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			List<product> p = session.createQuery("FROM product").list();
                       tx.commit();
                       return  p;

                     } catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
                        return null;
		} finally {
			session.close();

		}
	}

}
