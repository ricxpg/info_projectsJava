package geometry_interface;

import java.util.Scanner;
import java.util.stream.*;

/**
 *
 * @author puggioni.riccardo
 */
public class All_Form implements AllForm_Interface {

    public static Scanner sc = new Scanner(System.in);

    @Override
    public double create_a(int a) {
        System.out.print("Enter the number of elements you want to store: ");
        a = sc.nextInt();
        int[] array = new int[a];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < a; i++) {
            array[i] = sc.nextInt();
        }
        return 0;
    }

    @Override
    public double peri_a() {
        return 0;
        
    }

    @Override
    public double print_a() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
