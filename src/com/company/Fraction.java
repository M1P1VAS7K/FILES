package com.company;

public class Fraction {
    int numerator; // Числитель
    int denominator; // Знаменатель

    Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator can't be zero. Choose another one.");
            System.out.printf("Была создана автоматом переменная -> 1/1 вместо %d/%d", numerator, denominator);
            System.out.println();
            this.numerator = 1;
            this.denominator = 1;
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int map_go_brrrrrrrrr(int a, int b) {
        int lasT = -1;
        for (int t = 2; t <= b; t++) {
            if (a % t == 0 && b % t == 0) {
                lasT = t;
            }
        }
        if (lasT != -1) return lasT;
        return 1;
    }

    public Fraction division(Fraction a) {
        int z1 = this.numerator * a.denominator;
        int z2 = this.denominator * a.numerator;
        int del = map_go_brrrrrrrrr(z1, z2);
        if (del != -1) {
            z1 /= del;
            z2 /= del;
        }
        Fraction lp = new Fraction(z1, z2);
        return lp;
    }

    public Fraction multiplication(Fraction a) {
        int z1 = this.numerator * a.numerator;
        int z2 = this.denominator * a.denominator;
        int del = map_go_brrrrrrrrr(z1, z2);
        if (del != -1) {
            z1 /= del;
            z2 /= del;
        }
        Fraction lp = new Fraction(z1, z2);
        return lp;
    }

    public Fraction subtraction(Fraction a) {
        int z1 = this.numerator * a.denominator - a.numerator * this.denominator;
        int z2 = this.denominator * a.denominator;
        int del = map_go_brrrrrrrrr(z1, z2);
        if (del != -1) {
            z1 /= del;
            z2 /= del;
        }
        Fraction lp = new Fraction(z1, z2);
        return lp;
    }

    @Override
    public String toString() {
        return (this.numerator + "/" + this.denominator);
    }

    public static void main(String[] args) {
        Fraction x1 = new Fraction(2, 3);
        Fraction x2 = new Fraction(2, 3);
        Fraction result_div = x1.division(x2);
        System.out.println(result_div);
        Fraction result_mult = x1.multiplication(x2);
        System.out.println(result_mult);
        Fraction result_sub = x2.subtraction(x1);
        System.out.println(result_sub);

        Fraction x3 = new Fraction(0, 0);
        Fraction x4 = new Fraction(10, 10);
        Fraction result_div1 = x3.division(x4);
        System.out.println(result_div1);
        Fraction result_mult1 = x3.multiplication(x4);
        System.out.println(result_mult1);
        Fraction result_sub1 = x3.subtraction(x4);
        System.out.println(result_sub1);

        Fraction x5 = new Fraction(30, 4);
        Fraction x6 = new Fraction(6, 7);
        Fraction result_div2 = x5.division(x6);
        System.out.println(result_div2);
        Fraction result_mult2 = x5.multiplication(x6);
        System.out.println(result_mult2);
        Fraction result_sub2 = x5.subtraction(x6);
        System.out.println(result_sub2);
    }
}
