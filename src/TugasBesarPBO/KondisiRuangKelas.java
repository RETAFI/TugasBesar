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
public class KondisiRuangKelas extends KondisiRuangKelasSG{
    Scanner fikri = new Scanner(System.in);
    public KondisiRuangKelas(int PanjangRuang, int LebarRuang, int JumKursi, int JumPintu, int JumJendela) {
        super(PanjangRuang, LebarRuang, JumKursi, JumPintu, JumJendela);
    }

    @Override
    public void Input() {
            System.out.print("Masukkan Panjang Ruangan : ");
            super.setPanjangRuang(fikri.nextInt());
            System.out.print("Masukkan Lebar Ruangan :  ");
            super.setLebarRuang(fikri.nextInt());
            System.out.print("Masukkan Jumlah Kursi :  ");
            super.setJumKursi(fikri.nextInt());
            System.out.print("Masukkan Jumlah Pintu : ");
            super.setJumPintu(fikri.nextInt());
            System.out.print("Masukkan Jumlah Jendela : ");
            super.setJumJendela(fikri.nextInt());
            System.out.print("\n");
       
    }

    @Override
    public int AnalisisLuasRuang() {
        setLuasRuang(getPanjangRuang()*getLebarRuang());
                System.out.println("Luas Ruangan adalah "+getLuasRuang());
                if(getPanjangRuang()!=getLuasRuang()){ 
                    System.out.println("Persegi Panjang (sesuai)");
                }
                    else{
                        System.out.println("tapi bukan Persegi Panjang (tidak sesuai)");
                }
        return getLuasRuang();
    }

    @Override
    public double AnalisisRasioLuas() {
        setRasio(getLuasRuang()*getJumKursi());
                System.out.println("Rasio Luas adalah "+getRasio());
                if(getRasio()>=0.5){
                    System.out.println("Luas Rasio (Sesuai)");
                }
                    else{
                        System.out.println("Luas Rasio (Tidak Luas)");
                }
        return getRasio();
    }

    @Override
    public int AnalisisPintu() {
        //System.out.println("Jumlah Pintu ada "+getJumPintu());
                if (getJumPintu()>=2){
                    System.out.println("Jumlah Pintu (Sesuai)");
                }
                    else{
                        System.out.println("Jumlah Pintu (Tidak Sesuai)");
                }
        return getJumPintu();
    }

    @Override
    public int AnalisisJendela() {
        //System.out.println("Jumlah Jendela "+getJumJendela());
        if (getJumJendela()>=1){
                    System.out.println("Jumlah Jendela (Sesuai)");
                }
                    else{
                        System.out.println("Jumlah Jendela (Tidak Sesuai)");
                }
        return getJumJendela();
    }

    @Override
    public void Output() {
        super.getPanjangRuang();
        super.getLebarRuang();
        super.getLuasRuang();
        super.getJumKursi();
        super.getJumPintu();
        super.getJumJendela();
    }
      
    
}
