package oop02;

import java.time.LocalDate;

public class Memur extends Muhasebe implements CalisanBilgisi{
    public static double saatBasinaUcret=100;
    public static int calismaSaati=7;
    public static int calistigiGunSayisi=22;
    public static String calismaAlani="Belediye";


    public Memur(String isim, String soyIsim, String telefon, String adres, LocalDate dogumTarihi, double mesai, int izinGunu, double prim, int izinsizIseGelmeme) {
        super(isim, soyIsim, telefon, adres, Memur.calismaAlani, dogumTarihi, mesai, izinGunu, prim, Memur.calismaSaati, Memur.saatBasinaUcret, Memur.calistigiGunSayisi, izinsizIseGelmeme);
    }


    @Override
    public void izin(int gunSayisi) {
        super.izinGunu=gunSayisi;
        super.calistigiGunSayisi-=gunSayisi;//asıl calistigiGunSayisi isimli variable muhasabe classına baglı oldugu icin super cagrısı kullandım
        maasHesapla();
    }
    @Override
    public void mesai(int mesai) {
        super.mesai=mesai;
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

    @Override
    public String toString() {
        return "Memur bilgileri{" +
                ", id=" + id +
                ", isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", telefon='" + telefon + '\'' +
                ", adres='" + adres + '\'' +
                ", calismaAlani='" + super.calismaAlani + '\'' +
                ", dogumTarihi=" + dogumTarihi +'\''  +
                "\n bilgilendirme icin muhasebe kismina baglanildi : maas=" + maas +
                ", mesai=" + mesai +
                ", izinGunu=" + izinGunu +
                ", prim=" + prim +
                ", calismaSaati=" + super.calismaSaati +//super cagrisi ile obje baglı olan muhasabedeki degere gidicek
                ", saatBasinaUcret=" + super.saatBasinaUcret +
                ", calistigiGunSayisi=" + super.calistigiGunSayisi +
                ", izinsizIseGelmeme=" + izinsizIseGelmeme +
                '}';
    }
}
