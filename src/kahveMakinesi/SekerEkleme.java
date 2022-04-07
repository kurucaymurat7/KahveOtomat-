package kahveMakinesi;

public class SekerEkleme {
    public SekerEkleme() throws InterruptedException {
        System.out.println("Seker eklemek ister misiniz ? (1) EVET / (2) HAYIR");
        int secim = Variables.scan.nextInt();
        if (secim == 1) {
            Variables.isSugar = "Sekerli";
        } else if (secim == 2) {
            Variables.isSugar = "Sekersiz";
        } else {
            System.out.println("Hatali bir secim yaptiniz. Tekrar deneyin. ");
            SekerEkleme sekerEkleme = new SekerEkleme();
        }
        System.out.println(Variables.isSugar + " " + Variables.isMilk + " " +
                Variables.hangiKahve + "'niz hazirlaniyor. Lutfen bekleyin.");
        Thread.sleep(1000);
        BoySecimi boySecimi = new BoySecimi();
    }
}
