/*
 * File : Main.java 31/03/2023
 * Penulis : Muhammad Akmal Iskandar
 * Deskripsi : kelas yang berisi abstraksi bangun datar
 * */

public abstract class BangunDatar{
    protected double luas;
    public abstract double hitungLuas(double sisi);
    protected void setLuas(double Luas){
        this.luas = Luas;
    }
    public double getLuas(){
        return luas;
    }
}