import java.util.Scanner;

public class java {

    public static void main(String[] args) {
        Scanner inpiut = new Scanner(System.in);
        String nama, kelas, absen;
        double jumlahRekening, apel, jeruk, hargaApel, hargaJeruk, pembelian;
        System.out.print("NAMA :");
        nama = inpiut.nextLine();
        System.out.print("KELAS :");
        kelas = inpiut.nextLine();
        System.out.print("ABSEN :");
        absen = inpiut.nextLine();
        jumlahRekening = 10000000.0;
        hargaApel = 9000.0;
        hargaJeruk = 80000.0;
        System.out.print("Jumlah pembelian apel :");
        apel = inpiut.nextDouble();
        System.out.print("Jumlah pembelian jeruk :");
        jeruk = inpiut.nextDouble();
        pembelian = (apel * hargaApel) + (jeruk * hargaJeruk);
        int myInt = (int) pembelian;
        int rek = (int) jumlahRekening;
        int sisaRekening = rek - myInt;
        System.out.println("NAMA    :" + nama);
        System.out.println("KELAS   :" + kelas);
        System.out.println("ABSEN   :" + absen);
        System.out.println("TOTAL HARGA :" + myInt);
        System.out.println("SISA REKENING   :" + nama + "ADALAH :" + sisaRekening);
    }
}