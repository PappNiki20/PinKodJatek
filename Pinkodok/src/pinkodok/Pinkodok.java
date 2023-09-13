package pinkodok;

import java.util.Scanner;

public class Pinkodok {

    public static void main(String[] args) {
        String megjegyzett = bekeres();
        belepes(megjegyzett);
        keveres();
    }

    private static String bekeres() {

        Scanner sc = new Scanner(System.in);
        System.out.println("A kód megadása: ");
        String pin = sc.nextLine();

        boolean helyes = pin.length() > 3 && pin.length() < 7;

        while (!helyes) {
            System.out.println("Kód megadása: ");
            pin = sc.nextLine();
            if (pin.length() > 3 && pin.length() < 7) {
                helyes = true;
            }

        }
        return pin;

    }

    private static void belepes(String megjegyzett) {
        String siker = "Sikeres belépés!";
        String sikertelen = "Belépés megtagadva!";
        Scanner sc = new Scanner(System.in);
        int szamlalo = 1;
        System.out.println("Kérem a belépési kódot:" + "(" + szamlalo + "/3)");
        String bekert = sc.nextLine();

        boolean helyes = bekert.equals(megjegyzett);

        while (!helyes && szamlalo < 3) {
            szamlalo++;
            System.out.println("Kérem a belépési kódot:" + "(" + szamlalo + "/3)");
            bekert = sc.nextLine();
            System.out.println("Hibás kód!");

        }
        if (helyes == false) {

            System.out.println(sikertelen);

        } else {
            System.out.println(siker);
        }
    }

    private static void keveres() {
        int[] kevert = {2,5,8,0,1,3,4,6,7,3};
    }
    
}
