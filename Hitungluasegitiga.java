package pertemuan5;

/**
 *
 * @author Lab E
 * tgl : 2024-04-26
 */
public class Hitungluasegitiga {
    double Alas, Tinggi, Luas;
    
    void SetAlas(double Nilai){
        Alas = Nilai;
    }
    void SetTinggi(double Nilai){
        Tinggi = Nilai;
    }
    double GetAlas(){
        return Alas;
    }
    double GetTinggi(){
        return Tinggi;
    }
    double Hitungluasegitiga(){
        double hsl =(Alas*Tinggi) / 2;
        
        return hsl;
    }
    void TampilHasil(){
        System.out.println("Hitung Luas Segitiga");
        System.out.println("~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nilai Alas : "+Alas);
        System.out.println("Nilai Tinggi : "+Tinggi);
        System.out.println("Nilai Luas : ");
        System.out.println("Luas = Alas*Tinggi/2");
        System.out.println("     = "+Alas+"*"+Tinggi+"/2");
        System.out.println("     = "+Luas);
        System.out.println("");
    }
}
