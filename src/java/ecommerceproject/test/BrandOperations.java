/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceproject.test;

import ecommerceproject.manager.BrandManager;

/**
 *
 * @author Aarti
 */
public class BrandOperations {
public static  void  main(String a[])
    {
        BrandManager bm =new BrandManager();
        bm.addBrand(2,"nokia");
          BrandManager bm1 =new BrandManager();
        bm1.addBrand(3,"lee-cooper");

    }

}
