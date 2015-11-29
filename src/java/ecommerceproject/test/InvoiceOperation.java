/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceproject.test;

import ecommerceproject.manager.InvoiceManager;

/**
 *
 * @author Aarti
 */
public class InvoiceOperation {
 public static  void  main(String a[])
    {
      InvoiceManager in =new InvoiceManager();
      in.addInvoice(12,11,14,15,16,17,10000,"rt");
    }
}
