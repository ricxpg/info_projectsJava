package es_note;

import java.util.Scanner;

public class Es_note {
    public static void main(String[] args) {
        Es_note_gen p = new Es_note_gen("null", "null", "null", "null", "null");
        Scanner sc = new Scanner(System.in);
        String password2 = "work1122";
        String email2 = "work@work.com";               
        int cycle;
        do{
        System.out.println("programma in fornitura:");
        System.out.println("email: work@work.com");
        System.out.println("password: work1122");
        System.out.println("starting...");
        System.out.println();
        System.out.println("1. register/login");
        System.out.println("2. aggiunta info");
        System.out.println("3. crea nota");
        System.out.println("4. leggi nota");
        System.out.println("5. esci");
        cycle = sc.nextInt();
        switch(cycle){
            case 1:
                System.out.println("inserisci la email");
                String email;
                email = sc.next();
                System.out.println("inserisci la password");
                String password;
                password = sc.next();
             if(email == email2){
                 System.out.println("mail corretta");
             }else{
                 System.out.println("mail errata");
             }if(password == password2){
                 System.out.println("password corretta");
             }else{
                 System.out.println("password errata");                
             }break;
            case 2:
                System.out.println("inserisci il tuo nome");
                p.setName_user(sc.next());
                System.out.println("inserisci il tuo cognome");
                p.setStreet_user(sc.next());
                System.out.println("inserisci la tua città");
                p.setCity_user(sc.next());
                System.out.println("inserisci la tua via");
                p.setStreet_user(sc.next());
                break;
            case 3:
                System.out.println("inserisci il testo della nota");
                p.setNotes_user(sc.next());
                break;
            case 4:
                System.out.println(p.getNotes_user());
                break;
            case 5:
                break;
        }
        }while(1>0);
    }
    
}
