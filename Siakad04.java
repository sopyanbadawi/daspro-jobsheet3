import java.util.Scanner;

public class Siakad04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextInt();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextInt();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextInt();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextInt();

        nilaiAkhir = (nilaiKuis*0.20) + (nilaiTugas*0.15) + (nilaiUTS*0.30) + (nilaiUAS*0.35);
        System.out.println("Mahasiswa dengan nama " + nama + " (NIM): " + nim + " Kelas: " + kelas + " No. Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        

    }
}
