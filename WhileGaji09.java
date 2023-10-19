import java.util.Scanner;

public class WhileGaji09 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int jumlahKaryawan, jumlahJamLembur;
            double gajiLembur = 0, totalGajiLembur = 0;
            String jabatan;

            System.out.println(
                "=========================================\n" +
                "Program Menghitung Gaji Karyawan\n" +
                "=========================================\n"
            );
            System.out.print ("Masukkan Jumlah Karyawan : ");
            jumlahKaryawan = scan.nextInt();

            int i = 0 ;
            while (i < jumlahKaryawan) {
                System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
                System.out.print("Masukan Jabatan Karyawan ke-" + (i+1) + " : ");
                jabatan = scan.next();
                System.out.print("Masukkan Jumlah Jam Lembur : ");
                jumlahJamLembur = scan.nextInt();
                i++;
               if (jabatan.equalsIgnoreCase("Direktur")){
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")){
                gajiLembur = jumlahJamLembur * 100000;
            } else if (jabatan.equalsIgnoreCase("Karyawan")){
                gajiLembur = jumlahJamLembur * 75000;
            } else {
                System.out.println("Jabatan Invalid");
			--i;
            }

                totalGajiLembur += gajiLembur;
            }

            System.out.println("Total Gaji Lembur : " + totalGajiLembur);
        }
    }
}