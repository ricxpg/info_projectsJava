package geometry_interface;

import java.util.Scanner;

/**
 *
 * @author puggioni.riccardo
 */
public class Geometry_interface {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Triangle_2D t = new Triangle_2D(0, 0, 0);
        Rectangle_2D r = new Rectangle_2D(0, 0, 0, 0);
        Circle_2D c = new Circle_2D();
        All_Form d = new All_Form();
        int a;
        int b;
        System.out.println("cosa vuoi fare? "
                + "\n1. modifica una forma esistente"
                + "\n2. inizia a creare nuove forme "
                + "\n3. esci"
                + "\n4. conosci il perimetro della tua forma");
        b = sc.nextInt();
        switch (b) {
            case 2:
                System.out.println("quante forme vuoi creare? (max 10) ");
                System.out.println("crea una forma geometrica: "
                        + "\n1. Triangolo"
                        + "\n2. Rettangolo"
                        + "\n3. Cerchio"
                        + "\n4. Personalizzato");
                a = sc.nextInt();
                switch (a) {
                    case 1:
                        t.create_t();
                    case 2:
                        r.create_r();
                    case 3:
                        c.create_c();
                    case 4:
                        d.create_a(a);

                }
        }
    }
}
