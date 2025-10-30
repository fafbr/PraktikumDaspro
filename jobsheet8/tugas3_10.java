import java.util.Scanner;
public class tugas3_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Jumlah cabang kafe: ");
        int cabang = sc.nextInt();

        int totalPelanggan = 0;
        int totalItem = 0;

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        for(int i=1; i<=cabang; i++) {
            System.out.print("\n--- Cabang "+i+" ---");
            System.out.print("\nJumlah pelanggan: ");
            int pelanggan=sc.nextInt();

            int itemCabang=0;

            for(int j=1; j<=pelanggan; j++) {
                System.out.print("- Pelanggan "+j+ " memesan beberapa item? ");
                int item = sc.nextInt();
                itemCabang += item;
            }
            System.out.println("\nCabang " +i+":");
            System.out.println("- Pelanggan: " +pelanggan+" orang"); 
            System.out.println("- Item terjual " +itemCabang);

            totalPelanggan += pelanggan;
            totalItem += itemCabang;
        }
        System.out.println("\nTotal seluruh Cabang: ");
        System.out.println("Pelanggan: "+totalPelanggan+" orang");
        System.out.println("Item terjual: " +totalItem+ " item");

        sc.close();
    }   
}