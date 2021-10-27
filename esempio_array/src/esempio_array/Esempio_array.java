/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esempio_array;

/**
 *
 * @author puggioni.riccardo
 */
public class Esempio_array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        arraygen[] listaPersona;
        listaPersona = new arraygen[10];
        stampaLista(listaPersona);
        listaPersona[0] = new arraygen("mario", "rossi");
        listaPersona[5] = new arraygen("lorenzo", "ostuni");
        arraygen p = new arraygen("pippo","baudo");
        System.out.println("persona "+p);
        System.out.println("nome "+listaPersona[].getNome()+
        "cognome"+listaPersona[0].getCognome());
        
    }
    public static void stampalista(arraygen[] listapersona){
        System.out.println("CONTENUTO LISTA");
        for(int i= 0; i<listapersona.length; i++){
            System.out.println("pos "+i+"--->"+listapersona[i]);
            if(listapersona[i]!=null)
            System.out.println("pos "+i+"--->"+"nome"+listapersona[i].getNome()+"cognome "+listapersona[i].getCognome());
            
        }
    }
}
