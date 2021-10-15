/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es_uni;

/**
 *
 * @author puggioni.riccardo
 */
public class Es_uni_gen {
    private String name_emp;
    private String uc_emp;
    private String city_emp;
    private String surname_emp;
    private String street_emp;
    
public Es_uni_gen(String name_emp, String uc_emp, String city_emp, String surname_emp, String street_emp){
    this.city_emp = city_emp;
    this.name_emp = name_emp;
    this.street_emp = street_emp;
    this.surname_emp = surname_emp;
    this.uc_emp = uc_emp;
}
public String getName_emp(){
    return name_emp;
}
public void setName_emp(String name_emp){
    this.name_emp = name_emp;
}
public String getUc_emp(){
    return uc_emp;
}
public void setUc_emp(String uc_emp){
    this.uc_emp = uc_emp;
}
public String getCity_emp(){
    return city_emp;
}
public void setCity_emp(String city_emp){
    this.city_emp = city_emp;
}
public String getStreet_emp(){
    return street_emp;
}
public void setStreet_emp(String street_emp){
    this.street_emp = street_emp;
}
public String getSurname_emp(){
    return surname_emp;
}
public void setSurname_emp(String surname_emp){
    this.surname_emp = surname_emp;
}

}
