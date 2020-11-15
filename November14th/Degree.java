package com.company.November14th;

public class Degree {


    public void getPrerequisite()
    {
        System.out.println("To get a degree you need a high school diploma");
    }


    public static void main(String[] args) {
        Bachelors obj=new Bachelors();
        obj.getPrerequisite();
        Masters obj2=new Masters();
      obj2.getPrerequisite();


    }
}
class Bachelors extends Degree{

    public void getPrerequisite() {
        System.out.println("To get a degree you need a high school diploma");
    }

}
   class Masters extends Degree{

    public void getPrerequisite() {
        System.out.println("You need bachelor degree");
    }
}
