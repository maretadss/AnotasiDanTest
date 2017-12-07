/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi;

import com.valensi.anotasi.Indocyber;
import java.util.Date;

/**
 *
 * @author user
 */@Indocyber(namaClass = "Bootcamp Java 2", year = 2017)
 //fungsinya sebagai penanda bahwa kelas ini 

public class Programmer extends Employee {

    public Programmer() {

    }

    public Programmer(String name, double salary, Date dateOfBirth) {
        super(name, salary, dateOfBirth);

    }

    @Override//anotasi
    public double calculateSalaryWithBonus() {
        //logic here
        return 1000;
    }

    @Override
    public String toString() {
        return "Programmer" + getName();

    }

}
