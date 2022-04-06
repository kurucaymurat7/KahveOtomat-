package kahveMakinesi;

import java.util.Scanner;

public class Variables {
    static Scanner scan = new Scanner(System.in);
    public static String hangiKahve;
    public static String isMilk = "Sutsuz";
    public static String isSugar = "Sekersiz";
    public static String boyut = "";

    public static Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        Variables.scan = scan;
    }

    public String getHangiKahve() {
        return hangiKahve;
    }

    public void setHangiKahve(String hangiKahve) {
        Variables.hangiKahve = hangiKahve;
    }

    public String getIsMilk() {
        return isMilk;
    }

    public void setIsMilk(String isMilk) {
        Variables.isMilk = isMilk;
    }

    public String getIsSugar() {
        return isSugar;
    }

    public void setIsSugar(String isSugar) {
        Variables.isSugar = isSugar;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        Variables.boyut = boyut;
    }
}
