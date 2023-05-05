package Tugas;

class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama : " + nama + "Gaji pokok : " + gajiPokok);
    }
}

class Manager extends Pegawai {
    private int tunjangan =  7000000;

    public Manager(String nama) {
        setNama(nama);
        this.tunjangan = tunjangan;

    }
    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }

}

class Progammer extends Pegawai {
    private int bonus = 4500000;
    public Progammer(String nama) {
        setNama(nama);
        this.bonus = bonus;
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}

class Payroll extends Pegawai {
    public void cetakGaji(Pegawai P) {
        P.tampilData();
    }
}

public class PegawaiDanGaji {
    public static void main(String[] args) {
        Pegawai pegawai = new Progammer("Mira");
        Pegawai pegawai2 = new Manager("Joko");
        Pegawai pegawai3 = new Manager("Argo");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}
