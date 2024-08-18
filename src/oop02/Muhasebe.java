package oop02;

import java.time.LocalDate;

public class Muhasebe extends IK{
    //muhasebeye ozgu pasif ozellikler
    private String sirketHarcamalari;
    private String gelirler;
    private String musteriBilgileri;
    private String yillikFinansDurumu;


    //calısan kişiler icin gerekli pasif ozellikler
    public double maas;//(calismaSaati*saatBasinaUcret*CalistigiGunSayisi)+(mesai*saatBasinaUcret*2);
    public double mesai;
    public int izinGunu;
    public double prim;
    public double calismaSaati;
    public double saatBasinaUcret;
    public int calistigiGunSayisi;
    public int izinsizIseGelmeme;



    //public int tazminat;//isten cıkarma methodu icin ekledik

    //aktif ozellikler
    public void maasHesapla(){
        this.maas=(this.calismaSaati*this.saatBasinaUcret*this.calistigiGunSayisi)
                +(this.mesai*this.saatBasinaUcret*2)
                -(this.izinsizIseGelmeme*this.calismaSaati*this.saatBasinaUcret*2);
    }


    public Muhasebe(String isim, String soyIsim, String telefon, String adres, String calismaAlani, LocalDate dogumTarihi, double mesai, int izinGunu, double prim, double calismaSaati, double saatBasinaUcret, int calistigiGunSayisi, int izinsizIseGelmeme) {
        super(isim, soyIsim, telefon, adres, calismaAlani, dogumTarihi);
        this.mesai = mesai;
        this.izinGunu = izinGunu;
        this.prim = prim;
        this.calismaSaati = calismaSaati;
        this.saatBasinaUcret = saatBasinaUcret;
        this.calistigiGunSayisi = calistigiGunSayisi;
        this.izinsizIseGelmeme = izinsizIseGelmeme;
        maasHesapla();
    }

    @Override
    public String toString() {
        return "Muhasebe{" +
                "maas=" + maas +
                ", mesai=" + mesai +
                ", izinGunu=" + izinGunu +
                ", prim=" + prim +
                ", calismaSaati=" + calismaSaati +
                ", saatBasinaUcret=" + saatBasinaUcret +
                ", calistigiGunSayisi=" + calistigiGunSayisi +
                ", izinsizIseGelmeme=" + izinsizIseGelmeme +
                ", id=" + id +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", telefon='" + telefon + '\'' +
                ", adres='" + adres + '\'' +
                ", calismaAlani='" + calismaAlani + '\'' +
                ", bilgilendirme='" + bilgilendirme + '\'' +
                ", dogumTarihi=" + dogumTarihi +
                '}';
    }
}
