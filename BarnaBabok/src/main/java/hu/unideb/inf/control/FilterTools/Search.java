package hu.unideb.inf.control.FilterTools;


public class Search {

    public static boolean contains(String bsm, String keyWord) {
        bsm = bsm.toLowerCase();
        keyWord = keyWord.toLowerCase();

        return bsm.contains(keyWord);
    }

}