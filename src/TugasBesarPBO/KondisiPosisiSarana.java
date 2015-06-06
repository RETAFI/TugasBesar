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
public class KondisiPosisiSarana extends KondisiPosisiSaranaSG{
    Scanner fikri = new Scanner(System.in);
    public KondisiPosisiSarana(int Steker, String Kondisisteker, String Posisisteker, int KabelLcd, String KondisiKabelLcd, String PosisiKabelLcd, int Lampu, String Kondisilampu, String Posisilampu, int Kipas, String Kondisikipas, String Posisikipas, int Ac, String Kondisiac, String Posisiac, String SSID, String internet, int Cctv, String Kondisicctv, String Posisicctv) {
        super(Steker, Kondisisteker, Posisisteker, KabelLcd, KondisiKabelLcd, PosisiKabelLcd, Lampu, Kondisilampu, Posisilampu, Kipas, Kondisikipas, Posisikipas, Ac, Kondisiac, Posisiac, SSID, internet, Cctv, Kondisicctv, Posisicctv);
    }

    @Override
    public void Input() {
        System.out.print("Berapa Jumlah Steker : ");
        super.setSteker(fikri.nextInt());
        System.out.print("Bagaimana Kondisi Steker : ");
        super.setKondisisteker(fikri.next());
        System.out.print("Dimana posisi Steker : ");
        super.setPosisisteker(fikri.next());
        System.out.print("Berapa jumlah kabel LCD : ");
        super.setKabelLcd(fikri.nextInt());
        System.out.print("Bagaimana Kondisi kabel LCD : ");
        super.setKondisiKabelLcd(fikri.next());
        System.out.print("Dimana posisi Kabel LCD : ");
        super.setPosisiKabelLcd(fikri.next());
        System.out.print("Berapa jumalah lampu : ");
        super.setLampu(fikri.nextInt());
        System.out.print("Bagaimana Kondisis Lampu : ");
        super.setKondisilampu(fikri.next());
        System.out.print("Dimana posisi lampu : ");
        super.setPosisilampu(fikri.next());
        System.out.print("Berapa jumlah Kipas Angin : ");
        super.setKipas(fikri.nextInt());
        System.out.print("Bagaimana Kondisi Kipas Angin : ");
        super.setKondisikipas(fikri.next());
        System.out.print("Dimana posisi Kipas Angin : ");
        super.setPosisikipas(fikri.next());
        System.out.print("Berapa jumlah AC : ");
        super.setAc(fikri.nextInt());
        System.out.print("Bagaimana Kondisi AC : ");
        super.setKondisiac(fikri.next());
        System.out.print("Dimana Posisi AC : ");
        super.setPosisiac(fikri.next());
        System.out.print("Pilih SSID : ");
        super.setSSID(fikri.next());
        System.out.print("Apakah Internet Bisa Login : ");
        super.setInternet(fikri.next());
        System.out.print("Masukkan Jumlah CCTV : ");
        super.setCctv(fikri.nextInt());
        System.out.print("Bagaimana Kondisi CCTV : ");
        super.setKondisicctv(fikri.next());
        System.out.print("Dimana Posisi CCTV : ");
        super.setPosisicctv(fikri.next());
        System.out.print("\n");
        
    }

    @Override
    public int JumStekler() {
        //super.getSteker();
        //System.out.println("Jumlah Stekler : "+getSteker());
        if (getSteker()>=4) {
            System.out.println("Jumlah Steker (Sesuai)");
        }
        else{
            System.out.println("Jumlah Steker (tidak sesuai)");
        }
        return super.getSteker();
    }

    @Override
    public String KondisiStekler() {
        if ("Baik".equals(getKondisisteker()) || "baik".equals(getKondisisteker())) {
            System.out.println("Kondisi Steker baik (Sesuai");
        }
        else{
            System.out.println("Kondisi Steker (Tidak Sesuai)");
        }
        return super.getKondisisteker();
    }

    @Override
    public String PosisiStekler() {
        if ("Dipojok_Ruang".equals(getPosisisteker()) || "dipojok_ruang".equals(getPosisisteker())
         && "Dekat Dosen".equals(getPosisisteker()) || "dekat dosen".equals(getPosisisteker())){
            System.out.println("Posisi Steker (Sesuai)");
        }
        else {
            System.out.println("Posisi Steker(tidak sesuai)");
        }
        return super.getPosisisteker();
    
    }

    @Override
    public int JumKabelLCD() {
        if (getKabelLcd()>=1) {
            System.out.println("Jumlah Kable LCD (Sesuai)");
        }
        else{
            System.out.println("Jumlah Kabel LCD (Tidak Sesuai)");
        }
        return super.getKabelLcd();
    }

    @Override
    public String KondisiKabelLCD() {
        if ("Berfungsi".equals(getKondisiKabelLcd()) || "berfungsi".equals(getKondisiKabelLcd())) {
            System.out.println("Kondisi Kabel LCD (Sesuai)");
        }
        else{
            System.out.println("Kondisi Kabel LCD (Tidak Tesuai)");
        }
        return super.getKondisiKabelLcd();
    }

    @Override
    public String PosisiKabelLCD() {
        if("Dekat_Dosen".equals(getPosisiKabelLcd()) || "dekat_dosen".equals(getPosisiKabelLcd())){
            System.out.println("Posisi Kabel LCD (Sesuai)");
        }
        else{
            System.out.println("Posisi Kabel LCD (Tidak Sesuai)");
        }
        return super.getPosisiKabelLcd();
    }

