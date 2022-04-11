package org.example.Search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.example.model.*;

public class Search {

    public static List searchBrand(List<Componens> CompList) {

        /** Ennek az értéke az UI-ban megadott kereső mezőbe beírt szövegből jön majd. **/
        Scanner scanner = new Scanner(System.in);

        System.out.println("TEST ONLY: Add meg a keresendő komponens nevét:");
        String searchValue = scanner.nextLine(); // Ez lesz a név (pl:. Intel)

        List ResList = new ArrayList(); // Ebben tárolja a keresésnek megfelelő értékeket
        for (int li = 0; li < CompList.size(); li++) {
            if (CompList.get(li).getBrand().equals(searchValue)) {
                ResList.add(CompList.get(li));
            }
        }

        return ResList;
    }

    /** FLAG JELENTÉSE: True esetén - adott árnál kisebb vagy egyenlő | False esetén - adott árnál nagyobb vagy egyenlő **/
    public static List searchPrice(List<Componens> CompList, boolean flag) {

        /** Ennek az értéke az UI-ban megadott kereső mezőbe beírt szövegből jön majd. **/
        Scanner scanner = new Scanner(System.in);

        System.out.println("TEST ONLY: Add meg a keresendő komponens árát (ezzel egyenlő vagy kisebb értékek lesznek visszaadva:");
        double searchValue = scanner.nextDouble(); // Ez lesz az ár (pl:. 625.13)

        List ResList = new ArrayList(); // Ebben tárolja a keresésnek megfelelő értékeket
        if (flag) /** Kisebb vagy egyenlő árral rendelkezőket ad vissza **/
            for (int li = 0; li < CompList.size(); li++) {
                if (CompList.get(li).getPrice() <= searchValue) {
                    ResList.add(CompList.get(li));
                }
            }
        if (!flag) /** Kisebb vagy egyenlő árral rendelkezőket ad vissza **/
            for (int li = 0; li < CompList.size(); li++) {
                if (CompList.get(li).getPrice() >= searchValue) {
                    ResList.add(CompList.get(li));
                }
            }

        return ResList;
    }

}
