/*
 * File : Main.java 27/03/2023
 * Penulis : Muhammad Akmal Iskandar
 * Deskripsi : driver class untuk poligon dan MKubus
 * */

package org.main;

import org.bangundatar.*;
import org.bangunruang.*;


public class MKubus {
    public static void main(String[] args){
        BujurSangkar bujur = new BujurSangkar(4);
        Kubus kubus = new Kubus(bujur);
        System.out.println("Luas BujurSangkar : " + kubus.hitungLuasAlas());
        System.out.println("Volume BujurSangkar : " + kubus.hitungVolume());
    }
}

