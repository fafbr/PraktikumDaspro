package jobsheet6;
import java.util.Scanner;
public class CM1_10 {

        //konversi nilai angka ke huruf
    public static String konversiNilai(double nilaiAlgo) {
        if (nilaiAlgo >= 80) return "A";
        else if (nilaiAlgo >= 73) return "B+";
        else if (nilaiAlgo >= 65) return "B";
        else if (nilaiAlgo >= 60) return "C+";
        else if (nilaiAlgo >= 50) return "C";
        else if (nilaiAlgo >= 39) return "D";
        else return "E";
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input nama dan nim
        System.out.println("=== INPUT DATA MAHASISWA ===");
        System.out.println("Masukkan Nama Mahasiswa: ");
        String nama = sc.nextLine();
        System.out.println("Masukkan NIM Mahasiswa: ");
        String nim = sc.nextLine();
    
        //input nilai uts, uas, tugas Algoritma dan Pemrograman
        System.out.println("\n=== INPUT NILAI ALGORITMA DAN PEMROGRAMAN ===");
        System.out.println("Masukkan nilai UTS Algoritma dan Pemrograman: ");
        int uts1 = sc.nextInt();
        System.out.println("Masukkan nilai UAS Algoritma dan Pemrograman: ");
        int uas1 = sc.nextInt();
        System.out.println("Masukkan nilai Tugas Algoritma dan Pemrograman: ");
        int tugas1 = sc.nextInt();

        //input nilai  uts, uas, tugas Struktur Data
        System.out.println("\n=== INPUT NILAI STRUKTUR DATA ===");
        System.out.println("Masukkan nilai UTS Struktur Data: ");
        int uts2 = sc.nextInt();
        System.out.println("Masukkan nilai UAS Struktur Data: ");
        int uas2 = sc.nextInt();
        System.out.println("Masukkan nilai Tugas Struktur Data: ");
        int tugas2 = sc.nextInt();
        
        //Mencari nilai akhir matkul Algoritma
        double nilaiAlgo = (uts1 * 0.3) + (uas1 * 0.4) + (tugas1 * 0.3);
                String huruf1 = konversiNilai(nilaiAlgo);

        //Mencari nilai akhir matkul Struktur
        double nilaiStruktur = (uts2 * 0.3) + (uas2 * 0.4) + (tugas2 * 0.3);
                String huruf2  = konversiNilai(nilaiStruktur);

        //Status lulus permatkul
        String status1, status2;
        if (nilaiAlgo >=60) {
            status1 = "Lulus";
        } else {
            status1 = "Tidak Lulus";
        }

        if (nilaiStruktur >=60) {
            status2 = "Lulus";
        } else {
            status2 = "Tidak Lulus";
        }

        //Hasil Penilain Akademik
        System.out.println("\n\n===== HASIL PENILAIAN AKADEMIK =====");
        System.out.println("Nama: "+nama);
        System.out.println("NIM: "+nim);
        System.out.println("\n--- Mata Kuliah Algoritma ---");
        System.out.println("Nilai UTS: "+uts1+"|Nilai UAS: " +uas1+"|Nilai Tugas: "+tugas1+"|Nilai Akhir: "+nilaiAlgo+"|Nilai Huruf: "+huruf1+"|Status: "+status1);
        System.out.println("\n--- Mata Kuliah Struktur Data ---");
        System.out.println("Nilai UTS: "+ uts2+"|Nilai UAS: "+uas2+"|Nilai Tugas: "+tugas2+"|Nilai Akhir: "+nilaiStruktur+"|Nilai Huruf: "+huruf2+"|Status: "+status2);

        //Rata rata semester
         double rataRata = (nilaiAlgo + nilaiStruktur) / 2;

        //Status Kelulusan Semester
        String statusSemester;
        if (status1.equalsIgnoreCase("Lulus") && status2.equalsIgnoreCase("Lulus")) {
            if (rataRata >= 70) {
                statusSemester = "Lulus";
            } else {
                statusSemester = "Tidak Lulus (Rata-rata < 70)";
            }
        } else { 
            statusSemester = "Tidak Lulus (Rata-rata < 70)";
        }
       System.out.println("\n\n\nRata-rata Nilai Akhir : "+ rataRata);
       System.out.println("\nStatus Semester : "+statusSemester);
    }
}