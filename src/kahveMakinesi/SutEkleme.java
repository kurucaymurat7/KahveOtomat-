package kahveMakinesi;

public class SutEkleme {
    SutEkleme() throws InterruptedException {
        System.out.println("Sut eklemek ister misiniz ? (1) EVET / (2) HAYIR");
        int secim = Variables.scan.nextInt();
        if (secim == 1) {
            Variables.isMilk = "Sutlu";
        } else if (secim == 2) {
            Variables.isMilk = "Sutsuz";
        } else {
            System.out.println("Hatali bir secim yaptiniz. Tekrar deneyin. ");
            SutEkleme sutEkleme = new SutEkleme();
        }
        System.out.println(Variables.isMilk + " " + Variables.hangiKahve + "'niz hazirlaniyor. Lutfen bekleyin");
        Thread.sleep(3000);
        SekerEkleme sekerEkleme = new SekerEkleme();
    }
}
