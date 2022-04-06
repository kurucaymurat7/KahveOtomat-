package kahveMakinesi;

public class SekerEkleme {
    public SekerEkleme() throws InterruptedException {
        Variables variables = new Variables();
        System.out.println("Seker eklemek ister misiniz ? (1) EVET / (2) HAYIR");
        Variables.scan.nextLine();
        int secim = Variables.scan.nextInt();
        boolean secildiMi = true;
        while (true) {
            if (secim == 1) {
                variables.setIsSugar("Sekerli");
                System.out.println(variables.getIsSugar() + " " + variables.getIsMilk() + " " +
                        variables.getHangiKahve() + "'niz hazirlaniyor.");
                Thread.sleep(1000);
                BoySecimi boySecimi = new BoySecimi();
                secildiMi = false;
            } else if (secim == 2) {
                variables.setIsSugar("Sekersiz");
                System.out.println(variables.getIsSugar() + " " + variables.getIsMilk() + " " +
                        variables.getHangiKahve() + "'niz hazirlaniyor.");
                Thread.sleep(1000);
                BoySecimi boySecimi = new BoySecimi();
                secildiMi = false;
            } else {
                System.out.println("Hatali bir secim yaptiniz. Tekrar deneyin. ");
                SekerEkleme sekerEkleme = new SekerEkleme();
            }
        }
    }
}
