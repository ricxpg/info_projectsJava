/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_1;

/**
 *
 * @author puggioni.riccardo
 */
public class Animale {
    private String vola_an;
    private int cibo_an;
    private int max_cibo_an;
    private String nuota_an;
    private String nome_an;
    private String tipo_an;
    private String colore_an;
    private int cibomangiato_an;
    
    public Animale(String vola_an, int cibomangiato_an, int cibo_an, int max_cibo_an, String nuota_an, String nome_an, String tipo_an, String colore_an){ 
    this.vola_an = vola_an;
    this.cibo_an = cibo_an;
    this.max_cibo_an = max_cibo_an;
    this.nuota_an = nuota_an;
    this.nome_an = nome_an; 
    this.tipo_an = tipo_an;
    this.colore_an = colore_an;
    this.cibomangiato_an = cibomangiato_an;
    }
    
public String getVola_an(){
    return vola_an;
}
public int getCibomangiato_an(){
    return cibomangiato_an;
}
public void setCibomangiato_an(int cibomangiato_an){
    this.cibomangiato_an = cibomangiato_an;
}
public void setVola_an(String vola_an){
    this.vola_an = vola_an;
}
public int getCibo_an(){
    return cibo_an;
}
public void setCibo_an(int cibo_an){
    this.cibo_an = cibo_an;
}
public int getMax_cibo_an(){
    return max_cibo_an;    
}
public void setMax_cibo_an(int max_cibo_an){
    this.max_cibo_an = max_cibo_an;
}
public String getNuota_an(){
    return nuota_an;
}
public void setNuota_an(String nuota_an){
    this.nuota_an = nuota_an;
}
public String getNome_an(){
    return nome_an;
}
public void setNome_an(String nome_an){
    this.nome_an = nome_an;
}
public String getTipo_an(){
    return tipo_an;
}
public void setTipo_an(String tipo_an){
    this.tipo_an = tipo_an;
}
public void setColore_an(String colore_an){
    this.colore_an = colore_an;
}
public String getColore_an(){
    return colore_an;
}
public void mangia_an(int cibo_an){
    this.cibo_an=this.cibo_an+cibo_an;
}
}
