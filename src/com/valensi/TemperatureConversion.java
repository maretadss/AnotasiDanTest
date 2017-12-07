/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi;

/**
 *
 * @author user
 */
public class TemperatureConversion {

    public TemperatureConversion() {
    }
    
    
    public double fahrenheitToCelcius(double fahrenheit){
        double celcius = 5.0/9 * (fahrenheit - 32);
        return celcius;
    } 
    
    public double celciusToFahrenheit(double celcius){
        double fahrenheit = (celcius * 9/5) + 32;
        return fahrenheit;
    
    }
   
}
