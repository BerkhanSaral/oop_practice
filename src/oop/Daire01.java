package oop;

public class Daire01 extends Kat implements DaireBilgisi, KapiBilgisi {//iç dizaynini bildigimiz daireler icin

    public String isim;
    public String soyIsim;
    public int kisiSayisi;
    public String mutfakTipi;
    public String kacinciKat = "zemin katta";
    public int dusSayisi;
    public int lavaboSayisi;
    public  int daireNo;

    public Daire01(String isim, String soyIsim, int kisiSayisi, String mutfakTipi, String kacinciKat, int dusSayisi, int lavaboSayisi) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.kisiSayisi = kisiSayisi;
        this.mutfakTipi = mutfakTipi;
        this.kacinciKat = kacinciKat;
        this.dusSayisi = dusSayisi;
        this.lavaboSayisi = lavaboSayisi;
        sayac++;
        this.daireNo =sayac;
    }

    @Override
    public void kacinciKat() {
        System.out.println("Daire " + kacinciKat + " bulunuyor");
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
        return "Daire01{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", kisiSayisi=" + kisiSayisi +
                ", mutfakTipi='" + mutfakTipi + '\'' +
                ", kacinciKat='" + kacinciKat + '\'' +
                ", dusSayisi=" + dusSayisi +
                ", lavaboSayisi=" + lavaboSayisi +
                ", daireNo=" + daireNo +
                '}';
    }
}