package Pertemuan14;

public class RekapPenjualajanCafe_A_10 {
    static int[][] penjualan = {
        {20, 20, 25, 20, 10, 60, 10}, // kopi
        {30, 80, 40, 10, 15, 20, 25}, // teh
        {5, 9, 20, 25, 10, 5, 45}, // es kelapa
        {50, 8, 17, 18, 10, 30, 6}, // roti bakar
        {15, 10, 16, 15, 10, 10, 55} // gorengan
    };

    static String[] menu = {"Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan"};

    public static void tampilData() {
        System.out.println("Rekap Penjualan 7 Hari:");
        System.out.print("Menu\t\t");
        for(int h =1; h <= 7; h++) {
            System.out.print("Hari "+h+"\t");
        }

        System.out.println();
        for (int i = 0; i < penjualan.length; i++) {
            System.out.print(menu[i]+"\t");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j]+"\t\t");
            }
            System.out.println();
        }
    }

    public static void menuTerlaris() {
        int maxTotal = 0;
        String menuTerlaris = "";
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                menuTerlaris = menu[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tetinggi adalah "+menuTerlaris+"("+maxTotal+")");
    }

    public static void rataMenu() {
        System.out.println("\nRata-rata penjualan tiap menu:");
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for ( int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rata = (double) total / penjualan[i].length;
            System.out.println(menu[i]+": "+rata);
        }
    }
 
    public static void main(String[] args) {
        tampilData();
        menuTerlaris();
        rataMenu();
    }
}