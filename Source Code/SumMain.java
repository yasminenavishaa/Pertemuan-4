import java.util.Scanner;

public class SumMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================================================");
        System.out.println("Program menghitung keuntungan total (satuan juta. misal 5.9)");
        System.out.print("Masukkan banyaknya perusahaan : ");

        int elm = sc.nextInt();
        Sum[] sm = new Sum[elm];

        for (int i=0;i<sm.length;i++){
            System.out.printf("Masukkan jumlah bulan untuk perusahaan ke-%d : ", (i+1));
            sm[i] = new Sum(sc.nextInt());
            System.out.println("============================================");

            for (int j=0; j<sm[i].elemen; j++){
                System.out.print("Masukkan untung bulan ke-%d : " + (j+1) + " = ");
                sm[i].keuntungan[j] = sc.nextDouble();
            }
            System.out.println();
        }
        for (int i=0; i<sm.length; i++){
            System.out.println("=====================================");
            System.out.println("Perusahaan Ke-" + (i+1));
            System.out.println("Algoritma Brute Force");
            System.out.printf("Total keutungan perusahaan selama %d bulan adalah %.2f\n ", sm[i].elemen, sm[i].totalBF(sm[i].keuntungan));
            System.out.println("Algoritma Divide Conqueror");
            System.out.printf("Total keutungan perusahaan selama %d bulan adalah %.2f\n ", sm[i].elemen, sm[i].totalDC(sm[i].keuntungan, 0, sm[i].elemen - 1));
        }
        
    }
}