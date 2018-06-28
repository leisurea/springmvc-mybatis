package net.person.model;

public class PersonModel {

    public int ID;
    public String USERNAME;
    public int AGE;
    public String MOBILEPHONE;

    public PersonModel(){
        super();
    }

    public PersonModel(int ID, String USERNAME, int AGE, String MOBILEPHONE) {
        this.ID = ID;
        this.USERNAME = USERNAME;
        this.AGE = AGE;
        this.MOBILEPHONE = MOBILEPHONE;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public int getAGE() {
        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }

    public String getMOBILEPHONE() {
        return MOBILEPHONE;
    }

    public void setMOBILEPHONE(String MOBILEPHONE) {
        this.MOBILEPHONE = MOBILEPHONE;
    }
}
