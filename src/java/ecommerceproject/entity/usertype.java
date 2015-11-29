/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceproject.entity;

/**
 *
 * @author Aarti
 */
public class usertype {
    int usertype_id;
    String role;

    public usertype() {
    }

    public usertype(int usertype_id, String role) {
        this.usertype_id = usertype_id;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getUsertype_id() {
        return usertype_id;
    }

    public void setUsertype_id(int usertype_id) {
        this.usertype_id = usertype_id;
    }
    


}
