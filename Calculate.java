/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicjavaprogram.ex1;

/**
 *
 * @author Acer
 */
class Calculate {
     int qte;
     double unitP;

    public Calculate(int qte, double unitP) {
        this.qte = qte;
        this.unitP = unitP;
    }
    public double calculateTotalPrice(){

        return qte*unitP;
        
    
}

    @Override
    public String toString() {
        return "La quantité = " + qte + ", Le prix est = " + unitP ;
    }
}