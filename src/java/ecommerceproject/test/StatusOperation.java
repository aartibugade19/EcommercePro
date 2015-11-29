/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceproject.test;

import ecommerceproject.manager.StatusManager;

/**
 *
 * @author Aarti
 */
public class StatusOperation {
public static  void  main(String a[])
    {
       StatusManager sm =new StatusManager();
        sm.addStatus(12,"approved");
    }
}
