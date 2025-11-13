import java.util.Scanner;
public class Tugas1_SurveiKepuasan {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int jmlResponden = 10;
        int jmlPertanyaan = 6;
        int[][] hasilSurvei = new int[jmlResponden][jmlPertanyaan];

        //input data survei
        for(int i=0; i<jmlResponden; i++) {
            System.out.println("\nResponden ke-"+(i+1)+": ");
            
            for(int j=0; j<jmlPertanyaan;j++) {
                System.out.print("Nilai untuk pertanyaan ke-"+(j+1)+" (1-5): ");
                hasilSurvei[i][j] = sc.nextInt();
            }
        }

        //rata-rata per responden
        System.out.println("\nRata-rata per responden:");
        for(int i=0; i<jmlResponden; i++) {
            double total = 0;
            for(int j=0; j<jmlPertanyaan; j++) {
                total += hasilSurvei[i][j];
            }
            double rata=total/jmlPertanyaan;
            System.out.println("Responden ke-"+(i+1)+": "+rata);
        }

        //rata rata per pertanyaan
        System.out.println("\nRata-rata per pertanyaan:");
        for(int j=0; j<jmlPertanyaan; j++) {
            double total = 0;
            for(int i=0; i<jmlResponden; i++) {
                total += hasilSurvei[i][j];
            }
            double rata = total / jmlResponden;
            System.out.println("Pertanyaan ke-"+(j+1)+": "+rata);
        }

        // rata rata keseluruhan
        double totalKeseluruhan = 0;
        for (int i=0; i<jmlResponden; i++) {
            for (int j=0; j<jmlPertanyaan; j++) {
                totalKeseluruhan += hasilSurvei[i][j];
            }
        }

        double rataKeseluruhan = totalKeseluruhan / (jmlResponden * jmlPertanyaan);
        System.out.println("\n Rata-rata keeseluruhan: "+rataKeseluruhan);
    }
}