    @Override
    public int JumLampu() {
        if(getLampu()>=18){
            System.out.println("Jumlah Lampu (Sesuai)");
        }
        else{
            System.out.println("Jumlah Lampu (Tidak Sesuai)");
        }
        return super.getLampu();
    }

    @Override
    public String KondisiLampu() {
        if ("Baik".equals(getKondisilampu()) || "baik".equals(getKondisilampu())) {
            System.out.println("Kondisi Lampu (Sesuai)");
        }
        else{
            System.out.println("Kondisi Lampu (Tidak Sesuai)");
        }
        return super.getKondisilampu();
    }

    @Override
    public String PosisiLampu() {
        if ("Atap_Ruangan".equals(getPosisilampu()) || "atap_ruangan".equals(getPosisilampu())) {
            System.out.println("Posisi Lampu (Sesuai)");
        }
        else{
            System.out.println("Posisi Lampu (Tidak Sesuai)");
        }
        return super.getPosisilampu();
    }

    @Override
    public int JumKipas() {
        if (getKipas()>=2){
            System.out.println("Jumlah Kipas Angin (Sesuai)");            
        }
        else{
            System.out.println("Jumlah Kipas Angin (Tidak Sesuai)");
        }
        return super.getKipas();
    }

    @Override
    public String KondisiKipas() {
        if ("baik".equals(getKondisikipas()) || "Baik".equals(getKondisikipas())) {
            System.out.println("Kondisi Kipas Angin (Sesuai)");
        }
        else{
            System.out.println("Kondisi Kipas Angin (Tidak Sesuai)");
        }
        return super.getKondisikipas();
    }

    @Override
    public String PosisiKipas() {
        if ("atap_ruangan".equals(getPosisikipas()) || "Atap_Ruangan".equals(getPosisikipas())) {
            System.out.println("Posisi Kipas Angin (Sesuai)");
        }
        else{
            System.out.println("Posisi Kipas Angin (Tidak Sesuai)");
        }
        return super.getPosisikipas();
    }

    @Override
    public int JumAC() {
        if (getAc()>=1) {
            System.out.println("Jumlah AC (Sesuai)");    
        }
        else{
            System.out.println("Jumlah AC (Tidak Sesuai)");
        }
        return super.getAc();
    }

    @Override
    public String KondisiAC() {
        if ("Baik".equals(getKondisiac()) || "baik".equals(getKondisiac())) {
            System.out.println("Kondisi AC (Sesuai)");
        }
        else {
            System.out.println("Kondisi AC (Tidak Sesuai)");
        } 
        return super.getKondisiac();
    }

    @Override
    public String PosisiAC() {
        if ("Dibelakang".equals(getPosisiac()) || "dibelakang".equals(getPosisiac())
            || "Disamping".equals(getPosisiac()) || "disamping".equals(getPosisiac())) {
            System.out.println("Posisi Ac (Sesuai)");
        }
        else{
            System.out.println("Posisi AC (Tidak Sesuai)");
        }
        return super.getPosisiac();
        
    }

    @Override
    public String SSID() {
        if ("UMM_Hotspot".equals(getSSID()) || "umm_hotspot".equals(getSSID())) {
            System.out.println("SSID (Sesuai)");
        }
        else {
            System.out.println("SSID (Tidak Sesuai)");
        }
        return super.getSSID();
    }

    @Override
    public String Bandwidth() {
        if ("Bisa".equals(getInternet()) || "bisa".equals(getInternet())) {
            System.out.println("Internet (Sesuai)");
        }
        else {
            System.out.println("Internet (Tidak Sesuai)");
        }
            return super.getInternet();
    }

    @Override
    public int JumCCTV() {
    if (getCctv()==2) {
            System.out.println("Jumlah CCTV (Sesuai)");
        }
        else{
            System.out.println("Jumlah CCTV (Tidak Sesuai)");
        }
        return super.getCctv();
    }

    @Override
    public String KondisiCCTV() {
        if ("Baik".equals(getKondisicctv()) || "baik".equals(getKondisicctv())) {
            System.out.println("Kondisi CCTV (Sesuai)");
        }
        else {
            System.out.println("Kondisi CCTV (Tidak Sesuai)");
        }
        return super.getKondisicctv();
    }

    @Override
    public String PosisiCCTV() {
        if ("didepan".equals(getPosisicctv())       || "Didepan".equals(getPosisicctv())
            && "dibelakang".equals(getPosisicctv()) || "Dibelakang".equals(getPosisicctv())) {
            System.out.println("Posisi CCTV (Sesuai)");
        }
        else
            System.out.println("Posisi CCTV (Tidak Sesuai)");
        return super.getPosisicctv();
    }

    @Override
    public void Output() {
        super.getSteker();
        super.getKondisisteker();
        super.getPosisisteker();
        super.getKabelLcd();
        super.getKondisiKabelLcd();
        super.getPosisiKabelLcd();
        super.getLampu();
        super.getKondisilampu();
        super.getPosisilampu();
        super.getKipas();
        super.getKondisikipas();
        super.getPosisikipas();
        super.getAc();
        super.getKondisiac();
        super.getPosisiac();
        super.getSSID();
        super.getInternet();
        super.getCctv();
        super.getKondisicctv();
        super.getPosisicctv();
    }
    
}
