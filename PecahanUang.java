
import java.util.Scanner;

/**
 * PecahanUang
 */
public class PecahanUang {

    public static void main(String[] args) {
        int uang, ribuan100, ribuan50, ribuan20, ribuan10, ribuan5, ribuan2, ribuan1, perak500, perak200, perak100;
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Uang: ");
        uang = sc.nextInt();

        ribuan100 = uang/100000;
        uang = uang%100000;
        if (ribuan100 > 0) {
            System.out.println(ribuan100+" Lembar 100 Ribuan");
        }

        ribuan50 = uang/50000;
        uang = uang%50000;
        if (ribuan50 > 0) {
            System.out.println(ribuan50+" Lembar 50 Ribuan");
        }

        ribuan20 = uang/20000;
        uang = uang%20000;
        if (ribuan20 > 0) {
            System.out.println(ribuan20+" Lembar 20 Ribuan");
        }

        ribuan10 = uang/10000;
        uang = uang%10000;
        if (ribuan10 > 0) {
            System.out.println(ribuan10+" Lembar 10 Ribuan");
        }

        ribuan5 = uang/5000;
        uang = uang%5000;
        if (ribuan5 > 0) {
            System.out.println(ribuan5+" Lembar 5 Ribuan");
        }

        ribuan2 = uang/2000;
        uang = uang%2000;
        if (ribuan2 > 0) {
            System.out.println(ribuan2+" Lembar 2 Ribuan");
        }

        ribuan1 = uang/1000;
        uang = uang%1000;
        if (ribuan1 > 0) {
            System.out.println(ribuan1+" Lembar 1 Ribuan");
        }

        perak500 = uang/500;
        uang = uang%500;
        if (perak500 > 0) {
            System.out.println(perak500+" Perak 500");
        }

        perak200 = uang/200;
        uang = uang%200;
        if (perak200 > 0) {
            System.out.println(perak200+" Perak 200");
        }

        perak100 = uang/100;
        uang = uang%100;
        if (perak100 > 0) {
            System.out.println(perak100+" Perak 100");
        }
        
        sc.close();
        sc.close();
    }
}