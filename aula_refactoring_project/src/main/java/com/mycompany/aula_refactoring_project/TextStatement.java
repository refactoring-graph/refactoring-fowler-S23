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

    public String getHeader(Customer aCustomer) {
        String header = "Rental Record for " + aCustomer.getName()
                + "\n";
        return header;
    }

    public String getFigure(Rental r) {
        String figure = "\t" + r.getMovie().getTitle() + "\t"
                + String.valueOf(r.getCharge()) + "\n";
        return figure;
    }

    public String getFooter(Customer aCustomer) {
        String footer = "Amount owed is "
                + String.valueOf(aCustomer.getTotalCharge()) + "\n";
        footer += "You earned "
                + String.valueOf(aCustomer.getTotalFrequentRenterPoints())
                + " frequent renter points";
        return footer;
    }

}
