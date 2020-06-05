/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10_template_sort;

/**
 *
 * @author HP
 */
public class Product {

    String name;
    float price;
    String quality;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }    

    public Product(String name, float price, String quality) {
        this.name = name;
        this.price = price;
        this.quality = quality;
    }
    
    
    
}
