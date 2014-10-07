/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package flow_assignment_01;

/**
 *
 * @author Armandi
 */
public class Person {
    
     private String name;
     private int admin;
     private int finisher;
     private int analyzer;
     private int creator;
     private int totalt = admin+finisher+analyzer+creator;

    @Override
    public String toString() {
        return  "Name: " + name + "Admin: " + admin + "Finisher: " + finisher + " Analyzer: " + analyzer + "Creator: " + creator;
    }
     
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    public int getFinisher() {
        return finisher;
    }

    public void setFinisher(int finisher) {
        this.finisher = finisher;
    }

    public int getAnalyzer() {
        return analyzer;
    }

    public void setAnalyzer(int analyzer) {
        this.analyzer = analyzer;
    }

    public int getCreator() {
        return creator;
    }

    public void setCreator(int creator) {
        this.creator = creator;
    }
}
