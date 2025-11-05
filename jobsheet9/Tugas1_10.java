import java.util.Scanner;
public class Tugas1_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totNilai = 0; 
        double rataNilai;
        
        System.out.print("Masukkan banyak nilai yang akan diinput: ");
        int n = sc.nextInt();
        int[] nilaiMhs = new int[n];
        
        for (int i=0;i<nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
            totNilai += nilaiMhs[i];
        }   
        rataNilai = totNilai/nilaiMhs.length;
        int nilaiTertinggi = nilaiMhs[0];
        int nilaiTerendah = nilaiMhs[0];
        for (int i=1; i<nilaiMhs.length; i++) {
            if (nilaiMhs[i]>nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i]<nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }
        }
        System.out.println("\n--- Hasil Pengolahan Nilai ---");
        System.out.println("Daftar Nilai Mahasiswa: ");
        for (int i=0; i<nilaiMhs.length;i++) {
            System.out.println("Mahasiswa ke-"+(i+1)+" : "+nilaiMhs[i]);
        }
        System.out.println("Rata-rata nilai: "+rataNilai);
        System.out.println("Nilai tertinggi: "+nilaiTertinggi);
        System.out.println("Nilai terendah : "+nilaiTerendah);
    }
}
