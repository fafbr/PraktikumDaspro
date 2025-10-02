import java.util.Scanner;

public class sistemWifiKampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

    System.out.print("Masukkan jenis pengguna (dosen/mahasiswa/lainnya): ");
        String jenisPengguna = sc.nextLine().trim().toLowerCase();

        if (jenisPengguna.equals("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen)");
        } else {
            if (jenisPengguna.equals("mahasiswa")) {
                System.out.print("Masukkan jumlah SKS yang diambil: ");
                int jumlahSKS = sc.nextInt();

                if (jumlahSKS > 12) {
                    System.out.println("Akses WiFi diberikan (mahasiswa aktif)");
                } else {
                    System.out.println("Akses ditolak, SKS kurang dari 12");
                }
            } else {
                System.out.println("Akses ditolak");
            }
        }
        sc.close();
    }
}
