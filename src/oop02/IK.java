package oop02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class IK {
    //pasif ozellikleri
    List<Memur> memurList=new ArrayList<>();
    List<Isci> isciList=new ArrayList<>();

    public static int sayac=100;
    public int id;//id atama işlemini otomatik en son yapıcaz!!!
    public String isim;
    public String soyIsim;
    public String telefon;
    public String adres;
    public String calismaAlani;
    public String bilgilendirme="Merhabalar I.K(insan kaynakları) bölümüne bağlandınız";
    public LocalDate dogumTarihi;

    private int calisanSayisi=100;
    //aktif ozellikler...
    public void iseAlma(Memur memur){
        // System.out.println("Merhabalar Techpro Education'a hoşgeldiniz işe alınmak icin asagidaki formu doldurunuz");
        // System.out.println(".....");//forma giden link gibi dusenebilirsiniz
        memurList.add(memur);
    }
    public void iseAlma(Isci isci){
        // System.out.println("Merhabalar Techpro Education'a hoşgeldiniz işe alınmak icin asagidaki formu doldurunuz");
        // System.out.println(".....");//forma giden link gibi dusenebilirsiniz
        isciList.add(isci);
    }
    public void istenCikarma(int id){//size odev!!!
        // if (id==this.id){
        //     System.out.println(this.isim+" isimli arkadasimiz bizimle veda etti.");
        //     System.out.println(".....");//gerekli islemler
        //     calisanSayisi--;
        //     System.out.println("calisanSayisi = " + calisanSayisi);
        // }else {
        //     System.out.println("bu id'ye sahip herhangi bir deger bulunamadi.");
        // }
        boolean idBulunduMu=false;
        //for (Isci isci:isciList
        //     ) {
        //    if(isci.id==id){
        //        isciList.remove(isci);
        //        System.out.println(isci.isim+" isimli arkadasimiz isine veda etti.");
        //        idBulunduMu=true;
        //    }
        //}
        for (int i = 0; i <memurList.size() ; i++) {
            if (memurList.get(i).id==id){
                memurList.remove(memurList.get(i));
                System.out.println(memurList.get(i).isim+" isimli arkadasimiz isine veda etti.");
                idBulunduMu=true;
            }
        }
        if (!idBulunduMu){
            System.out.println("bu id'ye sahip herhangi biri bulunamadi");
        }
    }
    public void sigortaKaydi(){
        System.out.println(isim+" "+soyIsim+" kişiniz sigorta kaydı olusturulmustur...");
    }
    public void dogumGunuPartisi(){
        if ((dogumTarihi.getDayOfMonth()==LocalDate.now().getDayOfMonth())
                &&(dogumTarihi.getMonthValue()==LocalDate.now().getMonthValue())){//27.07.1999-27.07.2024
            System.out.println(isim+" "+soyIsim+" kisinin dogum gunu partisine herkes davetlıdır...");
        }
    }
    public void idAtama(){
        this.id=sayac;
        sayac++;
    }
    public IK(String isim, String soyIsim, String telefon, String adres, String calismaAlani, LocalDate dogumTarihi) {
        idAtama();
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.telefon = telefon;
        this.adres = adres;
        this.calismaAlani = calismaAlani;
        this.dogumTarihi = dogumTarihi;
    }

    // public IK(){
    //     System.out.println("Default cons calisti");
    // }
}