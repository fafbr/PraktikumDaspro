import java.util.Scanner;

public class NilaiKelompok10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i, j, nilai;
        float totalNilai, rataNilai;
        
        //modifikasi nilai rata rata tertinggi
        float maxRata =0;
        int kelompokMax =0;

        i=1;
        while (i <= 6) {
            System.out.println("\nKelompok "+i);

            totalNilai = 0;
            for(j=1; j<=5; j++) {
                System.out.print("Nilai dari kelompok penilai "+j+": ");
                nilai = sc.nextInt();
                totalNilai += nilai; 
            }

            rataNilai = totalNilai / 5; 
            System.out.printf("Kelompok %d: Nilai rata-rata = %.1f%n",i,rataNilai);

            //Cek apakah ini nilai tertinggi
            if (rataNilai > maxRata) {
                maxRata = rataNilai;
                kelompokMax = i;
            }
            i++;
        }
        //menampilkan hasil akhir
        System.out.println("\n=== Hasil Akhir ===");
        System.out.printf("Kelompok dengan nilai rata rata tertinggi: %d (%.1f)%n",kelompokMax, maxRata);
        sc.close();
    }
}
