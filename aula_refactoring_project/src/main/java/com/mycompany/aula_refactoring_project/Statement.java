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
public abstract class Statement {

    public abstract String getHeader(Customer aCustomer);

    public abstract String getFigure(Rental r);

    public abstract String getFooter(Customer aCustomer);

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
