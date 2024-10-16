
import java.util.Scanner;

public class Ganjil_Genap {
    public static void main(String[] args) {
        Integer angka;
        String jenis;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan Angka: ");
        angka = sc.nextInt();
        
        if (angka % 2 == 0) {
            jenis = "Genap";
        } else {
            jenis = "Ganjil";
        }

        System.out.println(angka+" termasuk bilangan "+jenis);

        sc.close();
        sc.close();
    }
}