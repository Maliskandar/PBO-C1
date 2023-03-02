class MTitik{
         public static void main(String[] args){
             Titik t1 = new Titik();
             Titik t2 = new Titik();

             t1.setAbsis(1.0);
             t1.setOrdinat(2.0);
             t2.setAbsis(3.0);
             t2.setOrdinat(4.0);

             System.out.println("Absis dari t1 adalah = " + t1.getAbsis());
             System.out.println("Ordinat dari t1 adalah = " + t1.getOrdinat());
             System.out.println("Jumlah objek titik adalah = " + t1.getCounterTitik());

             System.out.println("Absis dari t1 adalah = " + t2.getAbsis());
             System.out.println("Ordinat dari t1 adalah = " + t2.getOrdinat());
             System.out.println("Jumlah objek titik adalah = " + t2.getCounterTitik());

         }
 }