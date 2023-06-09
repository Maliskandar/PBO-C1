/**
 * File : LambdaMap.java 09/06/2023
 * Penulis : Muhammad Akmal Iskandar
 * Deskripsi : Program yang digunakan untuk menampilkan 
 * key dan value dari sebuah Map
 */

import java.util.HashMap;
import java.util.Map;

public class LambdaMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121140123", "Kurniawan");
        mahasiswaMap.put("24060121130134", "Asep");
        mahasiswaMap.put("24060121120090", "Udin");

        mahasiswaMap.forEach((nim, nama) -> System.out.println(nim + " : " + nama));
    }
}