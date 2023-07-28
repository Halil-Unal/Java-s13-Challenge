package com.modelchallange1;

public class HealthPlan {
    private int id;
   private String name;
   plan plan;

    public HealthPlan(int id, String name, com.modelchallange1.plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public com.modelchallange1.plan getPlan() {
        return plan;
    }

    public void setPlan(com.modelchallange1.plan plan) {
        this.plan = plan;
    }
}
