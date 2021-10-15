/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package striscialed;

/**
 *
 * @author puggioni.riccardo
 */
public class Led {
    private String status_ld;
    private int broken_click_ld;
    private String colore_ld;
    private int click_ld;
    
    public Led(String status_ld, int broken_click_ld, String colore_ld, int click_ld){
        this.status_ld = status_ld;
        this.broken_click_ld = broken_click_ld;
        this.colore_ld = colore_ld;
        this.click_ld = click_ld;
}
    public int getClick_ld(){
        return click_ld;
    }
    public void setClick_ld(){
        this.click_ld = click_ld;
    }
    public String getStatus_ld(){
        return status_ld;
    }
    public void setStatus_ld(String status_ld){
        this.status_ld = status_ld;
    }
    public int getBroken_click_ld(){
        return broken_click_ld;
    }
    public void setBroken_click_ld(){
        this.broken_click_ld = broken_click_ld;
    }
    public String getColore_ld(){
    return colore_ld;
    }
    public void setColore_ld(String colore_ld){
        this.colore_ld = colore_ld;
    }
    


}
