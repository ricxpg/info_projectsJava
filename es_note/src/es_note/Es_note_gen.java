package es_note;
public class Es_note_gen {
    
    private String name_user;
    private String notes_user;
    private String city_user;
    private String surname_user;
    private String street_user;
    
    public Es_note_gen(String name_user, String notes_user, String city_user, String surname_user, String street_user){
    this.city_user = city_user;
    this.name_user = name_user;
    this.street_user = street_user;
    this.surname_user = surname_user;
    this.notes_user = notes_user;
}
public String getName_user(){
    return name_user;
}
public void setName_user(String name_user){
    this.name_user = name_user;
}
public String getNotes_user(){
    return notes_user;
}
public void setNotes_user(String notes_user){
    this.notes_user = notes_user;
}
public String getCity_user(){
    return city_user;
}
public void setCity_user(String city_user){
    this.city_user = city_user;
}
public String getStreet_user(){
    return street_user;
}
public void setStreet_user(String street_user){
    this.street_user = street_user;
}
public String getSurname_user(){
    return surname_user;
}
public void setSurname_user(String surname_user){
    this.surname_user = surname_user;
}

}


