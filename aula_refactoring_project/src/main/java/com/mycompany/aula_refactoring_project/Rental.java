/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula_refactoring_project;

/**
 *
 * @author marcos
 */
public class Rental {

    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public double getCharge() {
        double amount = 0;
        switch (this._movie.getPriceCode()) {
            case Movie.REGULAR:
                amount += 2;
                if (this._daysRented > 2) {
                    amount += (this._daysRented - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                amount += this._daysRented * 3;
                break;
            case Movie.CHILDRENS:
                amount += 1.5;
                if (this._daysRented > 3) {
                    amount += (this._daysRented - 3) * 1.5;
                }
                break;
        }
        return amount;
    }

    public int getFrequentRenterPoints() {
        // add bonus for a two day new release rental
        if ((this._movie.getPriceCode() == Movie.NEW_RELEASE)
                && this._daysRented > 1) {
            return 2;
        }
        return 1;
    }

}
