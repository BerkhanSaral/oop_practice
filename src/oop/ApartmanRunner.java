package oop;

public class ApartmanRunner {
    public static void main(String[] args) {
        Daire01 daire1=new Daire01("Ali","Can",3,"Amerikan","zemin katta",2,3);
        Daire01 daire2=new Daire01("Veli","Han",4,"Amerikan","zemin katta",2,3);
        Daire02 daire3=new Daire02("Hasan","Ali","1. katta");
        Daire02 daire4=new Daire02("Ömer","Faruk","1. katta");
        //System.out.println(daire1);
        //System.out.println("-------------------");
        //System.out.println(daire2);
        //System.out.println("--------------------");
        //System.out.println(daire3);
        //System.out.println("---------------------");
        //System.out.println(daire4);
        //System.out.println("---------------------");
        daire1.kacinciKat();
        daire1.kapiTuru();
        //System.out.println(daire1.lambaYaniyorMu);
        //daire1.lambaYak();
        //System.out.println(daire1.lambaYaniyorMu);
        //daire1.lambaKapat();
        //System.out.println(daire1.lambaYaniyorMu);//true
        System.out.println(daire1.aidatOdendiMi);//false
        daire1.aidatOde();
        System.out.println(daire1.aidatOdendiMi);//true
        daire1.aidatBilgisi();
    }
}