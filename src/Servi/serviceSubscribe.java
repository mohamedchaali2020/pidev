/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servi;

import Entites.subscribe;
import java.util.List;
import java.sql.SQLException;


public interface serviceSubscribe  {
   public void Addsubscribe(subscribe c) throws SQLException; 
   public List<subscribe> affichersubscribe() throws SQLException;
   public void DeleteSubscribe(int id) throws SQLException;
   public void UpdateSubscribe(subscribe c) throws SQLException;
}
