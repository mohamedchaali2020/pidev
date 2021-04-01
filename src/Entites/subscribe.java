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
public class subscribe {
 private int id;
 private String mail; 
 private String nom,prenom ;
  
    

   
    
 
 public subscribe (){
     
 
 }

  public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
 
    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getmail() {
        return mail;
    }

    public void setmail(String mail) {
        this.mail = mail;
    }

   

   
   @Override
    public String toString() {
        return "subscribe{" + "id=" + id + ", mail=" + mail + ", nom=" + nom + ", prenom=" + prenom + "}\n";
    }

 
}
    
    

  