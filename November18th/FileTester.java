package com.company.November18th;

public class FileTester {
    public static void main(String[] args) {
        File[] allfiles={new JavaFile(),new WordFile(),new PdfFile()};

        for(File file:allfiles)
        {
            file.open();
      file.edit();
      file.close();
        }
    }
}
