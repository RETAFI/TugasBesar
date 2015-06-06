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
public abstract class KondisiRuangKelasSG {
    private int PanjangRuang;
    private int LebarRuang;
    private int LuasRuang ;
    private int JumKursi;
    private double Rasio ;
    private int JumPintu;
    private int JumJendela;

    public KondisiRuangKelasSG(int PanjangRuang, int LebarRuang, int JumKursi, int JumPintu, int JumJendela) {
        this.PanjangRuang = PanjangRuang;
        this.LebarRuang = LebarRuang;
        this.JumKursi = JumKursi;
        this.JumPintu = JumPintu;
        this.JumJendela = JumJendela;
    }
    
    public int getPanjangRuang() {
        return PanjangRuang;
    }

    public void setPanjangRuang(int PanjangRuang) {
        this.PanjangRuang = PanjangRuang;
    }

    public int getLebarRuang() {
        return LebarRuang;
    }

    public void setLebarRuang(int LebarRuang) {
        this.LebarRuang = LebarRuang;
    }

    public int getLuasRuang() {
        return LuasRuang;
    }

    public void setLuasRuang(int LuasRuang) {
        this.LuasRuang = LuasRuang;
    }

    public int getJumKursi() {
        return JumKursi;
    }

    public void setJumKursi(int JumKursi) {
        this.JumKursi = JumKursi;
    }

    public double getRasio() {
        return Rasio;
    }

    public void setRasio(double Rasio) {
        this.Rasio = Rasio;
    }

    public int getJumPintu() {
        return JumPintu;
    }

    public void setJumPintu(int JumPintu) {
        this.JumPintu = JumPintu;
    }

    public int getJumJendela() {
        return JumJendela;
    }

    public void setJumJendela(int JumJendela) {
        this.JumJendela = JumJendela;
    }
    
    
    public abstract void Input();
    public abstract int AnalisisLuasRuang();
    public abstract double AnalisisRasioLuas();
    public abstract int AnalisisPintu();
    public abstract int AnalisisJendela();
    public abstract void Output();
}
