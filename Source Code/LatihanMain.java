import java.util.Scanner;
public class LatihanMain {
    public static void main(String[] args) { 
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        Latihan vote = new Latihan(); 
        System.out.print("Masukkan Jumlah Kandidat: "); 
        vote.jumlah = sc.nextInt();
        
        int pilih[] = new int[vote.jumlah]; 
        String Kandidat = "";
        System.out.println("========================================");
        System.out.println(" PEMILIHAN KETUA BEM "); 
        System.out.println("========================================");
        System.out.println("---- KANDIDAT ----");
        System.out.println("1. Haris"); 
        System.out.println("2. Dian"); 
        System.out.println("3. Rani"); 
        System.out.println("4. Bisma"); 
        
        for(int i = 0; i < vote.jumlah ; ++i){
            System.out.print("Pilih salah satu Kandidat : "); 
            pilih[i] = sc.nextInt();
        }
        System.out.println("");
        
        int suara = vote.votingPemilihan(pilih, 0, vote.jumlah); 
        if(suara == 1)
        {
            vote.Kandidat = "Haris";
        } else if(suara == 2)
        {
            vote.Kandidat = "Dian";
        } else if(suara == 3)
        {
            vote.Kandidat = "Rani";
        } else if (suara == 4)
        {
            vote.Kandidat = "Bisma";

        } else
        {
            System.out.println("Pilihan yang anda masukkan tidak tersedia");
        }

        System.out.println("==========================================================================================");
        System.out.println("Kandidat yang memiliki mayoritas suara adalah " + vote.Kandidat + " dengan nomor " + suara);
        System.out.println("==========================================================================================");
    }
}
