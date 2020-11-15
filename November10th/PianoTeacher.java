package com.company.November10th;

public class PianoTeacher extends Teacher{
    String mainSubject="Piano";
    String teachername="Ebrar";
    String lastname="Gur";
    void print4()
    {
        System.out.println("Piano Teacher: "+mainSubject+teachername+lastname);
    }

    public static void main(String[] args) {
        PianoTeacher obj=new PianoTeacher();
        obj.print();
        obj.print4();

    }
}
