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
public class HtmlStatement extends Statement {

    public String getHeader(Customer aCustomer) {
        String header = "<H1>Rentals for <EM>" + aCustomer.getName()
                + "</EM></H1><P>\n";
        return header;
    }

    public String getFigure(Rental r) {
        String figure = r.getMovie().getTitle() + ": "
                + String.valueOf(r.getCharge()) + "<BR>\n";
        return figure;
    }

    public String getFooter(Customer aCustomer) {
        String footer = "<P>You owe <EM>"
                + String.valueOf(aCustomer.getTotalCharge()) + "</EM><P>\n";
        footer += "On this rental you earned <EM>"
                + String.valueOf(aCustomer.getTotalFrequentRenterPoints())
                + "</EM> frequent renter points<P>";
        return footer;
    }
}
