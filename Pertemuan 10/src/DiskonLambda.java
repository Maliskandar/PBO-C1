/**
 * File : DiskonLambda.java 09/06/2023
 * Penulis : Muhammad Akmal Iskandar
 * Deskripsi : Ekspresi lambda dasar, digunakan untuk
 * menghitung diskon
 */

interface IDiskon{
    public double hitungDiskon(int harga);
}

public class DiskonLambda{
    public static void main(String args[]){
        IDiskon diskonMerdeka = new IDiskon(){
            public double hitungDiskon(int harga){
                return harga - (harga * 0.3);
            }
        };
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };
        System.out.println("Diskon Merdeka : "+diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran : "+diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa : "+diskonBiasa.hitungDiskon(45000));
    }
}

/**
 * Soal :
 * Compile dan jalankan kode tersebut ! Dapatkah anda membedakan antara bagamana
 * diskonLebaran dan diskonBiasa diimplementasikan ?
 *
 * Jawaban :
 * diskonLebaran diimplementasikan menggunakan ekspresi lambda dengan sintaks singkat. 
 * Sintaks (harga) -> harga - (harga * 0.4) menunjukkan bahwa fungsi hitungDiskon 
 * menerima argumen harga dan mengembalikan hasil pengurangan harga dengan diskon 
 * sebesar 40% (harga * 0.4).
 * Di sisi lain, diskonBiasa juga diimplementasikan menggunakan ekspresi lambda, 
 * tetapi dengan sintaks yang sedikit berbeda. Sintaks (harga) -> 
 * { return harga - (harga * 0.1); } menunjukkan bahwa fungsi hitungDiskon juga 
 * menerima argumen harga, tetapi menggunakan blok kode yang lebih panjang dengan 
 * pernyataan return yang eksplisit untuk mengembalikan hasil pengurangan harga 
 * dengan diskon sebesar 10% (harga * 0.1).
 */