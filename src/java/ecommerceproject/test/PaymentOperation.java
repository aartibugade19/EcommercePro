/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceproject.test;

import ecommerceproject.entity.payment_type;
import ecommerceproject.manager.PaymentTypeManager;

/**
 *
 * @author Aarti
 */
public class PaymentOperation {
public static  void  main(String a[])
    {
        PaymentTypeManager pm = new PaymentTypeManager();
        pm.addPaymentType(13,"cash on delivery");
    }
}
