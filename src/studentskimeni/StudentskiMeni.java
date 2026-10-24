package studentskimeni;

import java.util.Arrays;
import java.util.Scanner;

public class StudentskiMeni {

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        int[] ocjene = null;
        boolean kraj = false;

        while (!kraj) {
            // Prvo se odmah otvara meni
            System.out.println("\n--- STUDENTSKI MENI ---");
            System.out.println("1. Unos ocjena u memoriju");
            System.out.println("2. Prikaz svih ocjena");
            System.out.println("3. Statistika i prosek");
            System.out.println("4. Provera parnosti proseka");
            System.out.println("5. Izlaz");
            System.out.print("Izaberite opciju (1-5): ");
            int opcija = unos.nextInt();

            switch (opcija) {
                case 1:
                    // Tek kad izabere opciju 1, pita koliko ocjena želi
                    System.out.print("Koliki broj ocena zelite da unesete? ");
                    int n = unos.nextInt();
                    ocjene = new int[n]; // pravi niz te veličine

                    for (int i = 0; i < ocjene.length; i++) {
                        System.out.print("Unesite " + (i + 1) + ". ocjenu: ");
                        ocjene[i] = unos.nextInt();
                    }
                    System.out.println("Ocjene su uspjesno sacuvane u memoriju!");
                    break;

                case 2:
                    if (ocjene == null) {
                        System.out.println("Greska: Morate prvo uneti ocjene (izaberite opciju 1)!");
                    } else {
                        System.out.println("Ocjene u memoriji: " + Arrays.toString(ocjene));
                    }
                    break;

                case 3:
                    if (ocjene == null) {
                        System.out.println("Greska: Morate prvo uneti ocjene (izaberite opciju 1)!");
                    } else {
                        double suma = 0;
                        for (int i = 0; i < ocjene.length; i++) {
                            suma += ocjene[i];
                        }
                        double prosek = suma / ocjene.length;
                        System.out.println("Prosek ocjena iznosi: " + prosek);
                        if (prosek >= 6.0) {
                            System.out.println("Status: Polozen ispit!");
                        } else {
                            System.out.println("Status: Student mora ponoviti ispit.");
                        }
                    }
                    break;

                case 4:
                    if (ocjene == null) {
                        System.out.println("Greska: Morate prvo uneti ocjene (izaberite opciju 1)!");
                    } else {
                        double s = 0;
                        for (int i = 0; i < ocjene.length; i++) {
                            s += ocjene[i];
                        }
                        int celiProsek = (int) (s / ocjene.length);
                        if (celiProsek % 2 == 0) {
                            System.out.println("Zaokruzeni prosek (" + celiProsek + ") je paran broj.");
                        } else {
                            System.out.println("Zaokruzeni prosek (" + celiProsek + ") je neparan broj.");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Izlaz iz programa...");
                    kraj = true;
                    break;

                default:
                    System.out.println("Nepostojeca opcija, pokusajte ponovo!");
                    break;
            }
        }
    }
}
