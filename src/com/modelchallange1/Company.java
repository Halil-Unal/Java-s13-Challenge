package com.modelchallange1;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private int giro;
    private String[] developerNames;

    public Company(int id, String name, int giro, String[] developerNames) {
        this.id = id;
        this.name = name;
       checkGiro(giro);
        this.developerNames = developerNames;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGiro(int giro) {
        checkGiro(giro);
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }
   private void checkGiro(int giro){
        if(giro<0){
            giro=0;
        }else{
            this.giro=giro;
        }
    }
    public void addNames(int index,String name){
        try{
            if(developerNames[index]==null){
                developerNames[index]=name;
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("olmayan index");
        }


    }
    public String toString() {
        return "Name: " + name + " id: " + id + " giro: " + giro + " names: " + "developers" + Arrays.toString(developerNames);
    }
}
