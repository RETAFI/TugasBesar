/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TugasBesarPBO;

/**
 *
 * @author Fikri
 */
public abstract class KondisiPosisiSaranaSG {
    
    public abstract void Input();
    public abstract int JumStekler();
    public abstract String KondisiStekler();
    public abstract String PosisiStekler();
    public abstract int JumKabelLCD();
    public abstract String KondisiKabelLCD();
    public abstract String PosisiKabelLCD();
    public abstract int JumLampu();
    public abstract String KondisiLampu();
    public abstract String PosisiLampu();
    public abstract int JumKipas();
    public abstract String KondisiKipas();
    public abstract String PosisiKipas();
    public abstract int JumAC();
    public abstract String KondisiAC();
    public abstract String PosisiAC();
    public abstract String SSID();
    public abstract String Bandwidth();
    public abstract int JumCCTV();
    public abstract String KondisiCCTV();
    public abstract String PosisiCCTV();
    public abstract void Output();

    private int Steker;
    private String Kondisisteker;
    private String Posisisteker;
    private int KabelLcd;
    private String KondisiKabelLcd;
    private String PosisiKabelLcd;
    private int Lampu;
    private String Kondisilampu;
    private String Posisilampu;
    private int Kipas;
    private String Kondisikipas;
    private String Posisikipas;
    private int Ac;
    private String Kondisiac;
    private String Posisiac;
    private String SSID;
    private String internet;
    private int Cctv;
    private String Kondisicctv;
    private String Posisicctv;

    public KondisiPosisiSaranaSG(int Steker, String Kondisisteker, String Posisisteker, int KabelLcd, String KondisiKabelLcd, String PosisiKabelLcd, int Lampu, String Kondisilampu, String Posisilampu, int Kipas, String Kondisikipas, String Posisikipas, int Ac, String Kondisiac, String Posisiac, String SSID, String internet, int Cctv, String Kondisicctv, String Posisicctv) {
        this.Steker = Steker;
        this.Kondisisteker = Kondisisteker;
        this.Posisisteker = Posisisteker;
        this.KabelLcd = KabelLcd;
        this.KondisiKabelLcd = KondisiKabelLcd;
        this.PosisiKabelLcd = PosisiKabelLcd;
        this.Lampu = Lampu;
        this.Kondisilampu = Kondisilampu;
        this.Posisilampu = Posisilampu;
        this.Kipas = Kipas;
        this.Kondisikipas = Kondisikipas;
        this.Posisikipas = Posisikipas;
        this.Ac = Ac;
        this.Kondisiac = Kondisiac;
        this.Posisiac = Posisiac;
        this.SSID = SSID;
        this.internet = internet;
        this.Cctv = Cctv;
        this.Kondisicctv = Kondisicctv;
        this.Posisicctv = Posisicctv;
    }
    

    public int getSteker() {
        return Steker;
    }

    public void setSteker(int Steker) {
        this.Steker = Steker;
    }

    public String getKondisisteker() {
        return Kondisisteker;
    }

    public void setKondisisteker(String Kondisisteker) {
        this.Kondisisteker = Kondisisteker;
    }

    public String getPosisisteker() {
        return Posisisteker;
    }

    public void setPosisisteker(String Posisisteker) {
        this.Posisisteker = Posisisteker;
    }

    public int getKabelLcd() {
        return KabelLcd;
    }

    public void setKabelLcd(int KabelLcd) {
        this.KabelLcd = KabelLcd;
    }

    public String getKondisiKabelLcd() {
        return KondisiKabelLcd;
    }

    public void setKondisiKabelLcd(String KondisiKabelLcd) {
        this.KondisiKabelLcd = KondisiKabelLcd;
    }

    public String getPosisiKabelLcd() {
        return PosisiKabelLcd;
    }

    public void setPosisiKabelLcd(String PosisiKabelLcd) {
        this.PosisiKabelLcd = PosisiKabelLcd;
    }

    public int getLampu() {
        return Lampu;
    }

    public void setLampu(int Lampu) {
        this.Lampu = Lampu;
    }

    public String getKondisilampu() {
        return Kondisilampu;
    }

    public void setKondisilampu(String Kondisilampu) {
        this.Kondisilampu = Kondisilampu;
    }

    public String getPosisilampu() {
        return Posisilampu;
    }

    public void setPosisilampu(String Posisilampu) {
        this.Posisilampu = Posisilampu;
    }

    public int getKipas() {
        return Kipas;
    }

    public void setKipas(int Kipas) {
        this.Kipas = Kipas;
    }

    public String getKondisikipas() {
        return Kondisikipas;
    }

    public void setKondisikipas(String Kondisikipas) {
        this.Kondisikipas = Kondisikipas;
    }

    public String getPosisikipas() {
        return Posisikipas;
    }

    public void setPosisikipas(String Posisikipas) {
        this.Posisikipas = Posisikipas;
    }

    public int getAc() {
        return Ac;
    }

    public void setAc(int Ac) {
        this.Ac = Ac;
    }

    public String getKondisiac() {
        return Kondisiac;
    }

    public void setKondisiac(String Kondisiac) {
        this.Kondisiac = Kondisiac;
    }

    public String getPosisiac() {
        return Posisiac;
    }

    public void setPosisiac(String Posisiac) {
        this.Posisiac = Posisiac;
    }

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
    }

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        this.internet = internet;
    }

    public int getCctv() {
        return Cctv;
    }

    public void setCctv(int Cctv) {
        this.Cctv = Cctv;
    }

    public String getKondisicctv() {
        return Kondisicctv;
    }

    public void setKondisicctv(String Kondisicctv) {
        this.Kondisicctv = Kondisicctv;
    }

    public String getPosisicctv() {
        return Posisicctv;
    }

    public void setPosisicctv(String Posisicctv) {
        this.Posisicctv = Posisicctv;
    }
    
    
}
