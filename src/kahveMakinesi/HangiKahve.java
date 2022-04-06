package kahveMakinesi;

public class HangiKahve {

    public HangiKahve() throws InterruptedException {
        Variables variables = new Variables();
        System.out.println("Hangi kahveyi istersiniz ? ");
        System.out.println("1.Türk kahvesi\n" +
                "2.Filtre Kahve\n" +
                "3.Espresso");
        System.out.print("Seciminiz : ");
        int secim = Variables.scan.nextInt();
        while (true) {
            switch (secim) {
                case 1: {
                    System.out.println("Turk kahvesi secildi. ");
                    variables.setHangiKahve("Turk Kahve");
                    SutEkleme sutEkleme = new SutEkleme();
                    break;
                }
                case 2: {
                    System.out.println("Filtre Kahve secildi. ");
                    variables.setHangiKahve("Filtre Kahve");
                    SutEkleme sutEkleme = new SutEkleme();
                    break;
                }
                case 3: {
                    System.out.println("Espresso kahve secildi. ");
                    variables.setHangiKahve("Espresso Kahve");
                    SutEkleme sutEkleme = new SutEkleme ();
                }
                default: {
                    System.out.println("Hatali secim yaptiniz. Tekrar deneyin. ");
                    HangiKahve hangiKahve = new HangiKahve();
                    break;
                }
            }
        }
    }

}
