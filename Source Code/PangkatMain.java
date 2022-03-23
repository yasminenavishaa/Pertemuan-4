import java.util.Scanner;

public class PangkatMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================================================================");
        System.out.print("Masukkan Jumlah Elemen yang Ingin Dihitung: ");
        int elemen = sc.nextInt();

        Pangkat [] png = new Pangkat[elemen];
        for(int i = 0; i < elemen; i++){
            png[i] = new Pangkat(i, i);
            System.out.print("Masukkan Nilai yang akan Dipangkatkan ke-"+(i+1)+" : ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan Nilai Pemangkat ke-"+(i+1)+" : ");
            png[i].pangkat = sc.nextInt();
        }
        System.out.println("===========================================================================");
        System.out.println("Pilih metode untuk menjalankan program ini (1. Brute Force, 2. Divide Conquer) ");
        int Pilih = sc.nextInt();
        if (Pilih == 1){
            System.out.println("Hasil Pangkat dengan Brute Force");
            for (int i = 0; i < elemen; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatBF(png[i].nilai,png[i].pangkat));
        } System.out.println("===========================================================================");
        } 
        else{
            System.out.println("Hasil Pangkat dengan Divide and Conquer");
            for (int i = 0; i < elemen; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+png[i].pangkat+" adalah : "+png[i].pangkatDC(png[i].nilai,png[i].pangkat));
        }
        }
    }
}