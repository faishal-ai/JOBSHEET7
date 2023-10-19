import java.util.Scanner;

public class WhileKelipatan09 {
    public static void main(String[] args) {
        int kelipatan, jumlah = 0 ,counter = 0, ratarata = 0;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Masukkan kelipatan (1-9) : ");
            kelipatan = scan.nextInt();
        }
        int i = 1;
        while (i <= 50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
                ratarata = jumlah / counter;
            }
            i++;
        }

        System.out.printf(" Banyaknya Bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf(" Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
        System.out.println(" Rata-rata bilangan kelipatan " + kelipatan + " dari 1 sampai 50 adalah " + ratarata);
    }
    
}



