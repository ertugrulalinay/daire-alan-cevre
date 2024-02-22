import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yarıçapı (r) giriniz: ");
        double r = inp.nextDouble();

        System.out.print("Merkez açısının ölçüsü (𝛼) giriniz: ");
        double alpha = inp.nextDouble();

        // Dereceyi radyana çevirme
        double alphaRad = Math.toRadians(alpha);

        // Daire diliminin alanını hesaplama
        double alan = (pi * (r * r) * alphaRad) / 360;

        System.out.println("Daire diliminin alanı: " + alan);
    }
}
