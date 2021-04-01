/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servi;

import Entites.promotion;
import java.util.List;
import java.sql.SQLException;


public interface servicePromotion  {
   public void Addpromotion(promotion c) throws SQLException; 
   public List<promotion> afficherpromotion() throws SQLException;
   public void DeletePromotion(int id) throws SQLException;
   public void UpdatePromotion(promotion c) throws SQLException;
}
