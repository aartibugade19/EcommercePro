/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceproject.test;

import ecommerceproject.entity.user;
import ecommerceproject.manager.Usermanager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



/**
 *
 * @author Aarti
 */
public class UserLogin {
 public static void main(String[] args) {
        String email_id="arti@gmail.com",password="123";
        user userobj=new user(email_id,password);
        Usermanager usermanager=new Usermanager();
        usermanager.login(userobj);
        usermanager.viewProductList();

        
    }
}
