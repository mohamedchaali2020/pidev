/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entites;

/**
 *
 * @author dell
 */
public class coupon  {
 private int coupon_id;
 private String coupon_key;
 private String value;


    

   
 
 
 
    
 
 public coupon (){
 
 }
 public String getcoupon_key() {
        return coupon_key;
    }
 public void setcoupon_key(String coupon_key) {
        this.coupon_key = coupon_key;
    }
    public int getcoupon_id() {
        return coupon_id;
    }

    public void setcoupon_id(int coupon_id) {
        this.coupon_id = coupon_id;
    }

    public String getvalue() {
        return value;
    }

    public void setvalue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "coupon{" + "coupon_id=" + coupon_id + ", coupon_key=" + coupon_key + ", value=" + value + "}\n";
    }

   

   


 

    

    
}
