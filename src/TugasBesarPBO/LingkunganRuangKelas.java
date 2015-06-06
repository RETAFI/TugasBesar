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
public class LingkunganRuangKelas extends LingkunganRuangKelasSG{
    Scanner fikri = new Scanner(System.in);
    public LingkunganRuangKelas(String KoLantai, String KoDinding, String KoAtap, String KoPintu, String KoJendela) {
        super(KoLantai, KoDinding, KoAtap, KoPintu, KoJendela);
    }

    @Override
    public void Input() {
        System.out.print("bagaimana kondisi lantai : ");
        setKoLantai(fikri.nextLine());
        System.out.print("bagaimana kondisi dinding : ");
        setKoDinding(fikri.nextLine());
        System.out.print("bagaimana kondisi atap : ");
        setKoAtap(fikri.nextLine());
        System.out.print("bagaimana kondisi pintu : ");
        setKoPintu(fikri.nextLine());
        System.out.print("bagaimana kondisi jendela : ");
        setKoJendela(fikri.nextLine());
        System.out.print("\n");
    
    }

    @Override
    public String AnalisisKoLantai() {
        if("bersih".equals(getKoLantai())    || "Bersih".equals(getKoLantai())) {
            System.out.println("Kondisi Lantai Bersih(Sesuai)");
        }
        else if ("tidak bersih".equals(getKoLantai()) || "Tidak Bersih".equals(getKoLantai())){
            System.out.println("Kondisi Lantai Tidak Bersih (Tidak Sesuai)");
        }
        else{
            System.out.println("(Inputan Salah)");
        }
        return super.getKoLantai();
    }
    
    @Override
    public String AnalisisKoDinding() {
        if("bersih".equals(getKoDinding())    || "Bersih".equals(getKoDinding())) {
            System.out.println("Kondisi Dinding Bersih (Sesuai)");
        }
        else if ("tidak bersih".equals(getKoDinding()) || "Tidak Bersih".equals(getKoDinding())){
            System.out.println("Kondisi Dinding Tidak Bersih (Tidak Sesuai)");
        }
        else{
            System.out.println("(Inputan Salah)");
        }
        return super.getKoDinding();
    }

    @Override
    public String AnalisisKoAtap() {
        if("bersih".equals(getKoAtap())    || "Bersih".equals(getKoAtap())) {
            System.out.println("Kondisi Atap Bersih (Sesuai)");
        }
        else if ("tidak bersih".equals(getKoAtap()) || "Tidak Bersih".equals(getKoAtap())){
            System.out.println("Kondisi Atap Tidak Bersih (Tidak Sesuai)");
        }
        else{
            System.out.println("(Inputan Salah)");
        }
        return super.getKoAtap();
    }

    @Override
    public String AnalisisKoPintu() {
        if("bersih".equals(getKoPintu())    || "Bersih".equals(getKoPintu())) {
            System.out.println("Kondisi Pintu Bersih (Sesuai)");
        }
        else if ("tidak bersih".equals(getKoPintu()) || "Tidak Bersih".equals(getKoPintu())){
            System.out.println("Kondisi Pintu Tidak Bersih (Tidak Sesuai)");
        }
        else{
            System.out.println("(Inputan Salah)");
        }
        return super.getKoPintu();
    }

    @Override
    public String AnalisisKoJendela() {
        if("bersih".equals(getKoJendela())    || "Bersih".equals(getKoJendela())) {
            System.out.println("Kondisi Jendela Bersih (Sesuai)");
        }
        else if ("tidak bersih".equals(getKoJendela()) || "Tidak Bersih".equals(getKoJendela())){
            System.out.println("Kondisi Lantai Tidak Bersih (Tidak Sesuai)");
        }
        else{
            System.out.println("(Inputan Salah)");
        }
        return super.getKoJendela();
    }
    
    @Override
    public void output() {
        super.getKoLantai();
        super.getKoDinding();
        super.getKoAtap();
        super.getKoPintu();
        super.getKoJendela();
    }

}

