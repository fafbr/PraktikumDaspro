import java.util.Scanner;
public class Kubus10 {
    public static int hitungVolume(int sisi) {
        return sisi*sisi*sisi;
    }

    public static int hitungLuasPermukaanKubus(int sisi) {
        return 6*sisi*sisi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus (cm): ");
        int sisi = sc.nextInt();

        int volume = hitungVolume(sisi);
        int luasPermukaan = hitungLuasPermukaanKubus(sisi);

        System.out.println("Kubus dengan panajang sisi "+sisi+(" cm"));
        System.out.println("Volume  kubus = "+volume);
        System.out.println("Luas permukaan kubus = "+luasPermukaan);
    }
}