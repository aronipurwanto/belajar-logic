package com.bootcamp.utils;

public class DeretAngka {
    public static int[] fibo(int n, int t){
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            if(i < t){
                array[i] = 1;
                continue;
            }
            int result = 0;
            for (int j = 1; j <= t ; j++) {
                result = result + array[i-j];
            }
            array[i] = result;
        }

        return array;
    }

    public static int[] ganjil(int n){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (i*2)+1;
        }

        return array;
    }

    public static int[] pangkat(int n, int p){
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            double angka = (double) i+1;
            double hasil = Math.pow(angka, (double) p);
            array[i] = (int) hasil;
        }
        return array;
    }
}
