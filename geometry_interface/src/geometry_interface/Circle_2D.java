package geometry_interface;

import java.util.Scanner;

/**
 *
 * @author puggioni.riccardo
 */
public class Circle_2D implements Circle_interface {
public static Scanner sc = new Scanner(System.in);
    double radio;

    @Override
    public double create_c() {
        System.out.println("inserisci il raggio del cerchio: ");
        radio = sc.nextDouble();
        return radio;
    }

    @Override
    public double peri_c(int a, int b) {
        double p2 = 6.28;
        double peri = radio * p2;
        System.out.println("il perimetro è: ");
        return peri;
    }

    @Override
    public double print_c() {
        System.out.println("il raggio del cerchio è: " + radio);
        return radio;
    }

}
