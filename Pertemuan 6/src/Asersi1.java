/**
 * File : Asersi1.java 30/05/2023
 * Penulis : Muhammad Akmal Iskandar
 * Deskripsi : Program untuk menunjukkan asersi
 */
class Asersi1{
    public static void  main(String[] args) {
        int x = 0;
        if(x > 0){
            System.out.println("x bilngan positif");
        }
        else{
            assert(x < 0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
