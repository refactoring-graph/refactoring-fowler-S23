/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula_refactoring_project;
import java.util.Enumeration;
/**
 *
 * @author marcos
 */
public class TextStatement extends Statement {
    
    private String getHeader(Customer aCustomer) {
        String header = "Rental Record for " + aCustomer.getName()
                + "\n";
        return header;
    }
    
    private String getFigure(Rental r) {
        String figure = "\t" + r.getMovie().getTitle() + "\t"
                    + String.valueOf(r.getCharge()) + "\n";
        return figure;
    }
    
    private String getFooter(Customer aCustomer) {
        String footer = "Amount owed is "
                + String.valueOf(aCustomer.getTotalCharge()) + "\n";
        footer += "You earned "
                + String.valueOf(aCustomer.getTotalFrequentRenterPoints())
                + " frequent renter points";
        return footer;
    }  
    
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = getHeader(aCustomer);
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            result += getFigure(each);
        }
        //add footer lines
        result += getFooter(aCustomer);
        return result;
    }
}
