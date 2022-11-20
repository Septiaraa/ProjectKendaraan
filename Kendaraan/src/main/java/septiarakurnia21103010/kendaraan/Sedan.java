/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package septiarakurnia21103010.kendaraan;

/**
 *
 * @author admin
 */
public class Sedan extends Mobil {
    String fasilitasKeamanan, fasilitasKenyamanan;
    int kapasitasCC;
    float hitungpajak;
    
    public Sedan(){
    }
    public Sedan(char noPlat, float pajak, String merk,String fasilitasKeamanan, String fasilitasKenyamanan, int kapasitasCC){
        super(noPlat,pajak,merk);
        this.fasilitasKeamanan = fasilitasKeamanan;
        this.fasilitasKenyamanan = fasilitasKenyamanan;
        this.kapasitasCC = kapasitasCC;
    }
    public void infoSedan(){
        System.out.println("Fasilitas Keamanan      : " +fasilitasKeamanan);
        System.out.println("Fasilitas Kenyamanan    : "+fasilitasKenyamanan);
    }
    public void tampilInfo(){
        super.tampilInfo();
        infoSedan();
    }
    public float hitungPajak(){
        return hitungpajak = (float) (pajak + (pajak +(pajak*kapasitasCC*0.00005)));
    }
    
}
