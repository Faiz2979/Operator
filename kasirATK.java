import java.util.Scanner;

public class kasirATK {
    public static void main(String[] args) {
        double bukutulis, pensil, penghapus, penggaris;
        bukutulis=2500;
        pensil=1000;
        penghapus=1500;
        penggaris=1000;
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.println ("Masukan Jumlah Beli Buku Tulis");
            double jumlahbuku= input.nextDouble();
            System.out.println ("Masukan Jumlah Beli Pensil");
            double jumlahpensil= input.nextDouble();
            System.out.println ("Masukan Jumlah Beli Penghapus");
            double jumlahpenghapus= input.nextDouble();
            System.out.println ("Masukan Jumlah Beli Penggaris");
            double jumlahpenggaris= input.nextDouble();
            double total= jumlahbuku*bukutulis+jumlahpensil*pensil+jumlahpenggaris*penggaris+jumlahpenghapus*penghapus;
            System.out.println("Masukan Pembayaran");
            double bayar= input.nextDouble();
            // boolean kurang= input.nextBoolean(bayar<total);
            // System.out.println("Maaf Uang Anda Tidak Cukup");
            double diskon=0.05*total;
            double kembali= bayar-(total-diskon);
            System.out.println ("Total Diskon:"+diskon);
            System.out.println ("Total Kembalian:"+kembali);
        }
    }
}
