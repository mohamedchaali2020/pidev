/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

/**
 *
 * @author mohamed
 */
public class promotion {
 private int promotion_id;
 private String value;
 
    
 
 public promotion (){
 
 }

    public int getpromotion_id() {
        return promotion_id;
    }

    public void setpromotion_id(int promotion_id) {
        this.promotion_id = promotion_id;
    }

    public String getvalue() {
        return value;
    }

    public void setvalue(String value) {
        this.value = value;
    }

   

    @Override
    public String toString() {
        return "promotion{" + "promotion_id=" + promotion_id + ", value=" + value +  "}\n";
   

 
}
    }
    

  