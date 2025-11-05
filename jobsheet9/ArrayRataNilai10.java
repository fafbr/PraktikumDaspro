import java.util.Scanner;
public class ArrayRataNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;

        for (int i = 0; i<nilaiMhs.length; i++) {
            System.out.print("Masukkann nilai Mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] =sc.nextInt();
        }

        int jmlLulus = 0;
        for (int i=0; i<nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i]>70) {
                jmlLulus++;
            }
        }

        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+rata2);
        System.out.println("Jumlah mahasiswa yang Lulus = "+jmlLulus);
    }
}
