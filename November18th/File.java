package com.company.November18th;

public abstract class File {//open all the files we dont want to implement

    public abstract void open();//it is different depending file

    public  void edit()
    {
        System.out.println("you can edit files");
    }
    public  void close()
    {
        System.out.println("you can close files");
    }

}
class JavaFile extends File{
    public void open()
    {
        System.out.println("You can open Java files in notepad");
    }

}

class WordFile extends File{
  public void open()
  {
      System.out.println("You can use Microsoft to open doc files");
  }
}
class PdfFile extends File{
 public void open()
 {
     System.out.println("You can open files in pdf");
 }
}