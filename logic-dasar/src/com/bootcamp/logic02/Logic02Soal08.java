package com.bootcamp.logic02;

import java.util.Scanner;

public class Logic02Soal08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai n: ");
        int n = input.nextInt();

        //buat finonacchi
        int[] fibo = new int[n];
        // 1 1 2 3 5 8 13 21
        // 0 1 2 3 4 5 6  7
        for (int i = 0; i < n; i++) {
            if(i < 2){
                fibo[i] = 1;
            }else {
                fibo[i] = fibo[i-1] + fibo[i-2];
            }
        }

        int[][] array = new int[n][n];
        // isi array
        // ke bawah
        int index = 0;
        int nTengah = n/2;
        for (int i = 0; i < n; i++) {
            // ke samping
            for (int j = 0; j < n; j++) {
                if(i+j <= n-1 && j>= nTengah){
                    array[i][j] = fibo[index];
                }
                if(i+j >= n-1 && j<= nTengah){
                    array[i][j] = fibo[index];
                }
            }

            if(i < nTengah) {
                index++;
            }else {
                index--;
            }
        }

        // cetak array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // kesamping
                if(array[i][j] == 0){
                    System.out.print("\t");
                    continue;
                }
                System.out.print(array[i][j] + "\t");
            }
            // pindah baris
            System.out.println("\n");
        }

    }
}
