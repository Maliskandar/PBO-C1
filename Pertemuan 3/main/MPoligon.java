/*
* File : MPoligon.java 08/03/2023
* Penulis : Muhammad Akmal Iskandar
* Deskripsi : driver class untuk poligon dan persegi panjang
* */

package org.main;
import org.bangundatar.*;
public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());

        SegiTiga segiTiga = new SegiTiga(10, 10, 15);
        segiTiga.printInfo();
        System.out.println("Luas Segi Tiga : " + segiTiga.hitungLuas());
    }
}
