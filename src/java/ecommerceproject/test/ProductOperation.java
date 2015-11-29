/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceproject.test;

import ecommerceproject.manager.ProductManager;

/**
 *
 * @author Aarti
 */
public class ProductOperation {
public static void main(String a[])
    {
   // ProductManager pm =new ProductManager();
  //  ProductManager pm1 =new ProductManager();
  //  pm.addProduct(12,2,5000,1,1,"mobile","1234fgnfg","abc//url//","good features");
    // pm1.addProduct(19,1,10000,1,2, "fridge","1234sdf","/abc//sdee//","nic");
   // pm1.lisProduct();
    //ProductManager pm3 =new ProductManager();
   // pm3.addProduct(12,1,2000, 2,3,"shirt","24234","abc//dfg//","gud");
    //ProductManager pm4 =new ProductManager();
   // pm4.addProduct(13,2,2800,2,3,"black shirt","sds//sfdf//ty","gfdg", "nice");
    //pm4.addProduct(14,2,2800,2,3,"white shirt","sds//sfdf//ty","gfdg", "nice");

     ProductManager p =new ProductManager();
     p.addProduct("micromax");
     p.lisProduct();
}
}
