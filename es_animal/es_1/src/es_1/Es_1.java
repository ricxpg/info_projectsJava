/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_1;

import java.util.Scanner;

/**
 *
 * @author puggioni.riccardo
 */
public class Es_1 {
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        Animale p = new Animale("nd",0, 5, 0, "nd", "nd", "nd", "nd");

        do{

        
        int b;
                Scanner sc1 = new Scanner(System.in);
        System.out.println("Benvenuto nel programma di creazione del tuo animale di compagnia");
        System.out.println("Seleziona una delle opzioni seguenti: ");
        System.out.println("1. Creazione dell'animale ");
        System.out.println("2. Quanto cibo ho?");
        System.out.println("3. Acquista cibo");
        System.out.println("4. Dai da mangiare al tuo animale");
        System.out.println("5. Esci");
        int a;
        a = sc1.nextInt();
        switch(a){
            case 1:
                System.out.println(ANSI_RED+"Iniziamo a creare il tuo animale"+ANSI_RESET);
                System.out.println("Seleziona un nome da dargli: ");
                p.setNome_an(sc1.next());
                System.out.println("Nome selezionato: "+p.getNome_an());
                System.out.println();
                System.out.println(ANSI_RED+"Seleziona il tipo di animale: "+ANSI_RESET);
                p.setTipo_an(sc1.next());
                System.out.println("Il tipo selezionato è: "+p.getTipo_an());
                System.out.println();
                System.out.println(ANSI_RED+"Quanto ha mangiato? "+ANSI_RESET);
                p.setCibomangiato_an(sc1.nextInt());
                System.out.println();
                
                System.out.println("Ha mangiato "+p.getCibomangiato_an()+ " di cibo");
                System.out.println(ANSI_RED+"Quant'è il massimo di cibo per questo animale? "+ANSI_RESET);
                p.setMax_cibo_an(sc1.nextInt());
                System.out.println();
                System.out.println(ANSI_RED+"Il tuo animale riesce a nuotare?"+ANSI_RESET);
                System.out.println("1. Si");
                System.out.println("2. No");
                a = sc1.nextInt();
                switch(a){
                    case 1:
                        System.out.println(p.getNome_an()+ "Sa nuotare");
                        p.setNuota_an("sa nuotare");
                        break;
                    case 2:
                        System.out.println(p.getNome_an()+ "Non sa nuotare");
                        p.setNuota_an("non sa nuotare");       
                        break;
                    default:
                        System.out.println("Errore, salto questo passaggio");
                        p.setNuota_an("Passaggio saltato");
                }
                System.out.println();
                System.out.println(ANSI_RED+"Il tuo animale sa volare?"+ANSI_RESET);
                System.out.println("1. Si");
                System.out.println("2. No");
                a = sc1.nextInt();
                switch(a){
                    case 1:
                        System.out.println(p.getNome_an()+ "Sa volare");
                        p.setVola_an("Sa volare");
                        break;
                    case 2:
                        System.out.println(p.getNome_an()+ "Non sa volare");
                        p.setVola_an(" Non sa volare");
                        break;
                    default:
                        System.out.println("Errore, salto questo passaggio");
                        p.setVola_an("Passaggio saltato");
                }
                System.out.println();
                System.out.println(ANSI_RED+"Di che colore è il tuo animale?"+ANSI_RESET);
                p.setColore_an(sc1.next());
                System.out.println("Il tuo animale è di color "+p.getColore_an());
                System.out.println();
                System.out.println("Il tuo animale è pronto!");
                System.out.println("Si chiama "+ p.getNome_an());
                System.out.println("E' di color "+p.getColore_an());
                System.out.println("E' di tipo "+p.getTipo_an());
                System.out.println(""+p.getNuota_an());
                System.out.println(""+p.getVola_an());
                System.out.println();
                break;
            case 2:
                System.out.println("Hai "+p.getCibo_an()+" di cibo");
                System.out.println();
                break;
            case 3:
                System.out.println(ANSI_RED+"Quanto cibo vuoi acquistare? "+ANSI_RESET);
                System.out.println("1. 10");
                System.out.println("2. 50");
                System.out.println("3. 100");
                System.out.println("4. 500");
                a = sc1.nextInt();
                System.out.println();
                switch(a){
                    case 1:
                        System.out.println("Hai acquistato 10 di cibo");
                        p.mangia_an(10);
                        System.out.println("Ora hai "+p.getCibo_an()+" di cibo");
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Hai acquistato 50 di cibo");
                        p.mangia_an(50);
                        System.out.println("Ora hai "+p.getCibo_an()+" di cibo");
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Hai acquistato 100 di cibo");
                        p.mangia_an(100);
                        System.out.println("Ora hai "+p.getCibo_an()+" di cibo");
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("Hai acquistato 500 di cibo");
                        p.mangia_an(+500);
                        System.out.println("Ora hai "+p.getCibo_an()+" di cibo");
                        System.out.println();
                        break;
                    default:
                        System.out.println("Errore, esco dal programma");
                        System.out.println();
                        break;
                }
            case 4:
                System.out.println(ANSI_RED+"Quanto cibo vuoi dare al tuo animale? "+ANSI_RESET);
                System.out.println("1. 5");
                System.out.println("2. 10");
                System.out.println();
                a= sc1.nextInt();
                switch(a){
                    case 1:
                        System.out.println("Hai dato 5 di cibo al tuo animale ");
                        p.mangia_an(-5);
                        break;
                    case 2:
                        System.out.println("Hai dato 10 di cibo al tuo animale ");
                        p.mangia_an(-10);
                        System.out.println();
                        break;
                    default:
                        System.out.println("Errore, esco dal programma ");
                        System.out.println();
                        break;
                }
        }                
                        
        if(a==5)
            break;
        }while(1>0);
    }
    
}
