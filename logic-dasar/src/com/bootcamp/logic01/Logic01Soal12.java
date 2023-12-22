package com.bootcamp.logic01;

import com.bootcamp.utils.PrintArray;

import java.util.Scanner;

public class Logic01Soal12 {
    private static Scanner input;
    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.println("Masukan nilai n: ");
        int n = input.nextInt();
        // buat array
        int[] array = new int[n];
        // isi array
        for (int i = 0; i < n; i++){
            if(i < 3){
                array[i] = 1;
                continue;
            }
            array[i] = array[i-1] + array[i-2] + array[i-3];
        }

        // manggil method printArray dari package util
        PrintArray.printArray(array);
    }
}
