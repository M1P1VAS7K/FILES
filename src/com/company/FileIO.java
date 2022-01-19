package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



public class FileIO {

    void replacee(String fileIn,String fileOut) throws FileNotFoundException {
        File in=new File(fileIn);
        File out=new File(fileOut);
        Scanner sc=new Scanner(in);
        PrintWriter pw=new PrintWriter(out);
        while(sc.hasNext()) {
            String word=sc.next();
            if(word.equals("School"))
                word="Школа";
            pw.print(word+" ");
        }
        sc.close();
        pw.close();
    }
    public static void main(String[] args) {
        FileIO test=new FileIO();
        try{
            test.replacee("in.txt", "out.txt");
        }catch(Exception ex){
            System.out.println("Что то пошло не так: "+ex.getMessage());
        }
    }
    /* Например, метод nextInt() считывает очередной int,
    а метод hasNextDouble() возвращает истину
    или ложь в зависимости от того, есть ли в
    потоке следующее значение double для чтения.
    Например, чтение строк файла a.txt и вывод их в консоль построчно:
     */
}
