/**
 * File : MOperasiTitik.java 25/02/18
 * Penulis : Muhammad Akmal Iskandar
 * Deskripsi : Kelas yang berisi main dari OperasiTitik
 */
public class MOperasiTitik {
    public static void main(String[] args) {
        Titik t = new Titik(4.0, 4.0);
        OperasiTitik o = new OperasiTitik();

        System.out.println("Titik : (" + t.getAbsis() + "," + t.getOrdinat() + ")");

        o.refleksiX(t);
        System.out.println("\n Refleksi Terhadap Sumbu X");
        System.out.println("Titik : (" + t.getAbsis() + "," + t.getOrdinat() + ")");

        o.refleksiY(t);
        System.out.println("\n Refleksi Terhadap Sumbu Y");
        System.out.println("Titik : (" + t.getAbsis() + "," + t.getOrdinat() + ")");

    }
}
