/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan702;

/**
 *
 * @author M Riski Maulanaa
 * 
 */
public class Persegi extends BangunRuang {
    private int panjang, lebar;
    
    public void setpanjang (int pj){
        this.panjang = pj;
    }
     public void setlebar (int lb){
        this.lebar = lb;
       
         
     }
     
     @Override
     public void hitungluas(){
         this.luas = this.panjang*this.lebar;
         
         System.out.printf("hitung luaspersegi panjang\n");
         System.out.printf("~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
         System.out.printf("Luas = Panjang X Lebar\n");
         System.out.printf("    = %d X %d\n", this.panjang,this.lebar);
         System.out.printf("       = %.2f\n", this.luas);
         
         
     }
       
    
    
    
}
