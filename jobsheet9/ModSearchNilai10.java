import java.util.Scanner;
public class ModSearchNilai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int key;
        int hasil = -1;
        
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int n = sc.nextInt();
        int[] arrNilai = new int[n];

        for (int i=0; i<arrNilai.length;i++) {
            System.out.print("Masukkann nilai Mahasiswa ke-"+(i+1)+" : ");
            arrNilai[i] = sc.nextInt();
        }
        
        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = sc.nextInt();

        for (int i=0; i< arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i+1;
                break;
            }
        }

        System.out.println();
        if (hasil!=-1) {
            System.out.printf("Nilai %d ketemu, merupakan nilai Mahasiswa ke-%d",key,hasil);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
        System.out.println();
    }
}
