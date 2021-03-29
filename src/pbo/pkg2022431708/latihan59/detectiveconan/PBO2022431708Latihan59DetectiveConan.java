/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg2022431708.latihan59.detectiveconan;

/**
 *
 * @author HP
 */
  /**
     * @param args the command line arguments
     */
        /**
     * @param args the command line arguments
     */
       /**
 *
 * @author
 * Nama : Fadly Hadi Wijaya
 * Nim : 2022431708
 * Kelas : PBO - FS112B
 * Deskripsi Program : Program ini berisi Program untuk Menampilkan Detektif kinan
 *
 */
public class PBO2022431708Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("Tokoh Utama");
        PemeranUtama conan = new PemeranUtama("Conan Edogawa/Shinichi Kudo", "Detektif", "Menyelesaikan Kasus", "Detektif cilik");
        conan.tampilPemeranUtama();

        System.out.println("Tokoh Pendukung");

        TokohPendukung eri = new TokohPendukung("Eri Kisaki", "Pengacara",
                "Istri dari Kogoro Mouri dan Ibunya Ran");
        eri.tampilTokohPendukung();

    }

}
