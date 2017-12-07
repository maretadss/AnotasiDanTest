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
public class TestDeprecated {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Employee ee = new Employee();
        ee.setName("Mareta");
        ee.setSalary(6000000);
        System.out.println(ee.getName()+" Gaji : " + ee.calculateSalaryWithBonus(0.25));
        System.out.println("Jumlah dulu " + ee.calculateSalaryWithBonus());
        
    }
    
}
