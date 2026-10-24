# Studentski Meni - Java Konzolna Aplikacija

Interaktivna konzolna aplikacija u programskom jeziku Java namijenjena za unos, evidenciju i statističku obradu ocjena studenata.

Projekt objedinjuje osnovne programske strukture: unos podataka, dinamičku alokaciju memorije putem nizova, rad s kontrolnim strukturama (`while`, `switch-case`, `if-else`) te obradu elemenata niza pomoću petlji.

---

## 📌 Funkcionalnosti programa

Program po pokretanju odmah prikazuje glavni navigacijski izbornik s 5 opcija:

1. **Unos ocjena u memoriju**
   - Korisnik definira koliko ocjena želi unijeti.
   - Dinamički se instancira cjelobrojni niz (`int[] ocjene = new int[n]`).
   - Pomoću `for` petlje korisnik redom unosi ocjene koje se spremaju u memoriju.
2. **Prikaz svih ocjena**
   - Jednolinijski, formatirani ispis svih spremljenih ocjena u uglatim zagradama pomoću metode `Arrays.toString(ocjene)`.
   - Sadrži provjeru (`ocjene == null`) koja sprječava ispis ako podaci još nisu uneseni.
3. **Statistika i prosjek**
   - Sumira sve unesene ocjene pomoću `for` petlje.
   - Izračunava aritmetičku sredinu (prosjek) u realnom formatu (`double`).
   - Putem `if-else` grananja evaluira prolaznost: ocjenjuje je li ispit položen (prosjek $\ge 6.0$) ili se mora ponoviti.
4. **Provjera parnosti prosjeka**
   - Zaokružuje prosjek na cijeli broj (`int`).
   - Pomoću modulo operatora (`% 2 == 0`) provjerava i ispisuje je li zaokruženi prosjek paran ili neparan broj.
5. **Izlaz iz programa**
   - Prekida rad `while` petlje postavljanjem kontrolne varijable `kraj = true` i završava izvršavanje programa.

---

## 🛠️ Korišteni koncepti i sintaksa

* **Konzolni unos:** `java.util.Scanner` (`nextInt()`)
* **Usmjeravanje toka i meniji:** `switch-case` uz `break` i `default`
* **Rad s petljama:**
  * `while (!kraj)` – kontinuirani rad menija do korisničkog prekida
  * `for (int i = 0; i < ocjene.length; i++)` – iteracija kroz elemente niza za unos i sumiranje
* **Strukture podataka:** Jednodimenzionalni nizovi (`int[]`), svojstvo `.length` te biblioteka `java.util.Arrays`
* **Logičke provjere i zaštita:** `if (ocjene == null)` zaštita od `NullPointerException` grešaka pri preranom odabiru opcija
* **Operatori:** Aritmetički operatori, modulo operator parnosti (`%`) i relacijski operatori

---

## 🚀 Upute za pokretanje

1. Otvorite projekt u razvojnom okruženju (NetBeans, IntelliJ IDEA ili Eclipse) ili preuzmite datoteku `StudentskiMeni.java`.
2. Pokrenite datoteku (`Run File` ili prečac `Shift + F6` u NetBeans-u).
3. U konzoli odaberite opciju `1` kako biste unijeli željeni broj ocjena, a zatim koristite op
