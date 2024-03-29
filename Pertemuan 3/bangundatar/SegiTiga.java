
/*
* File : SegiTiga.java 08/03/2023
* Penulis : Muhammad Akmal Iskandar
* Deskripsi : representasi dasar dari objek poligon (segi banyak)
* */
package org.bangundatar;

import org.poligon.*;
public class SegiTiga extends Poligon {
    private double alas, tinggi;

    public SegiTiga(double alas,double tinggi, int jumlahSisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas() {
        return 0.5*alas*tinggi;
    }

    public void printInfo(){
        System.out.println("Segitiga Bersisi " + this.getJumlahSisi());
    }

}
