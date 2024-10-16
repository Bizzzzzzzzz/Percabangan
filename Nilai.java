
import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        
        int nilaiTest;
        String nilai, apakahLulus;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Nilai : ");
        nilaiTest = sc.nextInt();

        if (nilaiTest > 85) {
            nilai = "A";
        }
        else if (nilaiTest > 75) {
            nilai = "B";
        }
        else if (nilaiTest > 65) {
            nilai = "C";
        }
        else if (nilaiTest > 55) {
            nilai = "D";
        }
        else {nilai = "E";}

        if (nilaiTest > 75) {
            apakahLulus = "Lulus";
        }
        else {apakahLulus = "Tidak Lulus";}
         
        System.out.println("Nilai Adalah : "+nilaiTest);
        System.out.println("Grade = "+nilai);
        System.out.println("Anda "+apakahLulus);
         
         sc.close();
         sc.close();
    }
}
