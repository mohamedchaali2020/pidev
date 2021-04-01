/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servi;

import Entites.coupon;
import java.util.List;
import java.sql.SQLException;


public interface serviceCoupon  {
   public void Addcoupon(coupon c) throws SQLException; 
  
   public List<coupon> affichercoupon() throws SQLException;
   public void DeleteCoupon(int id) throws SQLException;
   public void UpdateCoupon(coupon c) throws SQLException;
}
