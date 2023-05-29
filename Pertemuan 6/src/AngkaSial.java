/**
 * File : AngkaSialException.java 30/05/2023
 * Penulis : Muhammad Akmal Iskandar
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
 */
class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena angka sial !!!");
    }
}
// Asersi 1

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial ");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati hati memasukkan angka !!!");
        }
    }
}
