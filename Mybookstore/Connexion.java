/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mybookstore;

import java.sql.*;



public class Connexion {
    Connection con = null;
    Statement stm;
   
    Connexion(){  
        try{
            Class.forName("com.mysql.jdbc.Driver");}
        catch(ClassNotFoundException e) { 
            System.out.println("Impossible de charger le pilote ");}
      
        try{
      
            con = DriverManager.getConnection("jdbc:mysql://localhost/Librairie","root","");}
        catch (SQLException e) {
            System.out.println("Connection à la base de données impossible");}
      
    }
    
    public void DateUse(Livre livre) {

	try {
         String t=livre.getTitre();
         String a=livre.getAuteur();
         double p=livre.getPrix();
         Date d=livre.getDate_sortie();
         
	String requete = "INSERT INTO livre(titre,auteur,prix,date_sortie) VALUES ('"+t+"','"+a+"','"+p+"','"+d+"')";
        stm = con.createStatement();
        int nbMaj = stm.executeUpdate(requete);
        System.out.println(nbMaj+" livre est ajouté avec succès dans la table");}

        catch (SQLException e) {
            System.out.println("Connection à la base de données impossible");}                 
    }
    
    public void DisplayBook(){
    String requete2 = "SELECT * FROM livre";
      try {
          stm = con.createStatement();
         ResultSet res = stm.executeQuery(requete2);
          

         while(res.next()){
        
               System.out.print(res.getString("titre")+" ");
               System.out.print(res.getString("auteur")+" ");
               System.out.print(res.getDouble("prix")+" ");
               System.out.println(res.getDate("date_sortie"));
             
           
         }
      } catch (SQLException e) {
      System.out.println("Anomalie lors de l'execution de la requête");
      }}
}
