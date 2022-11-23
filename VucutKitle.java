import java.util.Scanner;
public class VucutKitle {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        double boy,durum;
        int kg;
        System.out.println("Boyunuzu giriniz.:");
        boy= Input.nextDouble();
        System.out.println("Kilonuzu giriniz.:");
        kg= Input.nextInt();
        durum=kg/(boy*boy);
        System.out.println("Vücut Kitle indeksiniz.:"+durum);


    }
}
