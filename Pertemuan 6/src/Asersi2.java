/**
 * File : Asersi2.java 30/05/2023
 * Penulis : Muhammad Akmal Iskandar
 * Deskripsi : Program untuk demo asersi, yang akan menolak input
 * jari jari lingkaran bernilai nol
 */
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main (String[] args){
        double jariJari = 0;
        assert(jariJari>0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}
