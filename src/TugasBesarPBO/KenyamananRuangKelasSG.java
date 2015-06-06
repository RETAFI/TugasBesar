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
public abstract class KenyamananRuangKelasSG {
    
    public abstract void Input ();
    public abstract String AnalisisKebisingan();
    public abstract String AnalisisBau();
    public abstract String AnalisisBocor();
    public abstract String AnalisisRusak();
    public abstract String AnalisisAus();
    public abstract void Output ();
    
    private String Kebisingan;
    private String Bau;
    private String Kebocoran;
    private String Kerusakan;
    private String Keausan;

    public KenyamananRuangKelasSG(String Kebisingan, String Bau, String Kebocoran, String Kerusakan, String Keausan) {
        this.Kebisingan = Kebisingan;
        this.Bau = Bau;
        this.Kebocoran = Kebocoran;
        this.Kerusakan = Kerusakan;
        this.Keausan = Keausan;
    }
    
    
    public String getKebisingan() {
        return Kebisingan;
    }

    public void setKebisingan(String Kebisingan) {
        this.Kebisingan = Kebisingan;
    }

    public String getBau() {
        return Bau;
    }

    public void setBau(String Bau) {
        this.Bau = Bau;
    }

    public String getKebocoran() {
        return Kebocoran;
    }

    public void setKebocoran(String Kebocoran) {
        this.Kebocoran = Kebocoran;
    }

    public String getKerusakan() {
        return Kerusakan;
    }

    public void setKerusakan(String Kerusakan) {
        this.Kerusakan = Kerusakan;
    }

    public String getKeausan() {
        return Keausan;
    }

    public void setKeausan(String Keausan) {
        this.Keausan = Keausan;
    }
    

}
