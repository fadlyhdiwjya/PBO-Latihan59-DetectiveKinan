/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg2022431708.latihan59.detectiveconan;

/**
 *
 * @author HP
 */
public class Pemeran {
    
    protected String nama, peran;
    
    public Pemeran(String nama, String peran){
        this.nama = nama;
        this.peran = peran;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getPeran(){
        return peran;
    }
    
}
