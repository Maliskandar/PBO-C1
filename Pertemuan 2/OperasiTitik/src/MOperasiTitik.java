/**
 * File : MOperasiTitik.java 02/03/18
 * Penulis : Muhammad Akmal Iskandar
 * Deskripsi : Kelas yang berisi main dari OperasiTitik
 */
public class MOperasiTitik {
    public static void main(String[] args) {
        double a;
        Titik t = new Titik(a:4,o:4);
        OperasiTitik o = new OperasiTitik();
        o = new OperasiTitik();
        System.out.println("Titik : (" + t.getAbsis() + "," + t.getOrdinat() + ")");
        o.refleksiSumbuX(t); // hasil ?
        System.out.println("Titik : (" + t.getAbsis() + "," + t.getOrdinat() + ")");
        o.refleksiSumbuY(t); // hasil ?
        System.out.println("Titik : (" + t.getAbsis() + "," + t.getOrdinat() + ")");

    }
}
