/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceproject.test;

import ecommerceproject.manager.CategoryManager;
/**
 *
 * @author Aarti
 */
public class CategoryCreate {

    public static  void  main(String a[])
    {
        CategoryManager cm =new CategoryManager();
        cm.addCategory(1,"Women");
         CategoryManager cm1 =new CategoryManager();
        cm1.addCategory(2,"Tshirt");
        cm1.lisCategory();
    }

}
