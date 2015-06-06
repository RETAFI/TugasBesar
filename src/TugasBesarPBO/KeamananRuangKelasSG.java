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
public abstract class KeamananRuangKelasSG {
    
    public abstract void Input();
    public abstract String AnalisisKekokohan();
    public abstract String AnalisisKunciPintu();
    public abstract String AnalisisJendela();
    public abstract String AnalisisBahaya();
    public abstract void Output();
    
    private String Kekokohan;
    private String KunciPintu;
    private String Jendela;
    private String Bahaya;

    public KeamananRuangKelasSG(String Kekokohan, String KunciPintu, String Jendela, String Bahaya) {
        this.Kekokohan = Kekokohan;
        this.KunciPintu = KunciPintu;
        this.Jendela = Jendela;
        this.Bahaya = Bahaya;
    }

    public String getKekokohan() {
        return Kekokohan;
    }

    public void setKekokohan(String Kekokohan) {
        this.Kekokohan = Kekokohan;
    }

    public String getKunciPintu() {
        return KunciPintu;
    }

    public void setKunciPintu(String KunciPintu) {
        this.KunciPintu = KunciPintu;
    }

    public String getJendela() {
        return Jendela;
    }

    public void setJendela(String Jendela) {
        this.Jendela = Jendela;
    }

    public String getBahaya() {
        return Bahaya;
    }

    public void setBahaya(String Bahaya) {
        this.Bahaya = Bahaya;
    }
    
    
    
}
