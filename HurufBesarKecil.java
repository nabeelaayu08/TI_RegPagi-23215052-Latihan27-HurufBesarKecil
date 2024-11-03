package HurufBesarKecil;
/**
 *NAMA : NABE'ELA AYU NING TYAS ZAHRA
 * PRODI : TEKNIK INFORMATIKA
 * NIM       : 23215052
 * Deskripsi Program : Program ini digunakan untuk mengubah huruf menjadi besar dan kecil
 */
import java.util.Scanner;
public class HurufBesarKecil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Kalimat: ");
        String kalimat = input.nextLine();

    if (kalimat.isEmpty()) {
        System.out.println("Kalimat tidak boleh kosong!");
    } else {
        
        // Mengubah menjadi huruf besar
        String hurufBesar = kalimat.toUpperCase();

        // Mengubah menjadi huruf kecil
        String hurufKecil = kalimat.toLowerCase();

        System.out.println("\n====Hasil Formatting====");
        System.out.println("Huruf Besar : " + hurufBesar);
        System.out.println("Huruf Kecil : " + hurufKecil);        
    }
  }
}

