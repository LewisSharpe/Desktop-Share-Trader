/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registerstudent.model;

/**
 *
 * @author CLOUD_ATLAS
 */
public class Student {

    private String name;
    private String email;
    private String username;
    private String password;
    private String membershiptype;

    public Student() {
    }

    public Student(String name, String email, String username, String password, String membershiptype) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.membershiptype = membershiptype;
    }

    /**
     * @return the id
     */
    public String getemail() {
        return email;
    }

    /**
     * @param id the id to set
     */
    public void setemail(String email) {
        this.email = email;
    }

    /**
     * @return the name
     */
    public String getmembershiptype() {
        return membershiptype;
    }

    /**
     * @param name the name to set
     */
    public void setmembershiptype(String membershiptype) {
        this.membershiptype = membershiptype;
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
    public String getusername() {
        return username;
    }

    /**
     * @param name the name to set
     */
    public void setusername(String username) {
        this.username = username;
    }
    public String getpassword() {
        return password;
    }

    /**
     * @param name the name to set
     */
    public void setpassword(String password) {
        this.password = password;
    }
}
