import java.util.Scanner;
public class dairealan {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        double pi=3.14,r,aci,hesabi;
        System.out.print("yaricapi giriniz.:");
        r= Input.nextDouble();
        System.out.print("Merkez aci ölçüsü giriniz.:");
        aci= Input.nextDouble();
        hesabi=(pi * (r*r) * aci) / 360;
        System.out.println("Merkez Açı ölçüsü.:"+hesabi);






    }
}
