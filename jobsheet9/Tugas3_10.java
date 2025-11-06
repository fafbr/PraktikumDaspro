import java.util.Scanner;
public class Tugas3_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hasil = -1;
        String pesanan;
        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Gorenng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };

        System.out.println("=== Daftar Menu yang Tesedia ===");
        for (int i=0; i<menu.length;i++) {
            System.out.println((i+1)+". "+menu[i]);
        }
        
        System.out.print("\nMasukkkan Pesanan yang ingin Anda cari: ");
        pesanan = sc.nextLine();

        for (int i=0; i<menu.length;i++) {
            if (pesanan.equalsIgnoreCase(menu[i])) {
                hasil = i;
                break;
            }
        }

        System.out.println();
        if (hasil != -1) {
            System.out.println("Menu "+pesanan+ " Anda ditemukan di indeks ke-"+(hasil+1));
        } else {
            System.out.println("Mohon Maaf Menu "+pesanan+" yang Anda cari tidak ditemukan didaftar Menu");
        }
    }
}
