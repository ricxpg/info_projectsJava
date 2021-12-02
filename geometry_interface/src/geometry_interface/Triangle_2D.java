package geometry_interface;

import java.util.Scanner;

/**
 *
 * @author puggioni.riccardo
 */
public class Triangle_2D {

    int a, b, c;
    static Scanner sc = new Scanner(System.in);

    public Triangle_2D(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void create_t() {
        System.out.println("inserisci i lati del tuo triangolo: (max 3)");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
    }

    void edit_t() {
        int iff = 0;
        System.out.println("che lato del triangolo vuoi cambiare? max 3");
        iff = sc.nextInt();
        if (iff == 1) {
            System.out.println("inserisci il nuovo valore: ");
            a = sc.nextInt();
        } else {
            if (iff == 2) {
                System.out.println("inserisci il nuovo valore: ");
                b = sc.nextInt();
            } else {
                if (iff == 3) {
                    System.out.println("inserisci il nuovo valore: ");
                    c = sc.nextInt();
                }
            }
        }
    }

    void peri_t() {
        int peri = a + b + c;
        System.out.println("il perimetro è: " + peri);
    }

    void print_t() {
        System.out.println("lato 1: " + a);
        System.out.println("lato 2: " + b);
        System.out.println("lato 3: " + c);
    }

    
}
