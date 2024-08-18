package oop02;

import java.time.LocalDate;

public class Isci extends Muhasebe implements CalisanBilgisi{
    public String statu="İşçi";

    public static double saatBasinaUcret=45;

    public static int calismaSaati=8;

    public Isci(String isim, String soyIsim, String telefon, String adres, String calismaAlani, LocalDate dogumTarihi, double mesai, int izinGunu, double prim, int calistigiGunSayisi, int izinsizIseGelmeme) {
        super(isim, soyIsim, telefon, adres, calismaAlani, dogumTarihi, mesai, izinGunu, prim, calismaSaati, saatBasinaUcret, calistigiGunSayisi, izinsizIseGelmeme);
    }


    @Override
    public String toString() {
        return "Isci{" +
                ", id=" + id +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", telefon='" + telefon + '\'' +
                ", adres='" + adres + '\'' +
                ", calismaAlani='" + calismaAlani + '\'' +
                ", bilgilendirme='" + bilgilendirme + '\'' +
                ", dogumTarihi=" + dogumTarihi +
                "statu='" + statu + '\'' +
                ",\nMuhasebe birimine baglandiniz : maas=" + maas +
                ", mesai=" + mesai +
                ", izinGunu=" + izinGunu +
                ", prim=" + prim +
                ", calismaSaati=" + calismaSaati +
                ", saatBasinaUcret=" + saatBasinaUcret +
                ", calistigiGunSayisi=" + calistigiGunSayisi +
                ", izinsizIseGelmeme=" + izinsizIseGelmeme +
                '}';
    }
    @Override
    public void izin(int gunSayisi) {
        this.izinGunu=gunSayisi;
        this.calistigiGunSayisi-=this.izinGunu;
        maasHesapla();
    }
    @Override
    public void mesai(int mesai) {
        this.mesai=mesai;
        maasHesapla();
    }
    @Override
    public void saatUcreti(double ucret) {
        super.saatBasinaUcret=ucret;
        maasHesapla();
    }
    @Override
    public void calismaSaati(int saat) {
        super.calismaSaati=saat;
        maasHesapla();
    }
}