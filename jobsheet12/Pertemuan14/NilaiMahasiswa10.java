package Pertemuan14;

import java.util.Scanner;
public class NilaiMahasiswa10 {
    public static void isianArray(int[] nilai) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <nilai.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+": ");
            nilai[i] = sc.nextInt();
        }

        sc.close();
    }

    public static void tampilArray(int[] nilai) {
        System.out.print("\nDaftar Nilai Mahasiswa:");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Mahasiswa ke-"+(i+1)+": "+ nilai[i]);
        }
    }

    public static int hitTot(int[] nilai) {
        int total = 0;
        for (int n:nilai) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mahasiswa: ");
        int N = sc.nextInt();

        int[] nilaiMahasiswa = new int[N];

        isianArray(nilaiMahasiswa);
        tampilArray(nilaiMahasiswa);

        int totalNilai = hitTot(nilaiMahasiswa);
        System.out.println("Total Seluruh Nilai Mahasiswa = "+totalNilai);

        sc.close();
    }
}