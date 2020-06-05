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
public class SortByName extends SortCollection<Product>{

    @Override
    protected int compare(Product t1, Product t2) {
        return t1.getName().compareTo(t2.getName());
    }
    
}
