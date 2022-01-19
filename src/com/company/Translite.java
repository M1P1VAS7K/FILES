
package com.company;

import java.util.Scanner;
interface Runnable{
    public void run();
}

interface IntValuable {
    // методы интерфейса
}

interface DoubleValuable extends IntValuable{
    // методы интерфейса
}

class Example implements IntValuable, DoubleValuable {
    // реализация класса
}
class ClassA{

    //ClassA own method
    public void methodA(){
    }
}
class Amount {
    int z = 0;
    Amount () {
        this.z = 0;
    }
    void print() {
        System.out.println(this.z);
    }

}
public class Translite {
    public static void main(String[] args) {
        Amount amount1 = new Amount();
        amount1.print();
    }
}