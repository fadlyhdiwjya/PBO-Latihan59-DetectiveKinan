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
public class TokohPendukung extends Pemeran{
    
    protected String partner;
    
    public TokohPendukung(String partner, String nama, String peran){
        super(nama, peran);
        this.partner = partner;
    }
    
    public String getPartner(){
        return partner;
    }
    
    public void tampilTokohPendukung(){
        System.out.println("Nama : "+getNama());
        System.out.println("Peran : "+getPeran());
        System.out.println("Partner : "+getPartner());
        System.out.print("");
    }
}
