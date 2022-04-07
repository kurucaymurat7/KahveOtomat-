package kahveMakinesi;

import java.util.Scanner;

public class HangiKahve {

    public HangiKahve() throws InterruptedException {
        System.out.println("Hangi kahveyi istersiniz ? ");
        System.out.println("1.Türk kahvesi\n" +
                "2.Filtre Kahve\n" +
                "3.Espresso");
        System.out.print("Seciminiz : ");
        int secim = Variables.scan.nextInt(); // Variables class'ında public static bir Scanner olusturuldu, ve butun
        // projede aynı Scanner kullanildi.
        switch (secim) {
            case 1: {
                System.out.println("Turk kahvesi secildi. ");
                Variables.hangiKahve = "Turk Kahve";
                SutEkleme sutEkleme = new SutEkleme();
                break;
            }
            case 2: {
                System.out.println("Filtre Kahve secildi. ");
                Variables.hangiKahve = "Filtre Kahve";
                SutEkleme sutEkleme = new SutEkleme();
                break;
            }
            case 3: {
                System.out.println("Espresso kahve secildi. ");
                Variables.hangiKahve = "Espresso Kahve";
                SutEkleme sutEkleme = new SutEkleme();
                break;
            }
            default: {
                System.out.println("Hatali secim yaptiniz. Tekrar deneyin. ");
                HangiKahve hangiKahve = new HangiKahve();
                break;
            }
        }

    }

}
