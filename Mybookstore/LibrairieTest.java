/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mybookstore;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;


public class LibrairieTest {
   
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        Scanner sc = new Scanner(System.in);
        Connexion con=new Connexion();
      
       		
                System.out.print( "Veuillez entrer le titre du livre:  " );
                String titre= sc.nextLine();
                System.out.print( "Veuillez entrer l'auteur du livre:  " );
                String auteur= sc.nextLine();
                System.out.print( "Veuillez entrer le prix du livre:  " );
                Double prix= sc.nextDouble();
               
                String date_s= "2020-11-21";
                
               
                Date d=Date.valueOf(date_s);
        
                Livre l =new Livre(titre,auteur,prix,d);
                con.DateUse(l);
                con.DisplayBook();
        
        }
        
    }
    

