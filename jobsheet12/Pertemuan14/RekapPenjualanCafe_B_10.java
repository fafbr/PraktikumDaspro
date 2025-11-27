 package Pertemuan14;

import java.util.Scanner;
public class RekapPenjualanCafe_B_10 {
    public static void inputData(int[][] penjualan, String[] menu, Scanner sc) {
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Input penjualan untuk menu: "+menu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Hari ke-"+(j+1)+": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    public static void tampilData(int[][] penjualan, String[] menu) {
        System.out.println("\nRekap Penjualan: ");
        System.out.printf("%-18s", "menu");
        for (int h = 1; h <= penjualan[0].length; h++) {
            System.out.printf("Hari %-3d", h);
        }
        System.out.println("");

        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%-18s", menu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.printf("%-10d", penjualan[i][j]);
            }
            System.out.println();
        }
    }

    public static void menuTerlaris(int[][] penjualan, String[] menu) {
        int maxTotal = 0;
        String menuTerlaris = "";
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                menuTerlaris = menu[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi adalah "+menuTerlaris+"( "+maxTotal+")");
    }

    public static void rataMenu(int[][] penjualan, String[] menu) {
        System.out.println("\nRata- rata penjualan tiap menu:");
        for (int i = 0; i < menu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rata = (double) total / penjualan[i].length;
            System.out.println(menu[i]+": "+rata);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah menu: ");
        int jmlMenu = sc.nextInt();
        System.out.print("Masukkan jumlah hari: ");
        int jmlHari = sc.nextInt();
        sc.nextLine();

        String[] menu = new String[jmlMenu];
        int[][] penjualan = new int[jmlMenu][jmlHari];

        for (int i = 0; i < jmlMenu; i++) {
            System.out.print("Masukkan nama menu ke-"+(i+1)+": ");
            menu[i] = sc.nextLine();
        }

        inputData(penjualan, menu, sc);
        tampilData(penjualan, menu);
        menuTerlaris(penjualan, menu);
        rataMenu(penjualan, menu);

        sc.close();
    }
}