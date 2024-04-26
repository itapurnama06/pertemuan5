package pertemuan5;

/**
 *
 * @author Lab E
 * tgl : 2024-04-26
 */
public class Pertemuan5 {
    aritmatika Amatik = new aritmatika();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       aritmatika Amatik = new aritmatika();
       int hsltambah = 0;
       
       hsltambah = Amatik.tambah(3, 5);
       System.out.println("hasil: "+hsltambah);
       
       Hitungluasegitiga HSL3 = new Hitungluasegitiga();
       HSL3.SetAlas(5);
       HSL3.SetTinggi(8);
       double hsl = HSL3.Hitungluasegitiga();
       HSL3.TampilHasil();
    }
    
}
