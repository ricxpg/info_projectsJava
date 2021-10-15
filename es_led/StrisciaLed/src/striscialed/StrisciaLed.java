/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package striscialed;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author puggioni.riccardo
 */
public class StrisciaLed {
    public static void main(String[] args) {
        Random led = new Random();
        
        Led p = new Led("Spento", led.nextInt(11), "null", 0);
        int a;
                int i=0;
        int c = p.getClick_ld();
        String stato = null;
        Scanner sc1 = new Scanner(System.in);
         a = led.nextInt(6);
         int cycle;
        switch(a){
            case 1:
                p.setColore_ld("Rosso");
                break;
            case 2:
                p.setColore_ld("Verde");
                break;
            case 3:
                p.setColore_ld("Giallo");
                break;
            case 4:
                p.setColore_ld("Blu");
                break;
            case 5:
                p.setColore_ld("Viola");
                break;
        }
        do{
        System.out.println("1. fai click");
        System.out.println("2. di che colore è la striscia ");
        System.out.println("3. quanti click mi restano");
        System.out.println("4. stato del led");
        System.out.println("5. esci");
        a = sc1.nextInt();
        switch(a){
            case 1:
                c = c+1;
                System.out.println();
                if(c == p.getBroken_click_ld()){ 
                    System.out.println("led rotto");
                    p.setStatus_ld("Rotto");
                    stato = p.getStatus_ld();
                }else{
                    if(stato == "Spento"){
                        System.out.println("click!");
                        System.out.println();
                        p.setStatus_ld("Acceso");                        
                    }else{
                        System.out.println("click");
                        System.out.println();
                        p.setStatus_ld("Spento");
                    }
                }
                System.out.println();
               break;
            case 2:
                System.out.println();
                System.out.println(p.getColore_ld());
                break;
            case 3:
                int e = p.getBroken_click_ld() - c;
                System.out.println(e);
                break;
            case 4:
                System.out.println();
                System.out.println(p.getStatus_ld());
                break;
        }

        }while(i>0);
    }
    
}
