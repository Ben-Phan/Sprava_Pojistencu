/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package cz.itnetwork.projektevidencepojisteni;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Kim
 */
public class ProjektEvidencePojisteni {

    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in, "Windows-1250");
    
    //kolekce pro udržení všech vytvořených Pojistencu
    ArrayList<Pojistenec> databazePojistencu = new ArrayList<>();
   
    
//menu appky
    while (true) {
        System.out.println("____________________________\n");
        System.out.println("Evidence pojištěných");
        System.out.println("____________________________\n");
        
        System.out.println("Vyberte si akci:");
        System.out.println("1 - Přidat nového pojištěného\n2 - Vypsat všechny pojištěné\n3 - Vyhledat pojištěného\n4 - Konec");
        
        //try catch pro případ, že uživatel zadá např. písmeno místo čísla
        try {
            int volba = scanner.nextInt();
            scanner.nextLine();
        
        //hlavní menu voleb, ze kterých scannerem získáváme atributy pro class Pojistenec, nakonec se atributy vloží do databáze a vytvoří se tak nový objekt Pojistenec, atributy jsou čtené ze scanneru
        switch (volba) {
            case 1:
                System.out.println("Zadejte jméno:");
                String jmenoPojistence = scanner.nextLine();
                
                System.out.println("Zadejte příjmení:");
                String prijmeniPojistence = scanner.nextLine();
                
                System.out.println("Zadejte věk:");
                int vekPojistence = scanner.nextInt();
                scanner.nextLine();
                
                System.out.println("Zadejte telefon:");
                String telefonPojistence = scanner.nextLine();
                
                databazePojistencu.add(new Pojistenec(jmenoPojistence, prijmeniPojistence, vekPojistence, telefonPojistence));
                
                System.out.println("Pojištěnec byl v pořádku uložen do databáze. Vyberte další možnost ze seznamu.");
                break;
                
                
            //loop pro vypsání všech osob v ArrayListu
            case 2:
                for (Pojistenec pojisteny : databazePojistencu) {
                    System.out.println(pojisteny);
                }
                
                System.out.println("Vyberte další možnost ze seznamu.");
                break;
                
            case 3:
                System.out.println("Zadejte jméno pojištěného:");
                String najdiJmenoPojistence = scanner.nextLine();
                System.out.println("Zadejte příjmení pojištěného:");
                String najdiPrijmeniPojistence = scanner.nextLine();
                
                boolean nalezeny = false;
                for (Pojistenec pojisteny : databazePojistencu) {
                    if (pojisteny.getJmenoPojistence().equalsIgnoreCase(najdiJmenoPojistence) && pojisteny.getPrijmeniPojistence().equalsIgnoreCase(najdiPrijmeniPojistence)) {
                        System.out.println("Osoba nalezena:\n" + pojisteny);
                        nalezeny = true;
                        }
                }
                    if (!nalezeny) {
                        System.out.println("Osoba není v databázi.");
                    }
                
                
                System.out.println("Vyberte další možnost ze seznamu.");
                break;
                
            case 4:
                System.out.println("Konec");
                scanner.close();
                System.exit(0);
                
            default:
                System.out.println("Neplatná volba. Zvolte prosím volbu ze seznamu.");
        }
        }catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Neplatná volba. Zvolte prosím volbu ze seznamu.");
        }
        }
        
    }
}
