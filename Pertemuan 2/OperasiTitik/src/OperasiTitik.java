/**
 * File : Titik.java 25/02/18
 * Penulis : Muhammad Akmal Iskandar
 * Deskripsi : Membuat OperasiTitik
 */
class Titik{
    // Atribut
    private double absis;
    private double ordinat;
    private static int counterTitik;
    Titik(double a, double o){
        counterTitik++;
        double absis = a;
        double ordinat = o;
    }
    Titik(){
        counterTitik++;
        absis = 0;
        ordinat = 0;
    }

    // Method
    public void setAbsis(double a){
        absis = a;
    }
    public void setOrdinat(double o){
        ordinat = o;
    }
    public double getAbsis(){
        return absis;
    }
    public double getOrdinat(){
        return ordinat;
    }
    public int getCounterTitik(){
        return counterTitik;
    }
}
public class OperasiTitik {
    public void refleksiSumbuX(Titik titik){
        double y;
        y = titik.getOrdinat();
        y *= -1;
        titik.setOrdinat(y);
    }
    public void refleksiSumbuY(Titik titik){
        titik.setAbsis(-titik.getAbsis());
    }
    public Titik refleksiX(Titik titik){
        refleksiSumbuX(titik);
        return titik;
    }

    public Titik refleksiY(Titik titik){
        refleksiSumbuY(titik);
        return titik;
    }
}
