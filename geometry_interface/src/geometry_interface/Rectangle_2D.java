package geometry_interface;

/**
 *
 * @author puggioni.riccardo
 */
public class Rectangle_2D extends Triangle_2D {

    int d;

    public Rectangle_2D(int a, int b, int c, int d) {
        super(a, b, c);
        this.d = d;
    }

    void create_r() {
        System.out.println("inserisci i lati del tuo rettangolo: (max 4)");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
    }

    void edit_r() {
        int iff = 0;
        System.out.println("che lato del rettangolo vuoi cambiare? (max 4)");
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
                } else {
                    if (iff == 4) {
                        System.out.println("inserisci il nuovo valore: ");
                        d = sc.nextInt();
                    }
                }

            }
        }
    }
    void peri_r() {
        int peri = a + b + c + d;
        System.out.println("il perimetro è: " + peri);
    }

    void print_r() {
        System.out.println("lato 1: " + a);
        System.out.println("lato 2: " + b);
        System.out.println("lato 3: " + c);
        System.out.println("lato 4: " + d);
    }
}
