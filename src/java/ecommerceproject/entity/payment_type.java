/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceproject.entity;

/**
 *
 * @author Aarti
 */
public class payment_type {
    int payment_type_id;
    String payment_type_name;

    public payment_type() {
    }

    public payment_type(int payment_type_id, String payment_type_name) {
        this.payment_type_id = payment_type_id;
        this.payment_type_name = payment_type_name;
    }

    public int getPayment_type_id() {
        return payment_type_id;
    }

    public void setPayment_type_id(int payment_type_id) {
        this.payment_type_id = payment_type_id;
    }

    public String getPayment_type_name() {
        return payment_type_name;
    }

    public void setPayment_type_name(String payment_type_name) {
        this.payment_type_name = payment_type_name;
    }

    

}
