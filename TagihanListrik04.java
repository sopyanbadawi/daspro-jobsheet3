import java.util.Scanner;

public class TagihanListrik04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tarifper_kwh = 1500;
        int batas_kwh = 500;

        System.out.print("Masukkan jumlah penggunaan listrik (kwh): ");
        int penggunaanKwh = input.nextInt();
        boolean melebihiBatas = penggunaanKwh > batas_kwh;

        int totalTagihan = penggunaanKwh * tarifper_kwh;

        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        System.out.println("Penggunaan listrik melebihi batas: " + melebihiBatas);

    }
}
