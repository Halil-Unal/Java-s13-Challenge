package com.modelchallange1;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
   private String email;
   private String  password ;
    private String[] healthPlans;

    public Employee(int id,String fullName, String email, String password, String[] healthPlans) {
        this.id=id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHealthPlans(String[] healthPlans) {
        this.healthPlans = healthPlans;
    }
    public void addHealthPlan(int index,String name){
        try{
            if (healthPlans[index]==null){
                healthPlans[index]=name;
            }else{
                System.out.println("Atama Yapılmış");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Olmayan Index");
        }

    }
    public String toString() {
        return "Name: " + fullName + " id: " + id + " mail: " + email + " password: " + password + " healthplans :" + Arrays.toString(healthPlans);
    }
}
