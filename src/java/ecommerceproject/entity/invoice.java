/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceproject.entity;

/**
 *
 * @author Aarti
 */
public class invoice {
int invoice_id,user_id,product_id,payment_type_id,address_id,status_id,product_prize;
String name;

    public invoice(int invoice_id, int user_id, int product_id, int payment_type_id, int address_id, int status_id, int product_prize, String name) {
        this.invoice_id = invoice_id;
        this.user_id = user_id;
        this.product_id = product_id;
        this.payment_type_id = payment_type_id;
        this.address_id = address_id;
        this.status_id = status_id;
        this.product_prize = product_prize;
        this.name = name;
    }

    public invoice() {
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public int getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(int invoice_id) {
        this.invoice_id = invoice_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPayment_type_id() {
        return payment_type_id;
    }

    public void setPayment_type_id(int payment_type_id) {
        this.payment_type_id = payment_type_id;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getProduct_prize() {
        return product_prize;
    }

    public void setProduct_prize(int product_prize) {
        this.product_prize = product_prize;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    


}
