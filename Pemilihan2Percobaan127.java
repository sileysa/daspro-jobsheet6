import java.util.Scanner;
public class Pemilihan2Percobaan127 {

    public static void main(String[] args) {
        Scanner input27 = new Scanner(System.in);
        int tahun;
        System.out.print("Masukkan tahun: ");
        tahun = input27.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 1000) != 0)
                System.out.println("Bukan Tahun Kabisat");
        } else 
            System.out.println("Tahun Kabisat");
            
    }
}