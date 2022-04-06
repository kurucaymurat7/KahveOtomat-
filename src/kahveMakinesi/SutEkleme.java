package kahveMakinesi;

public class SutEkleme {
    SutEkleme () throws InterruptedException {
        Variables variables = new Variables();
        System.out.println("Sut eklemek ister misiniz ? (1) EVET / (2) HAYIR");
        int secim = Variables.scan.nextInt();
        boolean secildiMi = true;
        while (true) {
            if (secim == 1) {
                variables.setIsMilk("Sutlu");
                System.out.println(variables.getIsMilk() + " " + variables.getHangiKahve() + "'niz hazirlaniyor.");
                Thread.sleep(3000);
                SekerEkleme sekerEkleme = new SekerEkleme();
                secildiMi=false;
            } else if (secim == 2) {
                variables.setIsMilk("Sutsuz");
                System.out.println(variables.getIsMilk() + " " + variables.getHangiKahve() + "'niz hazirlaniyor.");
                Thread.sleep(3000);
                SekerEkleme sekerEkleme = new SekerEkleme();
                secildiMi=false;
            } else {
                System.out.println("Hatali bir secim yaptiniz. Tekrar deneyin. ");
                SutEkleme sutEkleme = new SutEkleme();
            }
        }
    }
}
