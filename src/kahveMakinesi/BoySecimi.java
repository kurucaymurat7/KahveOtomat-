package kahveMakinesi;

public class BoySecimi {
    public BoySecimi() {
        Variables variables = new Variables();
        System.out.println("1. Buyuk boy. \n2. Orta boy. \n3. Kucuk boy");
        int secim = Variables.scan.nextInt();
        while (true) {
            switch (secim) {
                case 1: {
                    variables.setBoyut("Buyuk Boy");
                    System.out.println(variables.getBoyut() + " " + variables.getIsSugar() + " " +
                            variables.getIsMilk() + " " + variables.getHangiKahve() + "'niz hazirlandi.");
                    System.out.println("Afiyet olsun. Tekrar Bekleriz.");
                    System.exit(0);
                }
                case 2: {
                    variables.setBoyut("Orta Boy");
                    System.out.println(variables.getBoyut() + " " + variables.getIsSugar() + " " +
                            variables.getIsMilk() + " " + variables.getHangiKahve() + "'niz hazirlandi.");
                    System.out.println("Afiyet olsun. Tekrar Bekleriz.");
                    System.exit(0);
                }
                case 3: {
                    variables.setBoyut("Kucuk Boy");
                    System.out.println(variables.getBoyut() + " " + variables.getIsSugar() + " " +
                            variables.getIsMilk() + " " + variables.getHangiKahve() + "'niz hazirlandi.");
                    System.out.println("Afiyet olsun. Tekrar Bekleriz.");
                    System.exit(0);
                }
                default: {
                    System.out.println("Yanlis bir secim yaptiniz. Tekrar deneyiniz. ");
                    BoySecimi boySecimi = new BoySecimi();
                    break;
                }
            }
        }
    }
}
