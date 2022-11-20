/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package septiarakurnia21103010.kendaraan;

/**
 *
 * @author admin
 */
public class MiniBus extends Sedan implements InterfaceBus{
    String tipe;
    float hitungpajak;
    InterfaceBus interfacebus;
    
    public MiniBus(){
    }
    public MiniBus(char noPlat, float pajak, String merk,String fasilitasKeamanan, String fasilitasKenyamanan, int kapasitasCC,int kapasitasPenumpang, int kapasitasBagasi){
        super(noPlat, pajak, merk,fasilitasKeamanan,fasilitasKenyamanan, kapasitasCC);
        interfacebus = new Bus(noPlat, pajak, merk,kapasitasPenumpang,kapasitasBagasi);
    }
    public void infoMiniBus(){
        if(tipe == "Pribadi"){
            System.out.println("Tipe Minibus    : Pribadi, digunakan sebagai kendaraan pribadi");
        }else if(tipe == "Wagon"){
            System.out.println("Tipe MiniBus    : Wagon digunakan sebagai kendaraan angkut/travel");
        }
    }
    public void infoBus(){
        interfacebus.infoBus();
    }
    public void tampilInfo(){
        super.tampilInfo();
        infoBus();
        infoMiniBus();
    }
    public float hitungPajak(){
        if(tipe == "Pribadi"){
            hitungpajak = (float) ((super.hitungpajak*0.05)+(interfacebus.hitungPajak()*0.03));
        }else if(tipe == "Wagon"){
            hitungpajak = (float) ((super.hitungpajak*0.03)+(interfacebus.hitungPajak()*0.05));
        }
        return hitungpajak;
    }
}
