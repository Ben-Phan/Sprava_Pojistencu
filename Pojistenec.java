/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.projektevidencepojisteni;
import java.util.ArrayList;



/**
 *
 * @author Kim
 */
public class Pojistenec {

//Atributy třídy a konstruktoru
private String jmeno;
private String prijmeni;
private int vek;
private String telefon;


// konstruktor pro novou osobu
public Pojistenec (String jmeno, String prijmeni, int vek, String telefon) {
    this.jmeno = jmeno;
    this.prijmeni = prijmeni;
    this.vek = vek;
    this.telefon = telefon;
}   

//gettery 
public String getJmenoPojistence() {
    return jmeno;
}

public String getPrijmeniPojistence() {
    return prijmeni;
}

public int getVekPojistence(){
    return vek;
}

public String getTelefonPojistence() {
    return telefon;
}


@Override
public String toString () {
    return jmeno + " " + prijmeni + " " + vek + " " + telefon;
}


}
