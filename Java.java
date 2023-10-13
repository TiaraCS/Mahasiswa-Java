/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.quiz;

/**
 *
 * @author muham
 */
import java.util.Scanner;
public class Java {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String username = "syafiq";
        String password = "sya1234";

        System.out.print("Username : ");
        String inputUsername = input.nextLine();
        System.out.print("Password : ");
        String inputPassword = input.nextLine();

        if (!inputUsername.equals(username) || !inputPassword.equals(password)) {
            System.out.println("Username atau Password Salah.");
            return;
        }

        System.out.println("=====Masukan Data Anda=====");

        System.out.print("Nama :");
        String nama = input.nextLine();

        System.out.print("Kelas :");
        String kelas = input.nextLine();

        System.out.println("=====Masukan Nilai Anda=====");
        int Nilaitotal = 0;
        System.out.print("Nilai Tugas :");
        int Ntugas = input.nextInt();

        System.out.print("Nilai Quiz :");
        int Nquiz = input.nextInt();

        System.out.print("Nilai Absensi :");
        int Nabsen = input.nextInt();

        System.out.print("Nilai UTS :");
        int Nuts = input.nextInt();

        System.out.print("Nilai UAS :");
        int Nuas = input.nextInt();

        int Nilaiakhir = (int) ((Ntugas * 0.15) + (Nquiz * 0.10) + (Nabsen * 0.10) + (Nuts * 0.30) + (Nuas * 0.35));
        Nilaitotal += Nilaiakhir;

        System.out.println("===================");
        System.out.println("Data Keseluruhan :");
        System.out.println("===================");
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("Nilai Keseluruhan : " + Nilaiakhir);

        String Grade;

        if (Nilaiakhir >= 90) {
            System.out.println("Grade : A");
        } else if (Nilaiakhir >= 85) {
            System.out.println("Grade : A-");
        } else if (Nilaiakhir >= 80) {
            System.out.println("Grade : B+");
        } else if (Nilaiakhir >= 70) {
            System.out.println("Grade : B");
        } else if (Nilaiakhir >= 65) {
            System.out.println("Grade : B-");
        } else if (Nilaiakhir >= 60) {
            System.out.println("Grade : C");
        } else if (Nilaiakhir >= 50) {
            System.out.println("Grade : D");
        } else if (Nilaiakhir >= 0) {
            System.out.println("Grade : E");
        }

    }
}

}
}
