package oop;

import java.time.LocalDate;

public class Apartman {//parent pojo class
    /*
    pasif temel ozellikler
     */
    public String mahalle = "Java";
    public String sokak = "Developer";
    public int kapiNo = 52;
    public String name = "TechPro";
    //daire childlari icin tekrar tekrar olusturmamamiz icin gerekli pasif ozellikler
    public boolean aidatOdendiMi = false;
    public static final String aidat = "Aidat 500TL olarak ayarlanmıştır";
    LocalDate aidatOdemeTarihi = LocalDate.MIN;

    //aktif ozellikler
    public void temelBilgi() {
        System.out.println("Apartman 4 katlıdır ve 2 giriş çıkışı vardır.");
        System.out.println("Bahçesinde şadırvan barindirir ve küçük bir oyun alanı vardır.");
        System.out.println("16 Araçlık park yeri bulunmaktadır.");
        System.out.println("Merkezi konumdadır ve Metroya 5 dk yürüme mesafesindedir.");
        System.out.println("Bina yaşı 3'tür.");
    }

    //daire childlari icin tekrar tekrar olusturmamamiz icin gerekli aktif ozellikler
    public void aidatOde() {
        if (aidatOdendiMi) {
            System.out.println("Siz zaten aidatı önceden ödediniz bir dahaki ay görüşmek üzere...");
        } else {
            System.out.println("Aidati şimdi ödediğiniz için teşekkürler bir dahaki ay görüşmek üzere...");
            aidatOdendiMi = true;
            aidatOdemeTarihi = LocalDate.of(2024, 4, 25);
            System.out.println(aidatOdemeTarihi);
        }
    }

    //kullanıcı aidati 3 ay boyunca odemezse olusacak bir uyari
    public void aidatBilgisi() {
        LocalDate date = LocalDate.now();
        if (date.getDayOfMonth() == 15) {
            System.out.println("Ayın 15'i olduğu için aidat bilgileriniz 0'landı...");
            aidatOdendiMi = false;
        }
        if (date.getMonthValue() - aidatOdemeTarihi.getMonthValue() >= 3) {//kaçıncı ay oldugu bilgisi
            System.err.println("3 ve daha fazla aydır aidat ödemesi yapmıyorsunuz lütfen ödemeleri getiriniz yoksa gerekli yerlere başvuru yapılacaktır...");
        }
        if (aidatOdendiMi) {
            System.out.println("Aidati ödenmiş daire");
        } else {
            System.out.println("Aidati ödenmemiş daire");
        }

    }


}