/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entites.coupon;
import Utils.Maconnexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import Servi.serviceCoupon;

/**
 *
 * @author dell
 */
public class serviceCouponn implements serviceCoupon{
    Connection cnx;
    List<coupon> coupons=new ArrayList<>();

    public serviceCouponn(){
    cnx=Maconnexion.getInstance().getCnx()  ;
    }
    
   

    @Override
    public List<coupon> affichercoupon ()throws SQLException {
        
            Statement stm=cnx.createStatement();
       
    String query="SELECT * FROM `coupon`";
            ResultSet rst=stm.executeQuery(query);
            
            
                  List<coupon> coupons=new ArrayList<>();
        while(rst.next())
           
        {
        coupon c=new coupon();
        
        c.setcoupon_id(rst.getInt("coupon_id"));
         c.setcoupon_key(rst.getString("coupon_key"));
        c.setvalue(rst.getString("value"));
       
     
     
        
        coupons.add(c);
        
        }
        
        
        
     
    return coupons;
    }



    @Override
    public void Addcoupon(coupon c) throws SQLException {
 try {
            Statement stm=cnx.createStatement();
       
        String query="INSERT INTO `coupon`(`coupon_key`, `value`) VALUES ('"+c.getcoupon_key()+"','"+c.getvalue()+"')";
      
        stm.executeUpdate(query);
        
        } catch (SQLException ex) {
            Logger.getLogger(serviceCouponn.class.getName()).log(Level.SEVERE, null, ex);
        }       }

    @Override
    public void UpdateCoupon(coupon c) throws SQLException {
            Statement stm=cnx.createStatement();
       
        String query="UPDATE coupon SET value= '"+c.getvalue()+"'  , coupon_key ='"+c.getcoupon_key()+"'WHERE coupon_id='"+c.getcoupon_id()+"'";
      
        
        
        stm.executeUpdate(query);    }

    @Override
    public void DeleteCoupon(int id) throws SQLException {
 try {
            Statement stm=cnx.createStatement();
       
        String query="DELETE FROM `coupon` WHERE  coupon_id = '"+ id+"'";
      
        stm.executeUpdate(query);
        
        } catch (SQLException ex) {
            Logger.getLogger(serviceCouponn.class.getName()).log(Level.SEVERE, null, ex);
        }       }

   

   
    
}
