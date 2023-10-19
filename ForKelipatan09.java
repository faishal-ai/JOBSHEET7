import java.util.Scanner;

public class ForKelipatan09{
public static void main(String[] args) {
        int kelipatan, jumlah = 0 ,counter = 0;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Masukkan kelipatan (1-9) : ");
            kelipatan = scan.nextInt();
        }
        for (int i = 1; i <= 50 ; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
                
            }
        }
        System.out.printf(" Banyaknya Bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf(" Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);

        
    }
}

