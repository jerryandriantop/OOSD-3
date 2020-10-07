/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid19;

/**
 *
 * @author Jerry Pangaribuan
 */
public class Covid19 {

    /**
     * @param args the command line arguments
     */
    
    private String provinsi;
    private int terkonfirmasi;
    private int sembuh;
    private int meninggal;

    public Covid19() {
    }

    public Covid19(String provinsi, int terkonfirmasi, int sembuh, int meninggal) {
        this.provinsi = provinsi;
        this.terkonfirmasi = terkonfirmasi;
        this.sembuh = sembuh;
        this.meninggal = meninggal;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Covid19 sumut = new Covid19();
        
        Covid19 jakarta = new Covid19("DKI Jakarta", 10097, 1020, 560);
        
        jakarta.printCovid();
    }
    
    public void printCovid(){    
        System.out.println(this.provinsi);
        System.out.println(this.terkonfirmasi);
        System.out.println(sembuh);
        System.out.println(meninggal);
    }
    
    
    
}
