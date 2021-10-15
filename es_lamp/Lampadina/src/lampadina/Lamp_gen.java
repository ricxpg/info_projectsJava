/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lampadina;

/**
 *
 * @author puggioni.riccardo
 */
public class Lamp_gen {
    private int max_click_lp;
    private int click_lp;
    private String lamp_status_lp;
    public Lamp_gen(int max_click_lp, int click_lp, String lamp_status_lp){
        this.max_click_lp = max_click_lp;
        this.click_lp = click_lp;
        this.lamp_status_lp = lamp_status_lp;
    }
public int getMax_click_lp(){
    return max_click_lp;
}
public void setMax_click_lp(int max_click_lp){
    this.max_click_lp = max_click_lp;
}
public int getClick_lp(){
    return click_lp;
}
public void setClick_lp(int click_lp){
    this.click_lp = click_lp;
}
public String getLamp_status_lp(){
    return lamp_status_lp;
}
public void setLamp_status_lp(String lamp_status_lp){
    this.lamp_status_lp = lamp_status_lp;
}
    
}
