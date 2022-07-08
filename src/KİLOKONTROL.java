import java.util.Scanner;

public class KİLOKONTROL {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("kilonuzuzu giriniz = ");
        double kg= input.nextDouble();


        System.out.print("boyunuzu giriniz = ");
        int boy1= input.nextInt();
        System.out.print("yaşınızı giriniz = ");
        int yaş= input.nextInt();

        double kıtleIndeksi1= kg/(boy1*boy1);
        System.out.println("kıtleIndeksi1 = " + kıtleIndeksi1);


        if (kıtleIndeksi1 >  0.0025510926118626432){
            System.out.println("ŞİRİN BİR PATATES OLMAMAK İÇİN KİLO VERMENİZ LAZIM " + "yaş = "  +yaş);
        }else{
            System.out.println("KİLONUZ İDEAL  :) NOT: SAĞLIĞINIZ İÇİN KİLONUZU KORUYUNUZ " + "yaş = " + yaş);
        }
        // bu bir kilo kontrol projesidir.
    }
}
