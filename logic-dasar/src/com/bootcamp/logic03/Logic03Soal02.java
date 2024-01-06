package com.bootcamp.logic03;

import com.bootcamp.utils.InputData;
import com.bootcamp.utils.PrintArray;

import java.util.Scanner;

public class Logic03Soal02 {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int n = InputData.input(scanner);
        // buat array
        int[] array = new int[n];
        // isi array
        int angka = 1;
        for (int i = 0; i < n; i++) {
            if(i % 4 == 3)
                array[i] = 999;
            else if (i % 3 == 2) {
                array[i] = angka * angka;
            } else
                array[i] = angka;
            angka+=2;
        }
        // cetak array
        PrintArray.printArray(array);
    }
}
