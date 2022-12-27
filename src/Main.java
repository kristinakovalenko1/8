import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        /**
         * Сайт: https://apidocs.cheapshark.com
         */

        Games games = new Games();
        games = Getter.loadByURL("https://www.cheapshark.com/api/1.0/deals?storeID=1&upperPrice=15");
        System.out.println(games);

        /**
         * Сортировка
         */

        games.getGames().sort(Game.byTitleAsc);
        System.out.println("\nAfter sorting by title:\n" + games);
        games.getGames().sort(Game.byTitleDesc);
        System.out.println("\nAfter sorting by title (reverse):\n" + games);
        games.getGames().sort(Game.byReleaseDateAsc);
        System.out.println("\nAfter sorting by release date:\n" + games);
        games.getGames().sort(Game.byReleaseDateDesc);
        System.out.println("\nAfter sorting by release date (reverse):\n" + games);
        Games withWord = games.filterByTitle("The ");
        System.out.println("\nGames titles with word THE in them:\n" + withWord);
    }
}