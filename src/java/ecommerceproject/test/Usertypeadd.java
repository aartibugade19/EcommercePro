/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceproject.test;

import ecommerceproject.manager.UserAddressManager;
import ecommerceproject.manager.UserTypeManager;
import ecommerceproject.manager.UserTypeManager;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Aarti
 */
public class Usertypeadd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*UserTypeManager sm = new UserTypeManager();
        sm.adduser(1,"customer");*/
       /*Usermanager um = new Usermanager();
       um.adduser("arati","arti@gmail.com","1234",12,3534663);*/
        UserAddressManager ud = new UserAddressManager();
        ud.adduser("maharashtra","pune","india", "narhe","2015-09-06 11:00:00",411401,126,12);
    }
}
