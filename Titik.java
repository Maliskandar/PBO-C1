/**
     * File : Titik.java 25/02/18
     * Penulis : Muhammad Akmal Iskandar
     * Deskripsi : Membuat Titik
     */
    class Titik{
        // Atribut
        double absis;
        double ordinat;
        static int counterTitik;
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
        void setAbsis(double a){
            absis = a;
        }
        void setOrdinat(double o){
            ordinat = o;
        }
        double getAbsis(){
            return absis;
        }
        double getOrdinat(){
            return ordinat;
        }
        int getCounterTitik(){
            return counterTitik;
        }
    }