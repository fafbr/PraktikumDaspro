import java.util.Scanner;

public class tugas2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan  nilai n(minimal 3): ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                boolean border = i==0 ||i==n - 1|| j ==0 || j== n-1;
                
                if (border) {
                    System.out.print(n+" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
