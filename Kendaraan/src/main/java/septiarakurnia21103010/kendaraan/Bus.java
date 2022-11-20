/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package septiarakurnia21103010.kendaraan;

/**
 *
 * @author admin
 */
public class Bus extends Mobil implements InterfaceBus{
    int kapasitasPenumpang;
    int kapasitasBagasi;
    float hitungpajak;
    public Bus(){
    }
    public Bus(char noPlat, float pajak, String merk,int kapasitasPenumpang, int kapasitasBagasi){
        super(noPlat,pajak,merk);
        this.kapasitasBagasi = kapasitasBagasi;
        this.kapasitasPenumpang = kapasitasPenumpang;
    }
    public void infoBus(){
        System.out.println("Kapasitas Penumpang     : "+kapasitasPenumpang);
        System.out.println("Kapasitas Bagasi        : "+kapasitasBagasi);
    }
    public void tampilInfo(){
        super.tampilInfo();
        infoBus();
    }
    public float hitungPajak(){
        return hitungpajak = (float) (pajak + (pajak*kapasitasPenumpang*kapasitasBagasi*0.00005));
    }
}
