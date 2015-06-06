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
public abstract class IdentitasRuangKelasSG {
    private String NamaRuang;
    private String LokasiRuang;
    private String Fakultas;
    
    public IdentitasRuangKelasSG(String NamaRuang, String LokasiRuang, String Fakultas) {
        this.NamaRuang = NamaRuang;
        this.LokasiRuang = LokasiRuang;
        this.Fakultas = Fakultas;
    }

    public String getNamaRuang() {
        return NamaRuang;
    }

    public void setNamaRuang(String NamaRuang) {
        this.NamaRuang = NamaRuang;
    }

    public String getLokasiRuang() {
        return LokasiRuang;
    }

    public void setLokasiRuang(String LokasiRuang) {
        this.LokasiRuang = LokasiRuang;
    }

    public String getFakultas() {
        return Fakultas;
    }

    public void setFakultas(String Fakultas) {
        this.Fakultas = Fakultas;
    }
 
    public abstract void Input();
    public abstract void Output();
    
}
