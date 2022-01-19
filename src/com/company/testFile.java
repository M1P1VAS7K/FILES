package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;

public class testFile {
    public static void main(String[] args) {
        testFile test = new testFile();
        try {
            test.checker("src/text1.txt", "src/tetx2.txt", "src/text3.txt");
        } catch (Exception ex) {
            System.out.println("Что то пошло не так: " + ex.getMessage());
        }
    }

    void checker(String inF1, String inF2, String outF3) throws FileNotFoundException {
        /* эээээ пусть ограничегие на выход будет 1000 + 1 символов*/
        int localBarrier = 1000;
        /* Обазначение входов выходов */
        File in1 = new File(inF1);
        File in2 = new File(inF2);
        Scanner sc1 = new Scanner(in1);
        Scanner sc2 = new Scanner(in2);
        PrintWriter pw = new PrintWriter(outF3);
        try {
            String slp1 = "";
            String slp2 = "";
            while (sc1.hasNext() && sc2.hasNext()) {
                String sim1 = sc1.next();
                String sim2 = sc2.next();
                pw.print(sim1 + "           " + sim2 + '\n');
                if(sc1.hasNext())slp1 += sim1 + " ";else slp1 += sim1;
                if(sc2.hasNext())slp2 += sim2 + " ";else slp2 += sim2;
            }
            sc1.close();
            sc2.close();
            pw.close();
            /* перебор */
            int z = 0;
            int i = 0;
            while (z <= localBarrier) {
                try {
                    if (slp1.charAt(i) == slp2.charAt(i)) {
                        System.out.println("Символ -> " + slp1.charAt(i) + " символ номер -> " + (i + 1));
                        z++;
                    }
                }
                catch (Exception e){
                    System.out.println("конец файла");
                    break;
                }
                i += 1;
            }
        } catch (Exception e) {
            System.out.println("*BOOM*");
            System.out.println("Я не всесилен "+e.getMessage());
        }finally {
            System.out.println("Возобновление процеса или конец");
        }


    }

}
