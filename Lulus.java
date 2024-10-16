import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        
        int nilaiTest;
        String apakahLulus;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Nilai : ");
        nilaiTest = sc.nextInt();

        if (nilaiTest > 75) {
            apakahLulus = "Lulus";
        }
        else {apakahLulus = "Tidak Lulus";}
         
        System.out.println("Anda "+apakahLulus);
         
         sc.close();
         sc.close();
    }
}
