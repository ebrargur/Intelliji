package com.company.Udemy;

public class Car {
    private int doors;
    private String model;
    private String color;

    public void setModel(String model)
    {
    String ValidModel=model.toLowerCase();
        if (ValidModel.equals("mazda")||ValidModel.equals("Porshe"))
        {
        this.model=model;}
        else{
            this.model="unknown";
        }
    }
    public String getModel()
    {
        return this.model;

    }
}
