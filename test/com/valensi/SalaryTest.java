package com.valensi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.valensi.Programmer;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class SalaryTest {
    
    public SalaryTest() {
    }
    //untuk mengetes method perhitungan yang kita buat, apakah benar perhitungannya
    @Test
    public void calculateSalaryWithBonus(){
        Programmer p = new Programmer();
        p.setSalary(10000000);
        double gaji = p.calculateSalaryWithBonus(0.25);
        double expect = 12500000;
        assertEquals(expect, gaji, 0);// membandingakan harapan dengan kenyataan/aktual
    }
    
}
