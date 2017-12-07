/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class TemperatureTest {

    public TemperatureTest() {
    }

    @Test
    public void fahrenheitToCelcius() {
        TemperatureConversion tc = new TemperatureConversion();
        double tesFtoC = tc.fahrenheitToCelcius(210.2);
        double expect = 99;
        System.out.println("hasil "+5.0/9.0);
        assertEquals(expect, tesFtoC, 0.5);
    }
    
    @Test
    public void celciusToFahrenheit(){
        TemperatureConversion tc = new TemperatureConversion();
        double tesCtoF = tc.celciusToFahrenheit(32);
        double expect = 89.6;
        assertEquals(expect, tesCtoF, 0.5);
    
    }

}
