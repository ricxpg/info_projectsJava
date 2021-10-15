/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lampadina;

import java.util.Scanner;

/**
 *
 * @author puggioni.riccardo
 */
public class Lamp {

    public static void main(String[] args) {
        Lamp_gen p = new Lamp_gen(0, 0, "null");
        Scanner sc =new Scanner(System.in);
        int a;
        
            System.out.println("Benvenuto nel pannello di controllo della tua lampadina intelligente, seleziona una delle opzioni seguenti ");
            System.out.println("1. Esci");
            System.out.println("2. Fai click!");
            System.out.println("3. Verifica il consumo dei tuoi click e lo stato della lampadina");
            a = sc.nextInt();
            switch(a){
                case 1:
                    System.out.println("Esco dal programma ");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Vuoi accendere o spegnere la luce? ");
                    System.out.println("Click!");
                    
        }
    }
    
}
