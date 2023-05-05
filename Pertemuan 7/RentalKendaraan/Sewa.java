package Sewa;
class Vehicle {
    void calRent(int distance, float price) {
        float fare = distance * price;
        System.out.println("vehicle price = " + fare);
    }
}

class Bus extends Vehicle {
}

class Car extends Vehicle {

    void calRent(int distance, float price) {
        float fare = distance * price;
        //diskon
        fare = fare - 1000.00f;
        System.out.println("harga sewa mobil = " + fare);
    }
}

public class Sewa {
    public static void main(String[] args) {
        Vehicle kendaraan = new Vehicle();
        Vehicle mobil = new Car();
        Vehicle bis = new Bus();
        kendaraan.calRent(50, 1000);
        mobil.calRent(50,1000);
        bis.calRent(50, 1000);
    }
}
