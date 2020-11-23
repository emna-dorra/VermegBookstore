
package basicjavaprogram.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        boolean b = true;
		Scanner sc = new Scanner(System.in);
		while(b) {

			try  
			{
				
				System.out.print( "Veuillez entrer la quantité: " );
				int quantity = sc.nextInt();
                                if (quantity<0){System.out.println("La quantité doit être >=0 ! ");}
                        else{
				System.out.print( "Veuillez entrer le prix de l'unité: " );
				double price = sc.nextDouble();
                                if (price<=0){System.out.println("Le prix doit être supérieur à 0 ! ");}
                                else{
                                    
                                Calculate c=new Calculate(quantity,price);
				System.out.println("Total price: " + c.calculateTotalPrice());
				b = false;
			}}}

			catch(InputMismatchException e) {

				System.out.println("Veuillez saisir un nombre");
				System.out.println("Entrer un nombre s'il vous plaît");}

    }
    
    }
}   
