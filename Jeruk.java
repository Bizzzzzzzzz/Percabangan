
import java.util.Scanner;

/**
 * PecahanUang
 */
public class Jeruk {

    public static void main(String[] args) {
        int totalHarga, totalJeruk, jeruk5, jeruk2, jeruk1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Jeruk yang akan di beli: ");
        totalJeruk = sc.nextInt();
        
        jeruk5 = totalJeruk/5;
        jeruk5 = jeruk5*10000;
        totalJeruk = totalJeruk%5;
        
        jeruk2 = totalJeruk/2;
        jeruk2 = jeruk2*5000;
        totalJeruk = totalJeruk%2;
        
        jeruk1 = totalJeruk/1;
        jeruk1 = jeruk1*3000;
        totalJeruk = totalJeruk%1;
        
        totalHarga = jeruk5+jeruk2+jeruk1;
        
        System.out.println("Total Harga Jeruk yang dibeli adalah: "+totalHarga);
        
        sc.close();
        sc.close();
    }
}