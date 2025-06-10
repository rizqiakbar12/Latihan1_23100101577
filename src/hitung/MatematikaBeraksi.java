package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika akbar = new Matematika(5,7);
        
        System.out.println("Hasil penjumlahan: "+akbar.setPenjumlahan());
        System.out.println("Hasil pengurangan: "+akbar.setPengurangan());
        System.out.println("Hasil perkalian: "+akbar.setPerkalian());
        System.out.println("Hasil pembagian: "+akbar.setPembagian());
    }
}
