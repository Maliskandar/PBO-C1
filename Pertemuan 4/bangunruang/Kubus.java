/*
 * File : Kubus.java 27/03/2023
 * Penulis : Muhammad Akmal Iskandar
 * Deskripsi : driver class untuk bangundatar dan Kubus
 * */

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus{
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan){
        this.permukaan = permukaan;
    }

    public double hitungLuasAlas(){
        return this.permukaan.hitungLuas();
    }

    public double hitungVolume(){
        return this.hitungLuasAlas() * this.permukaan.getPanjangSisi();
    }
}
