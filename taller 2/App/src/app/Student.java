/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author darkh
 */
public class Student {
    private String rut;
    private String name;
    private String email;
    private int level;
    private String password;
    private int credits_amount;

    public Student(String rut, String name, String email, int level, String password, int credits_amount) {
        this.rut = rut;
        this.name = name;
        this.email = email;
        this.level = level;
        this.password = password;
        this.credits_amount = credits_amount;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCredits_amount() {
        return credits_amount;
    }

    public void setCredits_amount(int credits_amount) {
        this.credits_amount = credits_amount;
    }
    
}
