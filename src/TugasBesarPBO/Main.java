/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TugasBesarPBO;

import java.io.File;
import java.io.*;

/**
 *
 * @author Fikri
 */
public class Main {
    public static void main(String[] args) {
        IdentitasRuangKelas a = new IdentitasRuangKelas(null, null, null);
        KondisiRuangKelas b = new KondisiRuangKelas(100,100,100,2,1);
        KondisiPosisiSarana c = new KondisiPosisiSarana(4, null, null, 1, null, null, 18, null, null, 2, null, null, 1, null, null, null, null, 2, null, null);
        LingkunganRuangKelas d = new LingkunganRuangKelas(null, null, null, null, null);
        KebersihanRuangKelas e = new KebersihanRuangKelas(null, 250, 70, 25);
        KenyamananRuangKelas f = new KenyamananRuangKelas(null, null, null, null, null);
        KeamananRuangKelas g = new KeamananRuangKelas(null, null, null, null);
        a.Input();
        b.Input();
        c.Input();
        d.Input();
        e.input();
        f.Input();
        g.Input();
        a.Output();
        b.Output();
        c.Output();
        d.output();
        e.Output();
        f.Output();
        g.Output();
        b.AnalisisLuasRuang();
        b.AnalisisRasioLuas();
        b.AnalisisPintu();
        b.AnalisisJendela();
        c.JumStekler();
        c.KondisiStekler();
        c.PosisiStekler();
        c.JumKabelLCD();
        c.KondisiKabelLCD();
        c.PosisiKabelLCD();
        c.JumLampu();
        c.KondisiLampu();
        c.PosisiLampu();
        c.JumKipas();
        c.KondisiKipas();
        c.PosisiKipas();
        c.JumAC();
        c.KondisiAC();
        c.PosisiAC();
        c.SSID();
        c.Bandwidth();
        c.JumCCTV();
        c.KondisiCCTV();
        c.PosisiCCTV();
        d.AnalisisKoLantai();
        d.AnalisisKoDinding();
        d.AnalisisKoAtap();
        d.AnalisisKoPintu();
        d.AnalisisKoJendela();
        e.AnalisisSirUdara();
        e.AnalisisPencahayaan();
        e.AnalisisKelembapan();
        e.AnalisisSuhu();
        f.AnalisisKebisingan();
        f.AnalisisBau();
        f.AnalisisBocor();
        f.AnalisisRusak();
        f.AnalisisAus();
        g.AnalisisKekokohan();
        g.AnalisisKunciPintu();
        g.AnalisisJendela();
        g.AnalisisBahaya();
        
        try {
            File data = new File("Tugas Besar.txt");
            try (PrintWriter tb = new PrintWriter(new FileWriter(data,false))) {
                tb.println(a.getNamaRuang());tb.println(a.getLokasiRuang());tb.println(a.getLokasiRuang());
                tb.println(b.AnalisisLuasRuang()); tb.println(b.AnalisisRasioLuas()); tb.println(b.AnalisisPintu());tb.println(b.AnalisisJendela());
                tb.println(c.JumStekler());tb.println(c.KondisiStekler());tb.println(c.PosisiStekler());tb.println(c.JumKabelLCD());tb.println(c.KondisiKabelLCD());tb.println(c.PosisiKabelLCD());tb.println(c.JumLampu());tb.println(c.KondisiLampu());tb.println(c.PosisiLampu());tb.println(c.JumKipas());tb.println(c.KondisiKipas());tb.println(c.PosisiKipas());tb.println(c.JumAC());tb.println(c.KondisiAC());tb.println(c.PosisiAC());tb.println(c.SSID());tb.println(c.Bandwidth());tb.println(c.JumCCTV());tb.println(c.KondisiCCTV());tb.println(c.PosisiCCTV());
                tb.println(d.AnalisisKoLantai());tb.println(d.AnalisisKoDinding());tb.println(d.AnalisisKoAtap());tb.println(d.AnalisisKoPintu());tb.println(d.AnalisisKoJendela());
                tb.println(e.AnalisisSirUdara());tb.println(e.AnalisisPencahayaan());tb.println(e.AnalisisKelembapan());tb.println(e.AnalisisSuhu());
                tb.println(f.AnalisisKebisingan());tb.println(f.AnalisisBau());tb.println(f.AnalisisBocor());tb.println(f.AnalisisRusak());tb.println(f.AnalisisAus());
                tb.println(g.AnalisisKekokohan());tb.println(g.AnalisisKunciPintu());tb.println(g.AnalisisJendela());tb.println(g.AnalisisBahaya());
            }
        } catch (Exception qw) {
            System.out.println(" Salaaaahhh :D ");
        }

     }
}
