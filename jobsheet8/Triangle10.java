import java.util.Scanner;

public class Triangle10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // System.out.print("Masukkan nilai n: ");
        // int N = sc.nextInt();
        // int i = 0;
        // while (i <= N) {
        //     int j = 0;
        //     while (j < i) {
        //         System.out.print("*");
        //         j++;
        //     }
        //     System.out.println();
        //     i++;
        // }
        // sc.close();

        int N = 5; // Jumlah baris tetap
        char huruf = 'a';
        int jumlahHuruf = 1;

        for (int i = 0; i < N; i++) {
            // Hitung spasi untuk rata tengah
            int spasi = N * 2 - jumlahHuruf;
            for (int s = 0; s < spasi / 2; s++) {
                System.out.print(" ");
            }

            // Cetak huruf
            for (int j = 0; j < jumlahHuruf && huruf <= 'z'; j++) {
                System.out.print(huruf);
                huruf++;
            }

            System.out.println();
            jumlahHuruf += 2; // Tambah 2 huruf setiap baris
        }

    }
}