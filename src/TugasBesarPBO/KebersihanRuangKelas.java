/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TugasBesarPBO;

import java.util.Scanner;

/**
 *
 * @author Fikri
 */
public class KebersihanRuangKelas extends KebersihanRuangKelasSG{
    Scanner fikri = new Scanner(System.in);
    public KebersihanRuangKelas(String SirUdara, int NilaiPencahayaan, int Kelembapan, int Suhu) {
        super(SirUdara, NilaiPencahayaan, Kelembapan, Suhu);
    }

    @Override
    public void input() { 
        System.out.print("bagaimana keadaan sirkulasi udara : ");
        super.setSirUdara(fikri.nextLine()) ;
        System.out.print("masukkan kecahayaan : ");
        super.setNilaiPencahayaan(fikri.nextInt()) ;               
        System.out.print("masukkan kelembapan : ");
        super.setKelembapan(fikri.nextInt()) ;
        System.out.print("Masukkan suhu : ");
        super.setSuhu(fikri.nextInt());
        System.out.print("\n");
    }

    @Override
    public String AnalisisSirUdara() {
        //super.getSirUdara();
        System.out.println("keadaan sirkulasi udara "+getSirUdara());
            if ("Lancar".equals(getSirUdara()) || "lancar".equals(getSirUdara())){
                    System.out.println("Sirkulasi Udara Lancar (Sesuai)");
                        }
            else if("Tidak Lancar".equals(getSirUdara()) || "tidak lancar".equals(getSirUdara())){
                System.out.println("Sirkulasi Udara Tidak Lancar (Tidak Sesuai)");
            }
            else{
                    System.out.println("(Inputan Salah)");
                    }
            return super.getSirUdara();
    }

    @Override
    public int AnalisisPencahayaan() {
        //super.getNilaiPencahayaan();
        //System.out.print("kecahayaannya "+getNilaiPencahayaan());
            if(getNilaiPencahayaan()>=250 && getNilaiPencahayaan()<=350){
                System.out.println("Pencayaan (Sesuai)");
                    }
            else{
                System.out.println("Pencahayaan (Tidak Sesuai)");
                    }
            return getNilaiPencahayaan();
    }

    @Override
    public int AnalisisKelembapan() {
       // super.getKelembapan();
        //System.out.print("kelembapannya "+getKelembapan());
            if(getKelembapan()>=70 && getKelembapan()<=80){
                System.out.println(" Kelembapan (Sesuai)");
                    }
            else{
                System.out.println(" Kelembapan (Tidak Sesuai)");
                    }
            return getKelembapan();
    }

    @Override
    public int AnalisisSuhu() {
    //super.getSuhu();
    //System.out.print("suhunya adalah "+getSuhu());
            if (getSuhu()>=25 && getSuhu()<=35){
                System.out.println(" (Suhu sesuai)");
                    }
            else{
                System.out.println(" (Suhu tidak sesuai)");
                    }
            return getSuhu();
    }

    @Override
    public void Output() {
        //System.out.println("sirkulasi udara "+getSirUdara());
        super.getSirUdara();
        //System.out.println("Pencahayaan "+getNilaiPencahayaan());
        super.getNilaiPencahayaan();
        //System.out.println("Kelembapan "+getKelembapan());
        super.getKelembapan();
        //System.out.println("Suhu "+getSuhu());
        super.getSuhu();
    }
}
