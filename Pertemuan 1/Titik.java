/**
     * File : Titik.java 25/02/18
     * Penulis : Muhammad Akmal Iskandar
     * Deskripsi : Membuat Titik
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