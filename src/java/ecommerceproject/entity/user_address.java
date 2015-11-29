/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceproject.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aarti
 */
public class user_address {
String state,city,country,address_line1;
Date date_time;
int pin_no,address_id,user_id;

    public user_address(String state, String city, String country, String address_line1,String date_time, int pin_no, int address_id,int user_id) {
        this.state = state;
        this.city = city;
        this.country = country;
        this.address_line1 = address_line1;
        this.pin_no = pin_no;
        this.address_id = address_id;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         Date d = null;
        try {
            d = (Date) sdf.parse(date_time);
        } catch (ParseException ex) {
          ex.printStackTrace();
        }
        //this.date_time=d;
        this.user_id=user_id;
    }

    public user_address() {
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public String getAddress_line1() {
        return address_line1;
    }

    public void setAddress_line1(String address_line1) {
        this.address_line1 = address_line1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getDate_time() {
        return date_time;
    }

    public void setDate_time(Date date_time) {
        this.date_time = date_time;
    }


    public int getPin_no() {
        return pin_no;
    }

    public void setPin_no(int pin_no) {
        this.pin_no = pin_no;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    
   

}
