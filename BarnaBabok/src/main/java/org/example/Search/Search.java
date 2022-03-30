package org.example.Search;

import org.example.control.Processor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {

    public static List search(List<Processor> CompList) {

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

}
