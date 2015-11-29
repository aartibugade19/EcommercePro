/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ecommerceproject.entity;

import java.util.Set;

/**
 *
 * @author Aarti
 */
public class product {

    int product_id,product_quantity,product_prize,category_id,brand_id;
    String product_name,product_sku,product_image,product_description;

    private Set<category> category;

    public product(String product_name) {
        this.product_name = product_name;
    }

    public Set<category> getCategory() {
        return category;
    }

    public void setCategory(Set<category> category) {
        this.category = category;
    }



    public product() {
    }

    public product(int product_id, int product_quantity, int product_prize, int category_id, int brand_id, String product_name, String product_sku, String product_image, String product_description) {
        this.product_id = product_id;
        this.product_quantity = product_quantity;
        this.product_prize = product_prize;
        this.category_id = category_id;
        this.brand_id = brand_id;
        this.product_name = product_name;
        this.product_sku = product_sku;
        this.product_image = product_image;
        this.product_description = product_description;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_prize() {
        return product_prize;
    }

    public void setProduct_prize(int product_prize) {
        this.product_prize = product_prize;
    }

    public int getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(int product_quantity) {
        this.product_quantity = product_quantity;
    }

    public String getProduct_sku() {
        return product_sku;
    }

    public void setProduct_sku(String product_sku) {
        this.product_sku = product_sku;
    }

    
}
