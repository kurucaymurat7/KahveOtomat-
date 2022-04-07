package kahveMakinesi;

public class BoySecimi {
    public BoySecimi() throws InterruptedException {
        if (Variables.hangiKahve != "Turk Kahve") {
            System.out.println("1. Buyuk boy. \n2. Orta boy. \n3. Kucuk boy");
            int secim = Variables.scan.nextInt();
            switch (secim) {
                case 1: {
                    Variables.boyut = "Buyuk Boy"; break;
                }
                case 2: {
                    Variables.boyut = "Orta Boy"; break;
                }
                case 3: {
                    Variables.boyut = "Kucuk Boy"; break;
                }
                default: {
                    System.out.println("Yanlis bir secim yaptiniz. Tekrar deneyiniz. ");
                    break;
                }
            }
            System.out.println(Variables.boyut + " " + Variables.isSugar + " " +
                    Variables.isMilk + " " + Variables.hangiKahve + "'niz hazirlandi.");
        } else {
            System.out.println(Variables.isSugar + " " + Variables.isMilk + " " + Variables.hangiKahve + "'niz hazirlandi.");
        }
        Thread.sleep(3000);
        System.out.println("Afiyet olsun. Tekrar Bekleriz.");
    }
}
