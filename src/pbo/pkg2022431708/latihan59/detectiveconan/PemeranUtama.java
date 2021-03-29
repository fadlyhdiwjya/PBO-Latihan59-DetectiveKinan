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
public class PemeranUtama extends Pemeran {
    
    protected String tujuan,tim;
    
    public PemeranUtama(String nama, String peran, String tujuan, String tim){
        super(nama, peran);
        this.tim = tim;
        this.tujuan = tujuan;
    }
    
    public String getTujuan(){
        return tujuan;
    }
    
    public String getTim(){
        return tim;
    }
    
    public void tampilPemeranUtama(){
        System.out.println("Nama : "+getNama());
        System.out.println("Peran : "+getPeran());
        System.out.println("Tim : "+getTim());
        System.out.println("Tujuan : "+getTujuan());
        System.out.println("");


    }
    
}
