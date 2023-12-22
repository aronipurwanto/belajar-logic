package com.bootcamp.logic02;

import com.bootcamp.utils.DeretAngka;
import com.bootcamp.utils.InputData;
import com.bootcamp.utils.PrintArray;

import java.util.Scanner;

public class Logic02Soal01 {
    private static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        int n = InputData.input(scanner);

        // buat deret angka
        //int[] fibo = DeretAngka.fibo(n,2);
        int[] fibo = DeretAngka.pangkat(n,3);

        // create array
        int[][] array = new int[n][n];
        for (int b = 0; b < n; b++) {
            for (int k = 0; k < n; k++) {
                /**
                if(b == k || b+k == n-1){
                    array[b][k] = fibo[b];
                }

                if(b <= k && b+k <= n-1){
                    array[b][k] = fibo[b];
                }
                if(b >= k && b+k >= n-1){
                    array[b][k] = fibo[b];
                }
                 **/
                if(b >= k && b+k <= n-1){
                    array[b][k] = fibo[b];
                }

                if(b <= k && b+k >= n-1){
                    array[b][k] = fibo[b];
                }
            }
        }

        // cetak array
        PrintArray.printArray(array);
    }
}
