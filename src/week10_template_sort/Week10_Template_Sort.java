/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10_template_sort;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class Week10_Template_Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Product> listProduct = new ArrayList<>();
        Product p1 = new Product("A", 12312, "Good");
        Product p2 = new Product("F", 123992, "bad");
        Product p3 = new Product("C", 12123992, "Gooodd");
        listProduct.add(p1);
        listProduct.add(p2);
        listProduct.add(p3);
        
        SortCollection<Product> ss = new SortByName();
        ss.sort(listProduct);
        for(var i: listProduct){
            System.out.println(i.getName());
        }
        
        ss = new SortByPrice();
        ss.sort(listProduct);
        for(var i:listProduct){
            System.out.println(i.getPrice());
        }
    }
    
}
