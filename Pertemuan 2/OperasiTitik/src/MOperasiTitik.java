/**
 * File : MOperasiTitik.java 25/02/18
 * Penulis : Muhammad Akmal Iskandar
 * Deskripsi : Membuat Titik
 */
public class MOperasiTitik {
    public static void main(String[] args) {
        Titik t = new Titik(4.0, 4.0);
        OperasiTitik o = new OperasiTitik();
        System.out.println("Titik : (" + t.getAbsis() + "," + t.getOrdinat() + ")");
        o.refleksiSumbuX(t); // hasil ?
        System.out.println("Titik : (" + t.getAbsis() + "," + t.getOrdinat() + ")");
        o.refleksiSumbuY(t); // hasil ?
        System.out.println("Titik : (" + t.getAbsis() + "," + t.getOrdinat() + ")");

    }
}
