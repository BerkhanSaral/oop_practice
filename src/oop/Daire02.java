package oop;

public class Daire02 extends Kat implements KapiBilgisi{//iç dizaynini bilmedigimiz daireler icin

    public String isim;
    public String soyIsim;
    //public int kisiSayisi;
    //public String mutfakTipi;
    public String kacinciKat="zemin katta";
    //public int dusSayisi;
    //public int lavaboSayisi;
    public  int daireNo;

    public Daire02(String isim, String soyIsim, String kacinciKat) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.kacinciKat = kacinciKat;
        sayac++;
        this.daireNo = sayac;
    }

    @Override
    public void kacinciKat() {
        System.out.println("Daire "+kacinciKat+" bulunuyor");
    }

    @Override
    public void kapiTuru() {
        System.out.println("Dairelerde demir Kapı bulunuyor");
    }

    @Override
    public void zilSesi() {
        System.out.println("Dairelerde Kuğu sesi Kullanılıyor");
    }

    @Override
    public String toString() {
        return "Daire02{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", kacinciKat='" + kacinciKat + '\'' +
                ", daireNo=" + daireNo +
                ", mahalle='" + mahalle + '\'' +
                ", sokak='" + sokak + '\'' +
                ", kapiNo=" + kapiNo +
                ", Apartman name='" + name + '\'' +
                '}';
    }
}