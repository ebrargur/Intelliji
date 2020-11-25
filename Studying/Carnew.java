package com.company.Studying;

public class Carnew {
    private String color;
    private String model;
    private int doors;
public Carnew()
{
    this("Bilgi yok","Bilgi yok",0);
}
public Carnew(String color,String model)
{
    this(color,model,0);
}
    public Carnew(String color,String model,int doors)
    {
        this.color=color;
        this.model=model;
        this.doors=doors;

    }

    public void setColor(String color)
    {
        this.color=color;
    }
    public String getColor()
    {
        return this.color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
       if(doors==2||doors==4)
       {
           this.doors=doors;
       }
       else{
           System.out.println("car dooors must be 2 or 4");
       }
    }
    public void start()
    {
        System.out.println("Araba calisti");
    }
    public void stop()
    {
        System.out.println("araba durdu");
    }
    public void printinfo()
    {

        System.out.println("Arabanin rengi "+color);
        System.out.println("Arabinin modeli "+model);
        System.out.println("Arabanin kapisi "+doors);
    }
}
