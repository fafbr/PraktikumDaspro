import java.util.Scanner;

public class NilaiKelompok10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int i, j, nilai;
        float totalNilai, rataNilai;

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
            i++;
        }
        sc.close();
    }
}
