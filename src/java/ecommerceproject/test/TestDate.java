/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceproject.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aarti
 */
public class TestDate {
    public static void main(String s[])
    {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date d = (Date) sdf.parse("2015-09-06 11:00:00");

            System.out.println(d.toString());
            //System.out.println(d.toString());
        } catch (ParseException ex) {
            Logger.getLogger(TestDate.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
