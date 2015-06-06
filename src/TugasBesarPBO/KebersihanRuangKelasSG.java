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
public abstract class KebersihanRuangKelasSG {
    private String SirUdara;
    private int NilaiPencahayaan;
    private int Kelembapan;
    private int Suhu;

    public KebersihanRuangKelasSG(String SirUdara, int NilaiPencahayaan, int Kelembapan, int Suhu) {
        this.SirUdara = SirUdara;
        this.NilaiPencahayaan = NilaiPencahayaan;
        this.Kelembapan = Kelembapan;
        this.Suhu = Suhu;
    }

    public String getSirUdara() {
        return SirUdara;
    }

    public void setSirUdara(String SirUdara) {
        this.SirUdara = SirUdara;
    }

    public int getNilaiPencahayaan() {
        return NilaiPencahayaan;
    }

    public void setNilaiPencahayaan(int NilaiPencahayaan) {
        this.NilaiPencahayaan = NilaiPencahayaan;
    }

    public int getKelembapan() {
        return Kelembapan;
    }

    public void setKelembapan(int Kelembapan) {
        this.Kelembapan = Kelembapan;
    }

    public int getSuhu() {
        return Suhu;
    }

    public void setSuhu(int Suhu) {
        this.Suhu = Suhu;
    }
    
    public abstract void input();
    public abstract String AnalisisSirUdara();
    public abstract int AnalisisPencahayaan();
    public abstract int AnalisisKelembapan();
    public abstract int AnalisisSuhu();
    public abstract void Output();
    
}
