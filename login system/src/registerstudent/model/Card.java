/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registerstudent.model;

import registerstudent.model.*;

/**
 *
 * @author CLOUD_ATLAS
 */
public class Card {

    private String companyname;
    private String cardtype;
    private String cardno;
    private String name;
    private String expirydate;

    public Card() {
    }

    public Card(String companyname, String cardtype, String cardno, String name, String expirydate) {
        this.companyname = companyname;
        this.cardtype = cardtype;
        this.cardno = cardno;
        this.name = name;
        this.expirydate = expirydate;
    }

    /**
     * @return the id
     */
    public String getcompanyname() {
        return companyname;
    }

    /**
     * @param id the id to set
     */
    public void setcompanyname(String company) {
        this.companyname = companyname;
    }

    /**
     * @return the name
     */
    public String getcardtype() {
        return cardtype;
    }

    /**
     * @param name the name to set
     */
    public void setcardtype(String cardtype) {
        this.cardtype = cardtype;
    }
     public String getcardno() {
        return cardno;
    }

    /**
     * @param name the name to set
     */
    public void setcardno(String cardno) {
        this.cardno = cardno;
    }
    public String getname() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void name(String name) {
        this.name = name;
    }
    public String getexpirydate() {
        return expirydate;
    }

    /**
     * @param name the name to set
     */
    public void setusername(String expirydate) {
        this.expirydate = expirydate;
    }
}
