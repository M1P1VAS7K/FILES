package com.company;

import Secret.Secret;
public class Main{

    public static void main(String[] args) {
        Integer [] iArr = {1,2,3};
        System.out.println(check(new ThreeIntegers<>(4, 5, 3)));
    }
    public static boolean check(ThreeIntegers<Integer, Integer, Integer> three){
        Integer z1 = three.t1;
        Integer z2 = three.t2;
        Integer z3 = three.t3;
        Integer max = Math.max(z3, Math.max(z1, z2));
        return max * max == z1 * z1 + z2 * z2 + z3 * z3 - max * max;
    }

}
class ThreeIntegers<T1, T2, T3>{
    T1 t1;
    T2 t2;
    T3 t3;

    public ThreeIntegers(T1 t1, T2 t2, T3 t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

}