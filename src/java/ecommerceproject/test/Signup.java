/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceproject.test;

import ecommerceproject.entity.user;
import ecommerceproject.manager.Usermanager;

/**
 *
 * @author Aarti
 */
public class Signup {

    public static void main(String[] args) {

        Usermanager um = new Usermanager();
        um.adduser("twst","test@gmail.com","12345",12,838007650);
        Usermanager um1 =new Usermanager();
        um1.adduser("artai","arti@gmail.com","123",1,546455556);

        
    }

}
