package com.pojos;
// Generated 01.Ara.2014 13:53:21 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Konum generated by hbm2java
 */
public class Konum  implements java.io.Serializable {


     private int kid;
     private String tanim;
     private Set<Akraba> akrabas = new HashSet<Akraba>(0);

    public Konum() {
    }

	
    public Konum(int kid) {
        this.kid = kid;
    }
    public Konum(int kid, String tanim, Set<Akraba> akrabas) {
       this.kid = kid;
       this.tanim = tanim;
       this.akrabas = akrabas;
    }
   
    public int getKid() {
        return this.kid;
    }
    
    public void setKid(int kid) {
        this.kid = kid;
    }
    public String getTanim() {
        return this.tanim;
    }
    
    public void setTanim(String tanim) {
        this.tanim = tanim;
    }
    public Set<Akraba> getAkrabas() {
        return this.akrabas;
    }
    
    public void setAkrabas(Set<Akraba> akrabas) {
        this.akrabas = akrabas;
    }




}


