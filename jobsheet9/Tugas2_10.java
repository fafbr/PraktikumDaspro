import java.util.Scanner;
public class Tugas2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan Anda: ");
        int jmlPesanan = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan = new String[jmlPesanan];
        double[] hargaPesanan = new double[jmlPesanan];

        for (int i=0; i<jmlPesanan; i++) {
            System.out.println("\nPesanan ke-"+(i+1));
            System.out.print("Nama makanan/minuman: ");
            namaPesanan[i] = sc.nextLine();
            

            System.out.println("Harga: ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine();
        }

        double totBiaya=0;
        System.out.println("\nDaftar Pesanan: ");
        for(int i=0; i<jmlPesanan;i++) {
            System.out.printf("- %s: Rp%.2f\n",namaPesanan[i],hargaPesanan[i]);
            totBiaya+=hargaPesanan[i];
        }
        System.out.printf("\nTotal Biaya pemesana: Rp%.2f", totBiaya);
    }   
}
