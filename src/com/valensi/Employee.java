/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi;

import java.util.Date;

/**
 *
 * @author user
 */
public class Employee {
    
    private String name;
    private double salary;
    private Date dateOfBirth;

    public Employee() {
    }

    public Employee(String name, double salary, Date dateOfBirth) {
        this.name = name;
        this.salary = salary;
        this.dateOfBirth = dateOfBirth;
    }
    
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the dateOfBirth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    @Deprecated // method yang sekarang sudah tidak direkomendasi lagi
    public double calculateSalaryWithBonus(){
        //logic here
    return this.salary + 100;
    }
    
    public double calculateSalaryWithBonus(double presentBonus){
        return (this.salary*presentBonus) + this.salary;
    
    }
    
}
