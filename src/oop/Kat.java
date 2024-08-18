package oop;

import java.time.LocalTime;

public abstract class Kat extends Apartman{//soyut class--ara class
    public String yanginTupu="Her katta yangın tüpü bulunmaktadır";
    public String pencere="Her katta bir tane pencere bulunmaktadir";

    public abstract void kacinciKat();//method ne yapcagimizi soyler ama iş yapmaz

    public boolean lambaYaniyorMu;

    public static int sayac=0;

    public void pano(){
        System.out.println("Panonun üstünde birkaç fatura bulunuyor");
        System.out.println("Pano üstünde Resmi Evrak ve Uyarılar bulunuyor");
        System.out.println("30.07.2024 Tarihinde apartman toplantısı yapılacaktir!!!");
        System.out.println("Apartman içerisinde cüzdan bulunmuştur kaybeden komşumuz lütfen apartman yoneticisinden alsın");
        System.out.println(".....");
    }


    LocalTime time=LocalTime.now();
    public void lambaYak(){
        if (time.getHour()<6||time.getHour()>19){//19.00-6.00 arasinda yanıcak
            System.out.println("Lamba yaniyor...");
            System.out.println("Lamba yandi.");
            lambaYaniyorMu=true;
        }
    }
    public void lambaKapat(){
        if (time.getHour()>6&&time.getHour()<19){//6.00-19.00 arasinda kapanıcak
            System.out.println("Lamba kapanıyor...");
            System.out.println("Lamba kapandı.");
            lambaYaniyorMu=false;
        }
    }

}