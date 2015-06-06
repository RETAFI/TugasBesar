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
public abstract class LingkunganRuangKelasSG {
    
    public abstract void Input();
    public abstract String AnalisisKoLantai();
    public abstract String AnalisisKoDinding();
    public abstract String AnalisisKoAtap();
    public abstract String AnalisisKoPintu();
    public abstract String AnalisisKoJendela();
    public abstract void output();
    
    private String KoLantai;
    private String KoDinding;
    private String KoAtap;
    private String KoPintu;
    private String KoJendela;

    public LingkunganRuangKelasSG(String KoLantai, String KoDinding, String KoAtap, String KoPintu, String KoJendela) {
        this.KoLantai = KoLantai;
        this.KoDinding = KoDinding;
        this.KoAtap = KoAtap;
        this.KoPintu = KoPintu;
        this.KoJendela = KoJendela;
    }

    public String getKoLantai() {
        return KoLantai;
    }

    public void setKoLantai(String KoLantai) {
        this.KoLantai = KoLantai;
    }

    public String getKoDinding() {
        return KoDinding;
    }

    public void setKoDinding(String KoDinding) {
        this.KoDinding = KoDinding;
    }

    public String getKoAtap() {
        return KoAtap;
    }

    public void setKoAtap(String KoAtap) {
        this.KoAtap = KoAtap;
    }

    public String getKoPintu() {
        return KoPintu;
    }

    public void setKoPintu(String KoPintu) {
        this.KoPintu = KoPintu;
    }

    public String getKoJendela() {
        return KoJendela;
    }

    public void setKoJendela(String KoJendela) {
        this.KoJendela = KoJendela;
    }
    
}
