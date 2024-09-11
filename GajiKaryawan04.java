import java.util.Scanner;

public class GajiKaryawan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double bonus = 0.10, pajak = 0.05, jamkerja, upahperJam, gajiSebelumPajak, totalGajiSebelumPajak, gajiBersih;


        System.out.print("Jumlah jam kerja: ");
        jamkerja = input.nextDouble();
        System.out.print("Masukkan upah per jam kerja: ");
        upahperJam = input.nextDouble();

        gajiSebelumPajak = jamkerja*upahperJam;
        bonus = gajiSebelumPajak*bonus;
        totalGajiSebelumPajak = gajiSebelumPajak + bonus;
        pajak = totalGajiSebelumPajak*pajak;
        gajiBersih = totalGajiSebelumPajak - pajak;

        System.out.println("Gaji sebelum pajak: " + gajiSebelumPajak);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total gaji sebelum pajak: " + totalGajiSebelumPajak);
        System.out.println("Biaya pajak yang dikenakan: " + pajak);
        System.out.println("Gaji yang diterima: " + gajiBersih);


    }
}
