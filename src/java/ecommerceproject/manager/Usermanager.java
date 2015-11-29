/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceproject.manager;

import ecommerceproject.Util.NewHibernateUtil;
import ecommerceproject.entity.product;
import ecommerceproject.entity.user;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Aarti
 */
public class Usermanager {
public Integer adduser(String name,String email_id,String password,int user_id,int mobile_no) {
		SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		Integer userId = null;
		try {
			tx = session.beginTransaction();
			user u = new user(name,email_id,password,user_id,mobile_no);
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

/////list of users....

    public void listUsers() {
		SessionFactory sessionFactory = NewHibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();

			List<user> u= session.createQuery("FROM user").list();
			Iterator<user> itr = u.iterator();
			while(itr.hasNext()){
				user u1= itr.next();
				System.out.println(u1.getName());
				System.out.println(u1.getEmail_id());
                                System.out.println(u1.getMobile_no());
                                System.out.println(u1.getUser_id());
                                System.out.println(u1.getPassword());


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

   public boolean  login(user userobj) {

           Transaction tx = null;
          Session session = NewHibernateUtil.getSessionFactory().openSession();
           try
           {
           tx = session.beginTransaction();
          Query query = session.createQuery("select email_id,password from user u where u.email_id='"+userobj.getEmail_id()+"' and u.password='"+userobj.getPassword()+"'");
          List<user> users=query.list();
          if(users.size()>0)
          {
              return  true;
                
          }else
          {
              return  false;
          }
           
           }
           catch (RuntimeException e)
           {
             e.printStackTrace();
             return  false;
           }
    }

   /////to view product list...

   public void viewProductList() {

     Transaction tx = null;
          Session session = NewHibernateUtil.getSessionFactory().openSession();
           try
           {
           tx = session.beginTransaction();
Query query = session.createQuery("select product.product_name from product product where product.category_id=(select category_id from category where category_name='tshirt') and product.brand_id=(select brand_id from brand where brand_name='lee-cooper')");
          List<product> users=query.list();
          Iterator itr = users.iterator();
          while(itr.hasNext())
          {
              System.out.println(itr.next());
          }
           }
           catch (RuntimeException e)
           {
             e.printStackTrace();
          }
    }

   }

    

