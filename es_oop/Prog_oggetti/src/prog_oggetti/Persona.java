package prog_oggetti;
public class Persona {
    //CARATTERISTICHE
    double altezza;
    double peso;
    int eta;
    boolean sesso;
    String nome;
    String cognome;
    
    //COMPORTAMENTI
    public Persona(double altezza, double peso, int eta, boolean sesso, String nome, String cognome){ 
        this.altezza = altezza;
        this.peso = peso;
        this.eta = eta;
        this.sesso = sesso;
        this.nome = nome;
        this.cognome = cognome;
        
    }


public String getNome(){
    return nome;
}
public void setNome(String nome){
    this.nome = nome;
}
public String getCognome(){
    return cognome;
}
public void setCognome(String cognome){
    this.cognome = cognome;
}
public boolean getSesso(){
    return sesso;    
}
public void setSesso(boolean sesso){
    this.sesso = sesso;
}
public int getEta(){
    return eta;
}
public void setEta(int eta){
    this.eta = eta;
}
public double getPeso(){
    return peso;
}
public void setPeso(double peso){
    this.peso = peso;
}
public double getAltezza(){
    return altezza;
}
public void setAltezza(double altezza){
    this.altezza = altezza;
}
}



