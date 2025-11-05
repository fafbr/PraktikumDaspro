import java.util.Scanner;
public class ModifArrayRataNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mahasiswa: ");
        int n = sc.nextInt();

        int[] nilaiMhs = new int[n];
        double totalLulus = 0;
        double totalTidakLulus = 0;
        int jmlLulus = 0;
        int jmlTidakLulus = 0;

        for (int i = 0; i<nilaiMhs.length; i++) {
            System.out.print("Masukkann nilai Mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] =sc.nextInt();

            if (nilaiMhs[i]>70) {
                totalLulus += nilaiMhs[i];
                jmlLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jmlTidakLulus++;
            }
        }
        if (totalLulus>0) {
            double rataLulus = totalLulus/jmlLulus;
            System.out.println("Rata-rata nilai Lulus = "+rataLulus);
        }
        if (totalTidakLulus>0) {
            double rataTidakLulus = totalTidakLulus/jmlTidakLulus;
            System.out.println("Rata-rata nilai tidak Lulus ="+rataTidakLulus);
        }
    }
}
