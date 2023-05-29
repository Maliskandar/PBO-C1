/**
 * File : ExceptionOnArray.java 30/05/2023
 * Penulis : Muhammad Akmal Iskandar
 * Deskripsi : Program penggunaan eksepsi menggunakan class library java
 */
public class ExceptionOnArray {
    public static void main(String[] args){
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        finally{
            System.out.println("clean up code ...");
        }
    }
}
