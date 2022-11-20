/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package septiarakurnia21103010.kendaraan;

/**
 *
 * @author admin
 */
public class Mobil{
    char noPlat;
    float pajak;
    String merk;
    public Mobil(){
    }
    public Mobil(char noPlat, float pajak, String merk){
        this.merk = merk;
        this.noPlat = noPlat;
        this.pajak = pajak;
    }
    public void tampilInfo(){
        System.out.println("NO PLAT     : "+noPlat);
        System.out.println("MERK        : "+merk);
        System.out.println("PAJAK       : "+pajak);
    }
}
