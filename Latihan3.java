import java.util.Scanner;
public class Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String merk, kategori;
        int ukuran;
        double harga;

        System.out.print("Masukkan merk: ");
        merk = sc.nextLine();
        System.out.print("Masukkan kategori: ");
        kategori = sc.nextLine();
        System.out.print("Masukkan ukuran: ");
        ukuran = sc.nextInt();

        if (merk == "converse") {
            if (kategori == "slip on") {
                if (ukuran >= 36 && ukuran<= 40) {
                    harga = 800000;
                } 
            } else {
                harga = 1200000;
                System.out.println("Harga = " + harga);
            }
        } else if (merk == "sketcher") {
            if (kategori == "woman") {
                if (ukuran >=36 && ukuran<=41) {
                   harga = 1000000; 
                }
            } else {
                harga = 1800000;
                System.out.println("Harga = " + harga);
            }
        } else {
            if (kategori == "kids") {
                if (ukuran >=36 && ukuran<= 40) {
                    harga = 750000;
                }
            } else {
                harga = 1500000;
                System.out.println("Harga = " + harga);
            }
        }
        
    }
}
