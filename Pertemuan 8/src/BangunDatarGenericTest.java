// BangunDatar
abstract class BangunDatar {
    public abstract double hitungKeliling();
}

// BangunDatarGeneric
class BangunDatarGeneric <T1 extends BangunDatar>{
    private T1 bangunDatar;

    public void set(T1 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }

    public T1 get(){
        return bangunDatar;
    }

    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}

// Lingkaran
class Lingkaran extends BangunDatar {
    private final double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungKeliling(){
        return 2 * jejari * 3.14;
    }
}

// Segitiga
class Segitiga extends BangunDatar {
    private final double alas;

    public Segitiga(double alas) {
        this.alas = alas;
    }

    @Override
    public double hitungKeliling() {
        // Implement the logic to calculate the perimeter of a triangle
        // Perimeter = sum of all sides
        // For simplicity, let's assume it's an equilateral triangle
        return 3 * alas;
    }
}

/*
 * File : BangunDatarGenericTest.java
 * Deskripsi : main class untuk Generic BangunDatar
 */
public class BangunDatarGenericTest {

    public static void main(String[] args){
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("keliling lingkaran : " +bdg.hitungKeliling());
        System.out.println("tipe generic : " +bdg.get().getClass().getName());

        Segitiga stg = new Segitiga(4);
        BangunDatarGeneric<Segitiga> bdgSegitiga = new BangunDatarGeneric<Segitiga>();
        bdgSegitiga.set(stg);
        System.out.println("Keliling Segitiga : " +bdgSegitiga.hitungKeliling());
        System.out.println("tipe generic : " +bdgSegitiga.get().getClass().getName());
    }
}