import java.util.Scanner;

public class FaktorialMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Faktorial[] fk = new Faktorial[elemen];
        for(int i=0; i<elemen; i++){
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai Data ke-"+(i+1)+": ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("Hasil Faktorial dengan Brute Force");
        for(int i=0; i<elemen; i++){
            System.out.println("Faktorial dari nilai" + fk[i].nilai+ " adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.print("Waktu Eksekusi Brute Force = ");
        System.out.println(System.currentTimeMillis());

        System.out.println("Hasil Faktorial dengan Devide Conquer");
        for(int i=0; i<elemen; i++){
            System.out.println("Faktorial dari nilai" + fk[i].nilai+ " adalah : " + fk[i].faktorialDC(fk[i].nilai));
    }
    System.out.print("Waktu Eksekusi Divide Conquer = ");
    System.out.println(System.currentTimeMillis());
    
    System.out.println(" ");
}
}