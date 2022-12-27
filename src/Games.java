/**
 * Вариант 2.
 * Класс получения списка.
 */

import java.io.*;
import java.util.ArrayList;

public class Games implements Serializable {

    private ArrayList<Game> games;
    private final static long serialVersionUID = 5265231543584980253L;


    public Games() {
        this.games = new ArrayList<>();
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setResults(ArrayList<Game> games) {
        this.games = games;
    }

    @Override
    public String toString() {
        return "Game Price Comparators {" +
                "games = " + games +
                "}";
    }

    public void add(Game c) {
        games.add(c);
    }

    /**
     * Сортировка по наличию слова в строке.
     */

     public Games filterByTitle(String t) {
        Games temp = new Games();
        for (Game word : this.games) {
            if (word.getTitle().toLowerCase().contains(t.toLowerCase()))
                temp.add(word);
        }
        return temp;
    }



}
