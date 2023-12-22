package com.bootcamp.logic01;

import com.bootcamp.utils.PrintArray;

import java.util.Scanner;

public class Logic01Soal14 {
    private static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.println("Masukan nilai n: ");
        int n = input.nextInt();
        System.out.println("Masukan nilai type: ");
        int t = input.nextInt();
        // buat array
        int[] array = new int[n];
        // isi array
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

        // manggil method printArray dari package util
        PrintArray.printArray(array);
    }
}
