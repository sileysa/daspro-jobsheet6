import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jenisBuku;
        int jumlahBuku;
        double diskon, harga, totalBayar;

        System.out.print("Masukkan Jenis Buku: ");
        jenisBuku = sc.nextLine();
        System.out.print("Masukkan Jumlah Buku: ");
        jumlahBuku = sc.nextInt();

        if (jenisBuku == "kamus") {
            harga = 30000;
            if (jumlahBuku > 2) {
                diskon = 0.12;
            } else {
                diskon = 0.1;
            }
            totalBayar = harga - (diskon * harga);
            System.out.println("Total Bayar = " + totalBayar);
        } else if (jenisBuku == "Novel") {
            harga = 20000;
            diskon = 0.07;
            if (jumlahBuku > 3) {
                diskon = diskon + 0.02;                
            } else {
                diskon = diskon + 0.01;
            }
            totalBayar = harga - (diskon * harga);
            System.out.println("Total Bayar = " + totalBayar);
        } else {
            harga = 15000;
            if (jumlahBuku > 3) {
                diskon = 0.05;
                totalBayar = harga - (diskon * harga);
                System.out.println("Total Bayar = " + totalBayar);
            } else {
                System.out.println("Tidak mendapatkan diskon");
            }   
        }
    }
}
