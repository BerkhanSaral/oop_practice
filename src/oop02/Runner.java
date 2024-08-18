package oop02;

import java.time.LocalDate;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Isci isci=new Isci("ali","can","5554443322","Istanbul","Isci", LocalDate.of(2000,5,12),1,2,2000,28,0);
        // System.out.println(isci);
        // isci.izin(3);
        // System.out.println("isci.maas = " + isci.maas);
        // isci.mesai(2);
        // System.out.println("isci.maas = " + isci.maas);
        // isci.saatUcreti(50);
        // System.out.println("isci.maas = " + isci.maas);
        // isci.calismaSaati(10);
        // System.out.println("isci.maas = " + isci.maas);
        Memur memur=new Memur("Veli","Han","5556667788","Ankara",LocalDate.of(1997,4,24),2,8,0,0);
        Memur memur1=new Memur("Veli","Han","5556667788","Ankara",LocalDate.of(1997,4,24),2,8,0,0);
        System.out.println(memur);
        memur.calismaSaati(9);
        System.out.println(memur.maas);
        memur.izin(2);
        System.out.println(memur.maas);
        memur.mesai(11);
        System.out.println(memur.maas);
        memur.saatUcreti(110);
        System.out.println(memur.maas);
        //Scanner input=new Scanner(System.in);
        //System.out.println("Memur olusturmak icin 1 isci olusturmak icin 2");
        //int a= input.nextInt();
        //switch (a){
        //  case 1:
        //     System.out.println("Memurun ismini girin");
        //     String isim=input.nextLine();
        //     //...
        //
        //     Memur memur1=new Memur(isim,soyisim,telefon,adres,dogumTarihi,);
        //}
        //memur.istenCikarma(100);
        memur.iseAlma(memur);
        memur.iseAlma(memur1);
        memur.iseAlma(isci);
        memur.istenCikarma(100);
    }
}
