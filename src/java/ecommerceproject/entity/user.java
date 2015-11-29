/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceproject.entity;

import java.util.List;

/**
 *
 * @author Aarti
 */
public class user {
    String name,email_id,password;
    int user_id,mobile_no;
    List <user_address> list;
    

    public user(String emailid, String password) {
        this.email_id = emailid;
        this.password = password;
    }

    
    public user(String name, String emailid, String password, int user_id,int mobile_no) {
        this.name = name;
        this.email_id = emailid;
        this.password = password;
       this.user_id = user_id;
        this.mobile_no = mobile_no;
//        this.user_id=10;
    }

    
    public user() {
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public int getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(int mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public List<user_address> getList() {
        return list;
    }

    public void setList(List<user_address> list) {
        this.list = list;
    }

    


}
