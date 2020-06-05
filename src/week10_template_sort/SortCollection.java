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
public abstract class SortCollection<T> {
    
    protected abstract int compare(T t1, T t2);    
    public void sort(ArrayList<T> list){
        T temp;
        for(int i = 0 ; i < list.size()-1 ; i++){
            for(int j = 0 ;j < list.size()-i-1 ; j++){
                if(compare(list.get(j), list.get(j+1))>=1){
                    temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j+1, temp);
                }
            }
        }
    }
}
